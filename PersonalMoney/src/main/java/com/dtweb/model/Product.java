/**
 * 
 */
package com.dtweb.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Thong Nguyen
 *
 */
@Entity
@Table(name = "products", catalog = "sale_watch")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "TAG")
	private String tag;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CONTENT")
	private String content;

	@Column(name = "DETAIL")
	private String detail;

	@Column(name = "PRIORITY")
	private int priority;

	@Column(name = "PRICE")
	private float price;

	@Column(name = "TINYIMAGE")
	private String tinyImage;

	@Column(name = "BIGIMAGE")
	private String bigImage;

	@Column(name = "DATE")
	private Date dateTime;

	@ManyToOne
	@JoinColumn(name = "BRAND_ID")
	private Brand brand;

	@Column(name = "BRAND_TAG")
	private int brandTag;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "KEYWORD")
	private String keyword;

	@Column(name = "IS_ACTIVE")
	private int active;

	@Column(name = "ORD")
	private int ord;

	@Column(name = "LANG")
	private String lang;

	@Column(name = "IMAGE1")
	private String image1;

	@Column(name = "IMAGE2")
	private String image2;

	@Column(name = "IMAGE3")
	private String image3;

	@Column(name = "IMAGE4")
	private String image4;

	@Column(name = "IMAGE5")
	private String image5;

	@Column(name = "CODE_PRO")
	private String codePro;

	@Column(name = "NUMBER")
	private int amount;

	@Column(name = "SELL_NUMBER")
	private int amountToBuy;

	@Column(name = "LIKE_NUMBER")
	private int amountLike;

	@Column(name = "EFFECTIVE_DATE")
	private Date beginDate;

	@Column(name = "EXPIRE_DATE")
	private Date endDate;

	@Column(name = "PROPERTY1")
	private String property1;

	@Column(name = "PROPERTY2")
	private String property2;

	@Column(name = "PROPERTY3")
	private String property3;

	@Column(name = "PROPERTY4")
	private String property4;

	@Column(name = "PROPERTY5")
	private String property5;

	@Column(name = "PROPERTY6")
	private String property6;

	@Column(name = "PROPERTY7")
	private String property7;

	
	@Column(name = "CATE_TAG")
	private String cateTag;

	@Column(name = "CREATED_USER")
	private String createUser;

	/**
	 * @return the modifiedDate
	 */
	public String getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "CREATED_DATE")
	private Date createDate;
	
	@Column(name = "MODIFIED_DATE")
	private String modifiedDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PROMO_ID")
	private Promotion promo;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "product")
	private List<CommentProduct> commentRecords;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="product_category", joinColumns = @JoinColumn(name = "product_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "cate_id", nullable = false))
	private List<Category> listCategory;
	
	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	/**
	 * @return the id
	 */
	public int getId() {

		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param tag
	 *            the tag to set
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
	 * @param name
	 *            the name to set
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
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @param content
	 *            the content to set
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
	 * @param detail
	 *            the detail to set
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
	 * @param price
	 *            the price to set
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
	 * @param tinyImage
	 *            the tinyImage to set
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
	 * @param bigImage
	 *            the bigImage to set
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
	 * @param dateTime
	 *            the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the brandTag
	 */
	public int getBrandTag() {
		return brandTag;
	}

	/**
	 * @param brandTag
	 *            the brandTag to set
	 */
	public void setBrandTag(int brandTag) {
		this.brandTag = brandTag;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
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
	 * @param description
	 *            the description to set
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
	 * @param keyword
	 *            the keyword to set
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
	 * @param active
	 *            the active to set
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
	 * @param ord
	 *            the ord to set
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
	 * @param lang
	 *            the lang to set
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
	 * @param image1
	 *            the image1 to set
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
	 * @param image2
	 *            the image2 to set
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
	 * @param image3
	 *            the image3 to set
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
	 * @param image4
	 *            the image4 to set
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
	 * @param image5
	 *            the image5 to set
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
	 * @param codePro
	 *            the codePro to set
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
	 * @param amount
	 *            the amount to set
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
	 * @param amountToBuy
	 *            the amountToBuy to set
	 */
	public void setAmountToBuy(int amountToBuy) {
		this.amountToBuy = amountToBuy;
	}

	/**
	 * @return the amount_like
	 */
	public int getAmountLike() {
		return amountLike;
	}

	/**
	 * @param amount_like
	 *            the amount_like to set
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
	 * @param beginDate
	 *            the beginDate to set
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
	 * @param endDate
	 *            the endDate to set
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
	 * @param property1
	 *            the property1 to set
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
	 * @param property2
	 *            the property2 to set
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
	 * @param property3
	 *            the property3 to set
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
	 * @param property4
	 *            the property4 to set
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
	 * @param property5
	 *            the property5 to set
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
	 * @param property6
	 *            the property6 to set
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
	 * @param property7
	 *            the property7 to set
	 */
	public void setProperty7(String property7) {
		this.property7 = property7;
	}

	/**
	 * @return the cateTag
	 */
	public String getCateTag() {
		return cateTag;
	}

	/**
	 * @param cateTag
	 *            the cateTag to set
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
	 * @param createUser
	 *            the createUser to set
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
	 * @param createDate
	 *            the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	

	public List<CommentProduct> getCommentRecords() {
		return commentRecords;
	}

	public void setCommentRecords(List<CommentProduct> commentRecords) {
		this.commentRecords = commentRecords;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	/**
	 * @return the promo
	 */
	public Promotion getPromo() {
		return promo;
	}

	/**
	 * @param promo
	 *            the promo to set
	 */
	public void setPromo(Promotion promo) {
		this.promo = promo;
	}

	public Product() {
	}

}
