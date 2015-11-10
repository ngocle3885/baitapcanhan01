/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Thong Nguyen
 *
 */
@Entity
@Table(name = "commentproduct", catalog = "sale_watch")
public class CommentProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "PRO_ID", nullable = false)
	private Product product;
	
	@Column(name = "NAME", nullable = false, length = 256)
	private String name;
	
	@Column(name = "EMAIL", nullable = false, length = 256)
	private String email;
	
	@Column(name = "POINT")
	private Integer point;
	
	@Column(name = "CONTENT", nullable = false)
	private String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE", nullable = false)
	private Date date;
	
	@Column(name = "ACTIVE")
	private int active;
	
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the point
	 */
	public Integer getPoint() {
		return point;
	}
	/**
	 * @param point the point to set
	 */
	public void setPoint(Integer point) {
		this.point = point;
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
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
	
	public CommentProduct(Product product, String name, String email,
			int point, String content, Date date, int active) {
		super();
		this.product = product;
		this.name = name;
		this.email = email;
		this.point = point;
		this.content = content;
		this.date = date;
		this.active = active;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	public CommentProduct() {		
	}
	
	
}
