package com.cognizant.dao;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.User;

@Component
public class ApplyEducationLoanDAO {
	 @PersistenceContext
	    private EntityManager em;

	

	 @Transactional
	public void insertEducationLoanDetails(User user) {
		// TODO Auto-generated method stub
		//System.out.println("In DAO"+user.getCourse_Name());
		em.persist(user);
		
	}



	public User updateEducationLoanDetails(long accno) {
		// TODO Auto-generated method stub
		User retrieve=em.find(User.class,accno);
		System.out.println(retrieve);
		
		return retrieve;
	}

}
