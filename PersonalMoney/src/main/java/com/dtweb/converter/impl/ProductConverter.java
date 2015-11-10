/**
 * 
 */
package com.dtweb.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.dtweb.converter.BaseConverter;
import com.dtweb.dto.ProductDTO;
import com.dtweb.model.Product;

/**
 * @author Thong
 *
 */
public class ProductConverter implements BaseConverter<Product, ProductDTO>  {
	
	
	public List<Product> convertFromListProductDTO(List<ProductDTO> listDTO)
	{
		List<Product> listProducts = new ArrayList<Product>();
		if (!listDTO.isEmpty()) {
			for (ProductDTO productDTO: listDTO) {
				listProducts.add(convertFromDTO(productDTO));
			}
		}
		return listProducts;
	}
	
	public List<ProductDTO> convertToListProductDTO(List<Product> listProduct)
	{
		List<ProductDTO> listDTO = new ArrayList<ProductDTO>();
		if (!listProduct.isEmpty()) {
			for (Product entity: listProduct) {
				listDTO.add(convertToDTO(entity));
			}
		}
		return listDTO;
	}

	public Product convertFromDTO(ProductDTO dto) {
		Product entity = new Product();
		if (dto != null) {
			entity.setId(dto.getId());
			entity.setTag(dto.getTag());
			entity.setName(dto.getName());
			entity.setContent(dto.getContent());
			entity.setDetail(dto.getDetail());
			entity.setPriority(dto.getPriority());
			entity.setPrice(dto.getPrice());
			entity.setTinyImage(dto.getTinyImage());
			entity.setBigImage(dto.getBigImage());
			entity.setDateTime(dto.getDateTime());
			entity.setBrand(dto.getBrand());
			entity.setBrandTag(dto.getBrandTag());
			entity.setTitle(dto.getTitle());
			entity.setDescription(dto.getDescription());
			entity.setKeyword(dto.getKeyword());
			entity.setActive(dto.getActive());
			entity.setOrd(dto.getOrd());
			entity.setLang(dto.getLang());
			entity.setImage1(dto.getImage1());
			entity.setImage2(dto.getImage2());
			entity.setImage3(dto.getImage3());
			entity.setImage4(dto.getImage4());
			entity.setImage5(dto.getImage5());
			entity.setCodePro(dto.getCodePro());
			entity.setAmount(dto.getAmount());
			entity.setAmountToBuy(dto.getAmountToBuy());
			entity.setAmountLike(dto.getAmountLike());
			entity.setBeginDate(dto.getBeginDate());
			entity.setEndDate(dto.getEndDate());
			entity.setProperty1(dto.getProperty1());
			entity.setProperty2(dto.getProperty2());
			entity.setProperty3(dto.getProperty3());
			entity.setProperty4(dto.getProperty4());
			entity.setProperty5(dto.getProperty5());
			entity.setProperty6(dto.getProperty6());
			entity.setProperty7(dto.getProperty7());
			entity.setCateTag(dto.getCateTag());
			entity.setCreateUser(dto.getCreateUser());
			entity.setPromo(dto.getPromo());
			entity.setCommentRecords(dto.getCommentProducts());
			entity.setOrderDetails(dto.getOrderDetails());
			
		}
		return entity;
	}

	public ProductDTO convertToDTO(Product entity) {
		ProductDTO productDTO = new ProductDTO();
		if (entity != null) {
			productDTO.setId(entity.getId());
			productDTO.setTag(entity.getTag());
			productDTO.setName(entity.getName());
			productDTO.setContent(entity.getContent());
			productDTO.setDetail(entity.getDetail());
			productDTO.setPriority(entity.getPriority());
			productDTO.setPrice(entity.getPrice());
			productDTO.setTinyImage(entity.getTinyImage());
			productDTO.setBigImage(entity.getBigImage());
			productDTO.setDateTime(entity.getDateTime());
			productDTO.setBrand(entity.getBrand());
			productDTO.setBrandTag(entity.getBrandTag());
			productDTO.setTitle(entity.getTitle());
			productDTO.setDescription(entity.getDescription());
			productDTO.setKeyword(entity.getKeyword());
			productDTO.setActive(entity.getActive());
			productDTO.setOrd(entity.getOrd());
			productDTO.setLang(entity.getLang());
			productDTO.setImage1(entity.getImage1());
			productDTO.setImage2(entity.getImage2());
			productDTO.setImage3(entity.getImage3());
			productDTO.setImage4(entity.getImage4());
			productDTO.setImage5(entity.getImage5());
			productDTO.setCodePro(entity.getCodePro());
			productDTO.setAmount(entity.getAmount());
			productDTO.setAmountToBuy(entity.getAmountToBuy());
			productDTO.setAmountLike(entity.getAmountLike());
			productDTO.setBeginDate(entity.getBeginDate());
			productDTO.setEndDate(entity.getEndDate());
			productDTO.setProperty1(entity.getProperty1());
			productDTO.setProperty2(entity.getProperty2());
			productDTO.setProperty3(entity.getProperty3());
			productDTO.setProperty4(entity.getProperty4());
			productDTO.setProperty5(entity.getProperty5());
			productDTO.setProperty6(entity.getProperty6());
			productDTO.setProperty7(entity.getProperty7());
			productDTO.setCateTag(entity.getCateTag());
			productDTO.setCreateUser(entity.getCreateUser());
			productDTO.setPromo(entity.getPromo());
			productDTO.setCommentProducts(entity.getCommentRecords());
			productDTO.setOrderDetails(entity.getOrderDetails());
			
		}
		return productDTO;
	}
	
	

	

	
	

	

}
