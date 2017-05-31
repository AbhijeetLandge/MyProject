package com.cognizant.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.ApplyEducationLoanDAO;
import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.User;

@Component
@Transactional
public class ApplyEducationLoanService {
	
	@Autowired
	 ApplyEducationLoanDAO dao;	
	User user;
	EducationLoan el;
	
	public String generate(long accountNumber) {
		/*long time=System.nanoTime();
		Random rd=new Random();
		int i=rd.nextInt(10);
		
		*/
		System.out.println(accountNumber);
		
		String s1=Long.toString(accountNumber);
		//String s2=Integer.toString(i);
		StringBuffer sb=new StringBuffer();
		sb.append(s1);
		
		
		String lan=sb.toString();
		
		System.out.println(lan);
		String idNumberLast=lan.substring(0,5);
		String EducationLoanId="EL-".concat(idNumberLast);
		
		return EducationLoanId; }
	
	public void insertEducationLoanDetails(User user)
	{  
		
		
		dao.insertEducationLoanDetails(user);
	}
	
	public long generateLoanAccNumber(){
		System.out.println("In Service");
		Long num=(long) (Math.random() * 10000000000000000L);
		System.out.println(num);
		return num;
		
		
	}

	public void updateEducationDetails(EducationLoan e3, long accno) {
		// TODO Auto-generated method stub
		user=dao.updateEducationLoanDetails(accno);
		List<EducationLoan> lst=user.getEduList();
		e3.setUser(user);
		lst.add(e3);
		user.setEduList(lst);
		System.out.println("In Service"+lst);
		System.out.println("In Service1"+user);
		
		
	}

}
