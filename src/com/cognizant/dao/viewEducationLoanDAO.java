package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.User;

@Component
public class viewEducationLoanDAO {
	
	 @PersistenceContext
	    private EntityManager em;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//dao.viewEducationLoan(1234,5678);

	}

	@Transactional
	public List<EducationLoan> viewEducationLoan(int acc_no) {
		// TODO Auto-generated method stub
		
			User retrive=em.find(User.class,(long)acc_no); 
					System.out.println(retrive);
					List<EducationLoan> eList=retrive.getEduList();
					System.out.println(retrive.getEduList());

		//Session session = sessionFactory.openSession();
		//Transaction t = session.beginTransaction();	
		/*Query query = em.createQuery("from EducationLoan eld where eld.ID_Card_Number=?");
		//query.setParameter(1,acc_no);  
		query.setParameter(1,id_card_no);  
		
		List<EducationLoan> eList = query.getResultList();*/
		//System.out.println(retrive);
		/*for(EducationLoan evo:eList)
		{
			System.out.println(evo.toString());
		}*/
		
//		query.exe
		
		return eList;
		
		
	}

}
