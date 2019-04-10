package com.country.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.country.controller.CountryController;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(CountryController.class);
	}

}
