package com.abhijeet.trymyewallet.validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.abhijeet.trymyewallet.entity.RetDetailsEntity;
import com.abhijeet.trymyewallet.model.RetDetails;

public class RetailerValidator {
	
	@Autowired
	private Environment environment;
	
	public static void validateRetDetails(RetDetails retDetails) throws Exception {

		if(!RetailerValidator.validateEmail(retDetails.getEmail())) {
			throw new Exception("Validator_Invalid Email");
			
		}
		if(!RetailerValidator.validatePassword(retDetails.getPassword())) {
			throw new Exception("Validator_Password");
		}
		if(!RetailerValidator.validateMobile(retDetails.getMobile())) {
			throw new Exception("Validator_Mobile");
		}
		if(!RetailerValidator.validateName(retDetails.getName())) {
			throw new Exception("Validator_Name");
		}
		if(!RetailerValidator.validatePan(retDetails.getPan())) {
			throw new Exception("Validator_Pan");
		}
		if(!RetailerValidator.validateAadhaar(retDetails.getAadhaar())) {
			throw new Exception("Validator_Addhar");
		}
		if(!RetailerValidator.validateGst(retDetails.getGst())) {
		   throw new Exception("Validator_Gst");
		}
		
		
		
		
	}

	
	
	public static Boolean validateEmail(String email) {
		if(email!=null && email.matches("[A-Za-z0-9_.]+@[A-Za-z]+[.][A-Za-z]+")) {
			return true;
		}
		return false;
	}
	
	public static Boolean validatePassword(String password) {
		if(password!=null && password.matches(".*[@#$%&].*") &&
								password.matches(".*[A-Z].*") &&
								password.matches(".*[0-9].*") &&
								password.matches(".*[a-z].*") &&
								password.length()>=8 &&
								password.length()<16) {
			return true;
		}
		return false;
	}
	
	public static Boolean validateMobile(String mobile) {
		if(mobile!=null &&mobile.matches("[6789][0-9]{9}")){
			return true;
		}
		return false;
	}
	
	public static Boolean validateName(String name) {
		if(name!=null && name.matches("([A-Za-z])+(\\s[A-Za-z]+)")){
			return true;
		}
		return false;
	}
	
	public static Boolean validatePan(String pan) {
		if(pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")){
			return true;
		}
		return false;
	}
	
	public static Boolean validateAadhaar(String aadhaar) {
		if(aadhaar!=null &&aadhaar.matches("[1-9][0-9]{11}")){
			return true;
		}
		return false;
	}
	
	public static Boolean validateGst(String gst) {
		if(gst!=null && gst.matches("[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]{1}[0-9][A-Z]{2}")){
			return true;
		}
		return false;
	}
	


}
