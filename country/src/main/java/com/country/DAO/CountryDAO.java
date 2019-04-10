package com.country.DAO;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.country.model.Country;

@Repository
public class CountryDAO {
	
	@Inject
	private SessionFactory sessionFactory;
 
	
	
	public int saveCountry(Country country){
		try(Session session = sessionFactory.openSession()){
			Transaction tr = session.beginTransaction();
			session.save(country);
			tr.commit();
			session.close();
			return country.getcId();
		}
	}



	public Country updateCountry(Country country) {
		try(Session session = sessionFactory.openSession()){
			Transaction tr = session.beginTransaction();
			session.update(country);
			tr.commit();
			session.close();
			return country;
		}
	}

	public List<Country> getCountries() {
		try(Session session = sessionFactory.openSession()){
			Query query = session.createQuery("from Country");
			return query.list();
		}
	}




}
