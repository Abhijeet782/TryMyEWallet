package com.abhijeet.trymyewallet.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhijeet.trymyewallet.dao.RetailersDAO;
import com.abhijeet.trymyewallet.model.RetDetails;
import com.abhijeet.trymyewallet.validator.RetailerValidator;

@Service(value="retailersService")
@Transactional
public class RetailersServiceImpl implements RetailersService{

	@Autowired
	private RetailersDAO retailersDAO;
	
	@Override
	public String createRetailer(RetDetails ret) throws Exception {

		RetailerValidator.validateRetDetails(ret);
		String message = retailersDAO.createRetailer(ret);
		return message;
	}
	
	@Override
	public RetDetails getRetailerDetails(String email) throws Exception {
		if(!RetailerValidator.validateEmail(email)) {
			throw new Exception("Validator_Email error");
		}
		if(retailersDAO.checkUser(email)) {
			return retailersDAO.getRetailerDetails(email);
		}
		else {
			throw new Exception("User Not Found");
		}
	}

}
