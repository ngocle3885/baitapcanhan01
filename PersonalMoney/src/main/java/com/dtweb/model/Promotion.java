/**
 * 
 */
package com.dtweb.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author ThongNguyen
 *
 */
@Entity
@Table(name = "promotion", catalog = "sale_watch")
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "CONTENT")
	private String content;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_DATE")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_DATE")
	private Date endDate;
	
	
	@Column(name = "DISCOUNT_PERCENT")
	private float discountPercent;
	
	@Column(name = "DISCOUNT_VALUE")
	private float discountValue;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "ACTIVE")
	private int active;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promo")
	private Set<Product> productRecords = new HashSet<Product>(
			0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotion")
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(
			0);
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
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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
	 * @return the discountPercent
	 */
	public float getDiscountPercent() {
		return discountPercent;
	}
	/**
	 * @param discountPercent the discountPercent to set
	 */
	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}
	/**
	 * @return the discountValue
	 */
	public float getDiscountValue() {
		return discountValue;
	}
	/**
	 * @param discountValue the discountValue to set
	 */
	public void setDiscountValue(float discountValue) {
		this.discountValue = discountValue;
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
	
	
	
	public Promotion(String content, Date startDate, Date endDate,
			float discountPercent, float discountValue,
			String description, int active, Set<OrderDetail> orderDetails) {
		super();
		this.content = content;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discountPercent = discountPercent;
		this.discountValue = discountValue;
		this.description = description;
		this.active = active;
		this.orderDetails = orderDetails;
	}
	public Promotion() {		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
