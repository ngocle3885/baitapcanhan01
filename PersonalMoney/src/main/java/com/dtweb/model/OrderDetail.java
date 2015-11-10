/**
 * 
 */
package com.dtweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Thong Nguyen
 *
 */

@Entity
@Table(name = "order_detail", catalog = "sale_watch")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", length = 200, nullable = false)
	private int id;	
	
	@ManyToOne
	@JoinColumn(name = "PRO_ID")
	private Product product;
	
	@Column(name = "QUANTITY")
	private int quantity;
	
	@Column(name = "ORIGINAL_PRICE")
	private float originalPrice;
	
	@Column(name = "PAY_PRICE")
	private float payPrice;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "STATUS")
	private int status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PROMO", nullable = false)
	private Promotion promotion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID", nullable = false)
	private Order order;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the originalPrice
	 */
	public float getOriginalPrice() {
		return originalPrice;
	}
	/**
	 * @param originalPrice the originalPrice to set
	 */
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	/**
	 * @return the payPrice
	 */
	public float getPayPrice() {
		return payPrice;
	}
	/**
	 * @param payPrice the payPrice to set
	 */
	public void setPayPrice(float payPrice) {
		this.payPrice = payPrice;
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
	public OrderDetail(Product product, int quantity, float originalPrice,
			float payPrice, Date date, int status, Promotion promotion,
			Order order) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.originalPrice = originalPrice;
		this.payPrice = payPrice;
		this.date = date;
		this.status = status;
		this.promotion = promotion;
		this.order = order;
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
	/**
	 * @return the promotion
	 */
	public Promotion getPromotion() {
		return promotion;
	}
	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	public OrderDetail() {		
	}
	

}
