package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ApplyEducationLoanDAO;
import com.cognizant.dao.viewEducationLoanDAO;
import com.cognizant.entity.EducationLoan;

@Component
public class viewEducationLoanService {
	@Autowired
	 viewEducationLoanDAO dao;	
	public List<EducationLoan> viewEDucationLoan(int acc_no)
	{
		List<EducationLoan> lst =new ArrayList<EducationLoan>();
		lst=dao.viewEducationLoan(acc_no);
		return lst;
	}

}
