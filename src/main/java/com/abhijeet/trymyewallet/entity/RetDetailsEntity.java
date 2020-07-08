package com.abhijeet.trymyewallet.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "RET_DETAILS")
public class RetDetailsEntity {

	@Id
	@Column(name="RET_EMAIL")
	//@Email(message="Email is not Proper")
	private String email;
	
	@Column(name="RET_PASSWORD")
	//@Pattern(regexp ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}")
	private String password;
	
	@Column(name="RET_ENABLED")
	//@Min(value = 0)
	//@Max(value = 1)
	private Integer enabled;
	
	@Column(name="RET_NAME")
	//@Pattern(regexp = "([A-Za-z])+([A-Za-z]+)*")
	private String name;
	
	@Column(name="RET_MOBILE")
	//@Pattern(regexp = "[7-9][0-9]{9}")
	private String mobile;
	
	@Column(name="RET_ROLE")
	//@Pattern(regexp="[A-Z][a-z]{0,9}")
	private String role;
	
	@Column(name="RET_PAN")
	private String pan;
	
	@Column(name="RET_AADHAAR")
	private String aadhaar;
	
	@Column(name="RET_GST")
	private String gst;
	
	@OneToOne(cascade = CascadeType.ALL	)
	@JoinColumn(name="RET_SHOP_ID")
	private RetShopDetailsEntity retShopDetailsEntity;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public RetShopDetailsEntity getShopId() {
		return retShopDetailsEntity;
	}
	public void setShopId(RetShopDetailsEntity retShopDetailsEntity) {
		this.retShopDetailsEntity = retShopDetailsEntity;
	}
	
	
	
	
	
	
}
