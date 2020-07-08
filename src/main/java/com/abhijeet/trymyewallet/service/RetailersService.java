package com.abhijeet.trymyewallet.service;

import com.abhijeet.trymyewallet.model.RetDetails;

public interface RetailersService {

	public String createRetailer(RetDetails ret) throws Exception;
	public RetDetails getRetailerDetails(String email) throws Exception;
}
