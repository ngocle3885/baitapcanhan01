package com.dtweb.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.dtweb.model.Brand;
import com.dtweb.model.Category;
import com.dtweb.model.CommentProduct;
import com.dtweb.model.OrderDetail;
import com.dtweb.model.Promotion;

/**
 * @author Thong 
 *
 */
public class ProductDTO implements Serializable {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3603722092095181898L;

	private int id;	
	
	private String tag;	
	
	private String name;
	
	private String content;
	
	private String detail;
	
	private int priority;
	
	
	private float price;
	
	private String tinyImage;
	
	private String bigImage;
	
	private Date dateTime;
	
	private Brand brand;
	
	private int brandTag;
	
	
	/**
	 * @return the brandTag
	 */
	public int getBrandTag() {
		return brandTag;
	}

	/**
	 * @param brandTag the brandTag to set
	 */
	public void setBrandTag(int brandTag) {
		this.brandTag = brandTag;
	}


	private String title;
	
	private String description;
	
	private String keyword;
	
	private int active;
	
	private int ord;
	
	private String lang;
	
	
	private String image1;
	
	private String image2;
	
	private String image3;
	
	private String image4;
	
	private String image5;
	
	private String codePro;
	
	private int amount;
	
	private int amountToBuy;
	
	private int amountLike;
	
	private Date beginDate;
	
	private Date endDate;
	
	private String property1;
	
	private String property2;
	
	private String property3;
	
	private String property4;
	
	private String property5;
	
	private String property6;
	
	private String property7;
	
	private Category category;
	
	private String cateTag;
	
	private String createUser;
	
	private Date createDate;	
	
	
	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the promo
	 */
	public Promotion getPromo() {
		return promo;
	}

	/**
	 * @param promo the promo to set
	 */
	public void setPromo(Promotion promo) {
		this.promo = promo;
	}

	/**
	 * @return the commentProducts
	 */
	public List<CommentProduct> getCommentProducts() {
		return commentProducts;
	}

	/**
	 * @param commentProducts the commentProducts to set
	 */
	public void setCommentProducts(List<CommentProduct> commentProducts) {
		this.commentProducts = commentProducts;
	}

