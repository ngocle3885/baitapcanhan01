package com.dtweb.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dtweb.common.Utility;
import com.dtweb.converter.impl.ProductConverter;
import com.dtweb.dao.CategoryDao;
import com.dtweb.dao.CommentProductDao;
import com.dtweb.dao.ProductDao;
import com.dtweb.dto.ProductDTO;
import com.dtweb.model.Category;
import com.dtweb.model.CommentProduct;
import com.dtweb.model.Product;
import com.dtweb.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Autowired
	CommentProductDao commentProductDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	
	public List<Product> getAllProduct() {
		return productDao.findAll();
	}

	public Product getProductById(int id) {
		Product p=productDao.findById(id);
		return p;
	}


	public Product likeProduct(int id) {
		Product p=productDao.findById(id);
		int like=p.getAmountLike();
		p.setAmountLike(++like);
		productDao.update(p);			
		return p;
	}




	@Transactional
	public List<ProductDTO> getAllProductDTO() {
		// call to DAO to get all products from table Products.
		List<Product> productsList = productDao.findAll();

		// convert all products to ProductDTO to use in UI.
		List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		for (Product p : productsList) {
			System.out.println("-------------"+p.getListCategory().size());
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(p.getId());
			productDTO.setDescription(p.getDescription());
			productDTO.setTinyImage(p.getTinyImage());
			productDTO.setName(p.getName());
			productDTO.setPrice(p.getPrice());

			if (p.getPromo() != null) {
				Date todayDate = new Date();			

				// check conditions: promotion of product is active
				// AND today must between startDate and EndDate of promote program.
				 if(p.getPromo().getActive() == 1 && todayDate.after(p.getPromo().getStartDate())
						&& todayDate.before(p.getPromo().getEndDate())) {
					float promotePrice = 0;
					if (p.getPromo().getDiscountPercent() > 0) {
						promotePrice = p.getPrice()
								- (p.getPrice() * (p.getPromo().getDiscountPercent()/100));
					} else if (p.getPromo().getDiscountValue() > 0) {
						promotePrice = p.getPrice()
								- p.getPromo().getDiscountValue();
					}					
					productDTO.setPromotePrice(promotePrice);
				}				
			}
			productDTOList.add(productDTO);

		}

		return productDTOList;
	}


	public List<CommentProduct> commentProduct(int idProduct, String name,
			String email, String content) {
		
		Product product=productDao.findById(idProduct);
		CommentProduct cp=null;
		if(product!=null){
			cp=new CommentProduct();
			cp.setName(name);
			cp.setEmail(email);
			cp.setContent(content);
			cp.setActive(1);
			cp.setDate(Utility.getNowDate());
			cp.setPoint(1);
			cp.setProduct(product);
			commentProductDao.create(cp);
		}		
		List<CommentProduct> list =product.getCommentRecords();
		list.add(cp);
		return list;
	}

	private ProductDTO tranferToProductDTO(Product p){
		ProductDTO productDTO = new ProductDTO();
		productDTO.setId(p.getId());
		productDTO.setDescription(p.getDescription());
		productDTO.setTinyImage(p.getTinyImage());
		productDTO.setName(p.getName());
		productDTO.setPrice(p.getPrice());
		productDTO.setBigImage(p.getBigImage());
		productDTO.setTinyImage(p.getTinyImage());
		if (p.getPromo() != null) {
			Date todayDate = new Date();			

			// check conditions: promotion of product is active
			// AND today must between startDate and EndDate of promote program.
			 if(p.getPromo().getActive() == 1 && todayDate.after(p.getPromo().getStartDate())
					&& todayDate.before(p.getPromo().getEndDate())) {
				float promotePrice = 0;
				if (p.getPromo().getDiscountPercent() > 0) {
					promotePrice = p.getPrice()
							- (p.getPrice() * (p.getPromo().getDiscountPercent()/100));
				} else if (p.getPromo().getDiscountValue() > 0) {
					promotePrice = p.getPrice()
							- p.getPromo().getDiscountValue();
				}					
				productDTO.setPromotePrice(promotePrice);
			}				
		}
		return productDTO;
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public ProductDTO getProductDTOById(int id) {
		Product p=productDao.findById(id);
		ProductDTO pDto=tranferToProductDTO(p);
		return pDto;
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	public List<ProductDTO> searchProduct(String key) {
		List<Product> listProduct=productDao.searchProductByName(key);
		ProductConverter pc=new ProductConverter();
		List<ProductDTO> listProductDTO=pc.convertToListProductDTO(listProduct);
		return listProductDTO;
	}

	/**
	 * @author DuongPV1
	 * 
	 * */
	@Transactional
	public List<ProductDTO> getProductByCate(int cateId) {
		Category cate = categoryDao.findById(cateId);
		ProductConverter pc=new ProductConverter();
		List<ProductDTO> listProductDTO=null;
		if(cate!=null){
			listProductDTO=pc.convertToListProductDTO(cate.getProducts());
		}
		return listProductDTO;
	}
}

