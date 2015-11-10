package com.dtweb.services;

import java.util.List;

import com.dtweb.dto.ProductDTO;
import com.dtweb.model.CommentProduct;
import com.dtweb.model.Menu;
import com.dtweb.model.Product;

public interface ProductService {
	List<Product> getAllProduct();
	
	List<ProductDTO> getAllProductDTO();
	
	Product getProductById(int id);
	
	Product likeProduct(int id);
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	List<CommentProduct> commentProduct(int idProduct,String name,String email,String content);
	
	/**
	 * @author DuongPV1
	 * */
	ProductDTO getProductDTOById(int id);
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	List<ProductDTO> searchProduct(String key);
	
	/**
	 * @author DuongPV1
	 * 
	 * */
	List<ProductDTO> getProductByCate(int cateId);
	
}
