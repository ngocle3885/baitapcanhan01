/**
 * 
 */
package com.dtweb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Thong Nguyen
 *
 */
@Entity
@Table(name = "ADMINISTRATOR", catalog = "sale_watch")
public class Administrator implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8201806810539003686L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@Column(name = "NAME", length = 256)
	private String name;
	
	@Column(name = "USER_NAME", length = 50)
	private String username;
	
	@Column(name = "PASSWORD", length = 50, nullable = false)
	private String password;
	
	@Column(name = "ROLE", length = 50, nullable = false)
	private String role;
	
	@Column(name = "ORD")
	private int ord;
	
	@Column(name = "ACTIVE")
	private int active;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
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
	public Administrator(String name, String username, String password,
			String role, int ord, int active) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
		this.ord = ord;
		this.active = active;
	}
	
	public Administrator() {		
	}
}
