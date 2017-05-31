package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.User;
import com.cognizant.service.ApplyEducationLoanService;
import com.cognizant.service.viewEducationLoanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class TestEducationLoan {

	
	@Autowired
	ApplyEducationLoanService service;
	viewEducationLoanService service1;
	
	private List<EducationLoan> eduLoan;
	User user;
	@Before
	public void setup(){
		 user=new User("savings","Abhi", 540,1234567890987650l);
		    EducationLoan e1=new EducationLoan(2000,"23-03-1995",20,40000,60000,"JAVA","abc",56785675,user);
		    EducationLoan e2=new EducationLoan(2009,"23-03-1995",20,40000,60000,"C#","abc",56785675,user);
		    //String educatioloanid=service.generate(user.getAccount_Number());
		    
		    String id=service.generate(e1.getID_Card_Number());
		    //String id1=service.generate(e2.getID_Card_Number());
		    System.out.println(id);
		    e1.setEducation_Loan_ID(id);
		    e2.setEducation_Loan_ID(id);
		    
		  
		    
		    e1.setEdu_Loan_Account_Number(service.generateLoanAccNumber());
		    e2.setEdu_Loan_Account_Number(service.generateLoanAccNumber());
		    eduLoan = new ArrayList<EducationLoan>();
		    eduLoan.add(e1);
		    eduLoan.add(e2);
		    user.setEduList(eduLoan);
		
	}
	@Test
	public void testinsertEducationLoanDetails(){
		try {
			service.insertEducationLoanDetails(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Not supplied valid name");
		}
	}
	
	//@Test
	 public void testviewEducationLoanDetails() {
	
		
		service1.viewEDucationLoan(1234);
		System.out.println("Test");
                     assertTrue(true);

     }
	 //@Test
	 public void  updateEducationLoandetails()
	 {
		EducationLoan e3=new EducationLoan(2019,"23-03-1995",20,40000,60000,"PERL","pqrbc",5678,user);
		 String id=service.generate(user.getAccount_Number());
		long id1= service.generateLoanAccNumber();
	
		e3.setEdu_Loan_Account_Number(id1);
		e3.setEducation_Loan_ID(id);
		
		service.updateEducationDetails(e3,1234567890987654l);
	 }
	
}
