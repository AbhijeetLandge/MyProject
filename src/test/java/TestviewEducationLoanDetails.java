package test.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.service.viewEducationLoanService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class TestviewEducationLoanDetails {
	@Autowired
	viewEducationLoanService service1;
	
	@Test
	 public void testviewEducationLoanDetails() {
	
		
		service1.viewEDucationLoan(7);
		System.out.println("Test");
                    assertTrue(true);

    }

}
