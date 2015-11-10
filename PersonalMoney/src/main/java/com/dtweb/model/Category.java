/**
 * 
 */
package com.dtweb.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author ThongNguyen
 *
 */
@Entity
@Table(name = "category", catalog = "sale_watch")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@Column(name = "TAG", length = 255)
	private String tag;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Column(name = "LEVEL")
	private Integer level;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "INDEX")
	private Integer index;
	
	@Column(name = "IMAGE", length = 256)
	private String image;
	
	@Column(name = "TITLE", length = 256)
	private String title;
	
	@Column(name = "DESCRIPTION", length = 256)
	private String description;
	
	@Column(name = "KEYWORD")
	private String keyword;
	
	@Column(name = "ACTIVE")
	private Integer active;
	
	@Column(name = "ORD")
	private Integer ord;
	
	@Column(name = "LANG", length = 5)
	private String lang;
	
	@Column(name = "IMAGE2", length = 256)
	private String image2;
	
	@ManyToMany(mappedBy="listCategory")
	private List<Product> products;
	 public Category() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public Integer getOrd() {
		return ord;
	}
	public void setOrd(Integer ord) {
		this.ord = ord;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	 
	
	

}
