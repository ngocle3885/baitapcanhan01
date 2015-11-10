package com.dtweb.services.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtweb.common.Utility;
import com.dtweb.dao.OrderDao;
import com.dtweb.dao.OrderDetailDao;
import com.dtweb.dao.impl.OrderDaoImpl;
import com.dtweb.dto.CartDTO;
import com.dtweb.dto.CustomerDTO;
import com.dtweb.dto.ProductDTO;
import com.dtweb.model.Order;
import com.dtweb.model.OrderDetail;
import com.dtweb.model.Product;
import com.dtweb.model.Promotion;
import com.dtweb.services.CartService;
import com.dtweb.services.ProductService;

@Service
public class CartServiceImpl implements CartService {
	public static final String CART="cartContain";
	@Autowired
	ProductService productService;
	
	@Autowired
	OrderDao orderDao;
	
	@Autowired
	OrderDetailDao orderDetailDao;
	HttpSession session;
	
	CartDTO cart;
	
	private final int NOT_SHIP_NOT_PAY=1;
	
	public CartServiceImpl() {
		
	}
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	public void addCart(int id, int quantity) {
		ProductDTO product=productService.getProductDTOById(id);
		if(product != null){
			int newQuan=0;
			if(cart.getListProduct().containsKey(product)){
				int oldQuan=cart.getListProduct().get(product);
				newQuan=oldQuan+quantity;
			}else{
				newQuan=quantity;
			}
			cart.getListProduct().put(product, newQuan);
		}
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void removeCart(int id) {
		ProductDTO product=productService.getProductDTOById(id);
		cart.getListProduct().remove(product);
	}
	
	

	public void payment() {
		// TODO Auto-generated method stub

	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
		getCart();
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void getCart() {
		if(session!=null){
			cart=(CartDTO)session.getAttribute("cartContain");
			if(cart==null){
				cart=new CartDTO();
				session.setAttribute("cartContain", cart);
			}
		}
	}

	public void setCart(CartDTO cart) {
		this.cart = cart;
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void changeQuantity(int id, int quantity) {
		ProductDTO product=productService.getProductDTOById(id);
		if(product!=null){
			cart.getListProduct().put(product, quantity);
		}
	}

	public CartDTO getCartDTO() {
		return this.cart;
	}

	/**
	 * @author DuongPV1
	 *  
	 * 
	 * */
	public void update(HttpServletRequest request) {
		Map<ProductDTO,Integer> map=cart.getListProduct();
		for(ProductDTO p:map.keySet()){
			int newValue=Integer.parseInt(request.getParameter(p.getId()+""));
			map.put(p,newValue);
		}
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public boolean checkEmptyCart() {
		if(cart.getListProduct().isEmpty()){
			return true;
		}
		return false;
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public void order(CustomerDTO customer){
		Order order=new Order();
		order.setCusAddress(customer.getAddress());
		order.setCusAddressShip(customer.getAddress());
		order.setCusName(customer.getName());
		order.setCusPhone(customer.getPhone());
		order.setCode("#1231231232");
		order.setCusEmail("fuck");
		order.setDate(Utility.getNowDate());
		order.setStatus(NOT_SHIP_NOT_PAY);
		orderDao.create(order);
		Map<ProductDTO,Integer> map = cart.getListProduct();
		for(ProductDTO p:map.keySet()){
			Product pro=productService.getProductById(p.getId());
			Promotion promotion=pro.getPromo();
			OrderDetail orderDetail=new OrderDetail();
			orderDetail.setOrder(order);
			orderDetail.setProduct(pro);
			orderDetail.setPromotion(promotion);
			orderDetail.setQuantity(map.get(p));
			orderDetail.setDate(Utility.getNowDate());
			orderDetail.setOriginalPrice(p.getPrice());
			if(p.getPromotePrice()==0){
				orderDetail.setPayPrice(p.getPrice());
			}else{
				orderDetail.setPayPrice(p.getPromotePrice());
			}
			orderDetail.setStatus(NOT_SHIP_NOT_PAY);
			orderDetailDao.create(orderDetail);
			session.setAttribute(CART, null);
		}
	}

	
	
	
}
