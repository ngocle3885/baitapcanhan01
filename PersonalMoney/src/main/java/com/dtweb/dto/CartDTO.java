package com.dtweb.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class CartDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5884903946331393196L;
	Map<ProductDTO,Integer> listProduct;
	int totalPrice;
	
	public CartDTO() {
		listProduct=new HashMap<ProductDTO, Integer>();
	}

	public int getTotalPrice() {
		totalPrice=0;
		for(ProductDTO p:listProduct.keySet()){
			if(p.getPromotePrice()==0){
				totalPrice+=p.getPrice()*listProduct.get(p);
			}else{
				totalPrice+=p.getPromotePrice()*listProduct.get(p);
			}
		}
		
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Map<ProductDTO, Integer> getListProduct() {
		return listProduct;
	}

	public void setListProduct(Map<ProductDTO, Integer> listProduct) {
		this.listProduct = listProduct;
	}

	
	
	
}
