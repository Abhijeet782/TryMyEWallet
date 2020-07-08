package com.abhijeet.trymyewallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RET_SHOP_DETAILS")
public class RetShopDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RET_SHOP_ID")
	private Integer shopId;
	
	@Column(name="RET_SHOP_NAME")
	private String shopName;
	
	@Column(name="RET_CONTACT")
	private Long contact;
	
	@Column(name="RET_ADDRESS")
	private String address;
	
	@Column(name="RET_CITY")
	private String city;
	
	@Column(name="RET_PINCODE")
	private Integer pincode;
	
	@Column(name="RET_STATE")
	private String state;
	
	@Column(name="RET_BAL")
	private Double balance;

	

	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}	
	
	
}
