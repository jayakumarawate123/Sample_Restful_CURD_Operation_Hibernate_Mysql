package com.country.controller;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

import com.country.model.Country;
import com.country.service.CountryService;
import com.outputresponse.Outputresponse;

@Controller
@Path("/")
public class CountryController {

	@Inject
	private CountryService countryService;

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String checkStatus() {
		return "Service is up";
	}

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Outputresponse addCountry(Country country) {
		return countryService.save(country);
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Outputresponse updateCountry(Country country){
		return countryService.update(country);
	}
	
	
	@GET
	@Path("/countries")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Outputresponse getCountry(){
		return countryService.getCountries();
	}
	
	
}

