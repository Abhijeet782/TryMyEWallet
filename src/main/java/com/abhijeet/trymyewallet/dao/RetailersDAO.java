package com.abhijeet.trymyewallet.dao;

import com.abhijeet.trymyewallet.model.RetDetails;
import com.abhijeet.trymyewallet.model.RetShopDetails;

public interface RetailersDAO {
	
	public Boolean checkUser(String email);
	public String createRetailer(RetDetails ret);
	public RetDetails getRetailerDetails(String email);
	
	public String createRetShopDetails(RetShopDetails retShop);
}