	/**
	 * @return the orderDetails
	 */
	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	/**
	 * @param orderDetails the orderDetails to set
	 */
	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}


	private float promotePrice;
	
	private Promotion promo;
	
	private List<CommentProduct> commentProducts;
	
	private Set<OrderDetail> orderDetails;
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the tinyImage
	 */
	public String getTinyImage() {
		return tinyImage;
	}

	/**
	 * @param tinyImage the tinyImage to set
	 */
	public void setTinyImage(String tinyImage) {
		this.tinyImage = tinyImage;
	}

	/**
	 * @return the bigImage
	 */
	public String getBigImage() {
		return bigImage;
	}

	/**
	 * @param bigImage the bigImage to set
	 */
	public void setBigImage(String bigImage) {
		this.bigImage = bigImage;
	}

	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * @return the active
	 */
	public int getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(int active) {
		this.active = active;
	}

	/**
	 * @return the ord
	 */
	public int getOrd() {
		return ord;
	}

	/**
	 * @param ord the ord to set
	 */
	public void setOrd(int ord) {
		this.ord = ord;
	}

	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

	/**
	 * @return the image1
	 */
	public String getImage1() {
		return image1;
	}

	/**
	 * @param image1 the image1 to set
	 */
	public void setImage1(String image1) {
		this.image1 = image1;
	}

	/**
	 * @return the image2
	 */
	public String getImage2() {
		return image2;
	}

	/**
	 * @param image2 the image2 to set
	 */
	public void setImage2(String image2) {
		this.image2 = image2;
	}

	/**
	 * @return the image3
	 */
	public String getImage3() {
		return image3;
	}

	/**
	 * @param image3 the image3 to set
	 */
	public void setImage3(String image3) {
		this.image3 = image3;
	}

	/**
	 * @return the image4
	 */
	public String getImage4() {
		return image4;
	}

	/**
	 * @param image4 the image4 to set
	 */
	public void setImage4(String image4) {
		this.image4 = image4;
	}

	/**
	 * @return the image5
	 */
	public String getImage5() {
		return image5;
	}

	/**
	 * @param image5 the image5 to set
	 */
	public void setImage5(String image5) {
		this.image5 = image5;
	}

	/**
	 * @return the codePro
	 */
	public String getCodePro() {
		return codePro;
	}

	/**
	 * @param codePro the codePro to set
	 */
	public void setCodePro(String codePro) {
		this.codePro = codePro;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the amountToBuy
	 */
	public int getAmountToBuy() {
		return amountToBuy;
	}

	/**
	 * @param amountToBuy the amountToBuy to set
	 */
	public void setAmountToBuy(int amountToBuy) {
		this.amountToBuy = amountToBuy;
	}

	/**
	 * @return the amountLike
	 */
	public int getAmountLike() {
		return amountLike;
	}

	/**
	 * @param amountLike the amountLike to set
	 */
	public void setAmountLike(int amountLike) {
		this.amountLike = amountLike;
	}

	/**
	 * @return the beginDate
	 */
	public Date getBeginDate() {
		return beginDate;
	}

	/**
	 * @param beginDate the beginDate to set
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the property1
	 */
	public String getProperty1() {
		return property1;
	}

	/**
	 * @param property1 the property1 to set
	 */
	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	/**
	 * @return the property2
	 */
	public String getProperty2() {
		return property2;
	}

	/**
	 * @param property2 the property2 to set
	 */
	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	/**
	 * @return the property3
	 */
	public String getProperty3() {
		return property3;
	}

	/**
	 * @param property3 the property3 to set
	 */
	public void setProperty3(String property3) {
		this.property3 = property3;
	}

	/**
	 * @return the property4
	 */
	public String getProperty4() {
		return property4;
	}

	/**
	 * @param property4 the property4 to set
	 */
	public void setProperty4(String property4) {
		this.property4 = property4;
	}

	/**
	 * @return the property5
	 */
	public String getProperty5() {
		return property5;
	}

	/**
	 * @param property5 the property5 to set
	 */
	public void setProperty5(String property5) {
		this.property5 = property5;
	}

	/**
	 * @return the property6
	 */
	public String getProperty6() {
		return property6;
	}

	/**
	 * @param property6 the property6 to set
	 */
	public void setProperty6(String property6) {
		this.property6 = property6;
	}

	/**
	 * @return the property7
	 */
	public String getProperty7() {
		return property7;
	}

	/**
	 * @param property7 the property7 to set
	 */
	public void setProperty7(String property7) {
		this.property7 = property7;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the cateTag
	 */
	public String getCateTag() {
		return cateTag;
	}

	/**
	 * @param cateTag the cateTag to set
	 */
	public void setCateTag(String cateTag) {
		this.cateTag = cateTag;
	}

	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	/**
	 * @return the promotePrice
	 */
	public float getPromotePrice() {
		return promotePrice;
	}

	/**
	 * @param promotePrice the promotePrice to set
	 */
	public void setPromotePrice(float promotePrice) {
		this.promotePrice = promotePrice;
	}
	
	@Override
	public boolean equals(Object obj) {
		ProductDTO pro=(ProductDTO)obj;
		if(pro.getId()==this.id){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"tag\":\"" + tag + "\", \"name\":\""
				+ name + "\", \"content\":\"" + content + "\", \"detail\":\""
				+ detail + "\", \"priority\":\"" + priority
				+ "\", \"price\":\"" + price + "\", \"tinyImage\":\""
				+ tinyImage + "\", \"bigImage\":\"" + bigImage
				+ "\", \"dateTime\":\"" + dateTime + "\", \"brand\":\"" + brand
				+ "\", \"brandTag\":\"" + brandTag + "\", \"title\":\"" + title
				+ "\", \"description\":\"" + description + "\", \"keyword\":\""
				+ keyword + "\", \"active\":\"" + active + "\", \"ord\":\""
				+ ord + "\", \"lang\":\"" + lang + "\", \"image1\":\"" + image1
				+ "\", \"image2\":\"" + image2 + "\", \"image3\":\"" + image3
				+ "\", \"image4\":\"" + image4 + "\", \"image5\":\"" + image5
				+ "\", \"codePro\":\"" + codePro + "\", \"amount\":\"" + amount
				+ "\", \"amountToBuy\":\"" + amountToBuy
				+ "\", \"amountLike\":\"" + amountLike + "\", \"beginDate\":\""
				+ beginDate + "\", \"endDate\":\"" + endDate
				+ "\", \"property1\":\"" + property1 + "\", \"property2\":\""
				+ property2 + "\", \"property3\":\"" + property3
				+ "\", \"property4\":\"" + property4 + "\", \"property5\":\""
				+ property5 + "\", \"property6\":\"" + property6
				+ "\", \"property7\":\"" + property7 + "\", \"category\":\""
				+ category + "\", \"cateTag\":\"" + cateTag
				+ "\", \"createUser\":\"" + createUser
				+ "\", \"createDate\":\"" + createDate
				+ "\", \"promotePrice\":\"" + promotePrice + "\", \"promo\":\""
				+ promo + "\", \"commentProducts\":\"" + commentProducts
				+ "\", \"orderDetails\":\"" + orderDetails + "\"}";
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	/**
	 * Default constructor.
	 */
	public ProductDTO() {
		
	}

}
