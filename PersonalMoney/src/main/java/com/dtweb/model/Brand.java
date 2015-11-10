/**
 * 
 */
package com.dtweb.model;

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

/**
 * @author User
 *
 */
@Entity
@Table(name = "Brand", catalog = "sale_watch")
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	
	@Column(name = "NAME", nullable = false, length = 255)
	private String name;
	
	@Column(name = "LOGO", length = 255)
	private String logo;
	
	@Column(name = "ORD")
	private int ord;
	
	@Column(name = "LANG", length = 5)
	private String lang;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "brand")
	private Set<Product> ProductRecords = new HashSet<Product>(
			0);
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
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
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
	public Brand(int id, String name, String logo, int ord, String lang) {		
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.ord = ord;
		this.lang = lang;
	}
	
	public Brand(String name, String logo, int ord, String lang) {		
		this.name = name;
		this.logo = logo;
		this.ord = ord;
		this.lang = lang;
	}
	
	public Brand() {		
	}
	
	
	
	
	

}
