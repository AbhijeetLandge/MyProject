package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.UserDAO;
import com.cognizant.entity.User;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestUserDetails {
	
	@Autowired
	UserDAO dao;
	@Before
	public void setup(){
    	//User user=new User("savings","Akshay", 24000);
    	//dao =new UserDAO ();
	}
	

	@Test
	public void addUser() {
    	User user=new User("savings","Akshay", 24000,1234567890987654l);
		dao.addUser(user);
		assertTrue(true);
		
		
		
	}
	
	

}
