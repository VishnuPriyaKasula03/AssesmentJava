package com.hcl.pp.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.pp.model.Pet;

public class PetDAOImpl implements PetDAO 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Pet> fetchAll() 
	{
		log.info("Inside dao fetchPhysician()");
		Query query = sessionFactory.getCurrentSession().createQuery("from PETS ph");
		List<Pet> petList = query.list();
		return petList;
	}
}
