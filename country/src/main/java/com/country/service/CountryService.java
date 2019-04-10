package com.country.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.country.DAO.CountryDAO;
import com.country.model.Country;
import com.outputresponse.Outputresponse;

@Service
public class CountryService {
	
	@Autowired
	private CountryDAO countryDAO;
	
	public Outputresponse save(Country country) {
		Outputresponse response = new Outputresponse(500, "failure");
		response.setData(countryDAO.saveCountry(country));
		response.setMessage("Successfully saved");
		response.setStatusCode(200);
		return response;
	}

	public Outputresponse update(Country country) {
		Outputresponse response = new Outputresponse(500, "failure");
		response.setData(countryDAO.updateCountry(country));
		response.setMessage("Successfully updated");
		response.setStatusCode(200);
		return response;
	}

	
	public Outputresponse getCountries() {
		Outputresponse response = new Outputresponse(500, "failure");
		response.setData(countryDAO.getCountries());
		response.setMessage("Successfully fetched data");
		response.setStatusCode(200);
		return response;
	}


}
