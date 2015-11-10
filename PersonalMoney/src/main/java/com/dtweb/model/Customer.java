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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Thong Nguyen
 *
 */
@Entity
@Table(name = "CUSTOMERS", catalog = "sale_watch")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@Column(name = "NAME", unique = true, nullable = false, length = 256)	
	private String name;
	
	@NotEmpty
	@Size(min = 1, max = 64)
	@Column(name = "USERNAME", unique = true, nullable = false, length = 64)
	private String username;
	
	@NotEmpty
	@Size(min = 1, max = 20)
	@Column(name = "PASSWORD", unique = false, nullable = false, length = 20)
	private String password;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDAY")
	private Date birthday;
	
	@Column(name = "PROVINCE", length = 100)
	private String province;
	
	@Column(name = "CUS_PHONE", length = 100)
	private String cusPhone;
	
	@Column(name = "CUS_EMAIL", length = 100)
	private String cusEmail;
	
	@Column(name = "CUS_ADDRESS", length = 200)
	private String cusAddress;
	
	@Column(name = "CUS_ADDRESS_SHIP", length = 200)
	private String cusAddressShip;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CREATE")
	private Date createDate;
	
	@Column(name = "ACTIVE")
	private int active = 1;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the cusPhone
	 */
	public String getCusPhone() {
		return cusPhone;
	}
	/**
	 * @param cusPhone the cusPhone to set
	 */
	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	/**
	 * @return the cusEmail
	 */
	public String getCusEmail() {
		return cusEmail;
	}
	/**
	 * @param cusEmail the cusEmail to set
	 */
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	/**
	 * @return the cusAddress
	 */
	public String getCusAddress() {
		return cusAddress;
	}
	/**
	 * @param cusAddress the cusAddress to set
	 */
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	/**
	 * @return the cusAddressShip
	 */
	public String getCusAddressShip() {
		return cusAddressShip;
	}
	/**
	 * @param cusAddressShip the cusAddressShip to set
	 */
	public void setCusAddressShip(String cusAddressShip) {
		this.cusAddressShip = cusAddressShip;
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
	public Customer(String name, String username, String password,
			Date birthday, String province, String cusPhone, String cusEmail,
			String cusAddress, String cusAddressShip, Date createDate,
			int active) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.birthday = birthday;
		this.province = province;
		this.cusPhone = cusPhone;
		this.cusEmail = cusEmail;
		this.cusAddress = cusAddress;
		this.cusAddressShip = cusAddressShip;
		this.createDate = createDate;
		this.active = active;
	}
	
	public Customer() {
		
	}
}
