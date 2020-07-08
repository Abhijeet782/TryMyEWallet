package com.abhijeet.trymyewallet.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abhijeet.trymyewallet.entity.RetDetailsEntity;
import com.abhijeet.trymyewallet.entity.RetShopDetailsEntity;
import com.abhijeet.trymyewallet.model.RetDetails;
import com.abhijeet.trymyewallet.model.RetShopDetails;

@Repository(value="retailersDAO")
public class RetailersDAOImpl implements RetailersDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Boolean checkUser(String email) {
		RetDetailsEntity details = entityManager.find(RetDetailsEntity.class, email);
		if(details!=null) {
			return true;
		}
		return false;
	}
	
	
	@Override
	public String createRetailer(RetDetails ret) {
	RetDetailsEntity retDetailsEntity = new RetDetailsEntity();
	retDetailsEntity.setEmail(ret.getEmail());
	retDetailsEntity.setPassword(ret.getPassword());
	retDetailsEntity.setEnabled(0);
	retDetailsEntity.setName(ret.getName());
	retDetailsEntity.setMobile(ret.getMobile());
	retDetailsEntity.setRole(ret.getRole());
	retDetailsEntity.setPan(ret.getPan());
	retDetailsEntity.setAadhaar(ret.getAadhaar());
	retDetailsEntity.setGst(ret.getGst());
	
	RetShopDetailsEntity retShopEntity=new RetShopDetailsEntity();
	retShopEntity.setAddress(ret.getShopId().getAddress());
	retShopEntity.setBalance(ret.getShopId().getBalance());
	retShopEntity.setShopId(ret.getShopId().getShopId());
	retShopEntity.setCity(ret.getShopId().getCity());
	retShopEntity.setPincode(ret.getShopId().getPincode());
	retShopEntity.setShopName(ret.getShopId().getShopName());
	retShopEntity.setState(ret.getShopId().getState());
	retShopEntity.setContact(ret.getShopId().getContact());
	retDetailsEntity.setShopId(null);
	
	entityManager.persist(retDetailsEntity);
	String message="Retailer created successfully";
	return message;
	}

	@Override
	public RetDetails getRetailerDetails(String email) {
		RetDetailsEntity details = entityManager.find(RetDetailsEntity.class, email);
		RetDetails rt=new RetDetails();
		rt.setEmail(details.getEmail());
		rt.setMobile(details.getMobile());
		rt.setAadhaar(details.getAadhaar());
		rt.setGst(details.getGst());
		rt.setEnabled(details.getEnabled());
		rt.setMobile(details.getMobile());
		rt.setName(details.getName());
		rt.setPan(details.getPan());
		rt.setPassword(details.getPassword());
		rt.setRole(details.getRole());
		return rt;
	}


	@Override
	public String createRetShopDetails(RetShopDetails retShop) {
		RetShopDetailsEntity retShopEntity = new RetShopDetailsEntity();
		retShopEntity.setShopId(retShop.getShopId());
		retShopEntity.setShopName(retShop.getShopName());
		retShopEntity.setContact(retShop.getContact());
		retShopEntity.setAddress(retShop.getAddress());
		retShopEntity.setBalance(retShop.getBalance());
		retShopEntity.setCity(retShop.getCity());
		retShopEntity.setState(retShop.getState());
	
		String message="Retailer Shop Added Successfully";
		return message;
	}

	

}
