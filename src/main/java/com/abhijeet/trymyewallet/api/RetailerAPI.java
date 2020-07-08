package com.abhijeet.trymyewallet.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhijeet.trymyewallet.exception.ErrorClass;
import com.abhijeet.trymyewallet.model.RetDetails;
import com.abhijeet.trymyewallet.service.RetailersService;


@CrossOrigin
@RestController
@RequestMapping("retailer/")
public class RetailerAPI {
	
	@Autowired
	private RetailersService retailersService;
	
	@PostMapping
	public ResponseEntity<Object> createRetailer(@RequestBody RetDetails retDetails) throws Exception{
		try {
			String message = retailersService.createRetailer(retDetails);
			return new ResponseEntity<Object>(message,HttpStatus.CREATED);
		}
		catch(Exception e) {
			ErrorClass ec= new ErrorClass();
			if(e.getMessage().contains("Validator"))
			{
				ec.setErrorCode(HttpStatus.BAD_REQUEST.value());
				ec.setErrorMessage(e.getMessage());
			}
			else {
				ec.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
				ec.setErrorMessage(e.getMessage());
			}
			return new ResponseEntity<Object>(ec,HttpStatus.OK);
			
		}
 
	}
	
	@GetMapping(value="getDetails/{email:.*}/")
	public ResponseEntity<Object> getRetailerDetails(@PathVariable("email") String email) {		
		try {
			RetDetails rd  = retailersService.getRetailerDetails(email);
			return new ResponseEntity<Object>(rd,HttpStatus.FOUND);
			
		} catch (Exception e) {
			ErrorClass ec= new ErrorClass();
			if(e.getMessage().contains("Validator"))
			{
				ec.setErrorCode(HttpStatus.BAD_REQUEST.value());
				ec.setErrorMessage(e.getMessage());
			}
			else {
				ec.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
				ec.setErrorMessage(e.getMessage());
			}
			return new ResponseEntity<Object>(ec,HttpStatus.OK);

		}		
	}

}
