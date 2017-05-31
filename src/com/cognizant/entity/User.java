package com.cognizant.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class User {
	
	@OneToMany(mappedBy="user" , cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<EducationLoan> eduList;
	
	//default Constructor
	public User()
	{
		
	}
	
	//parameterized constructor
	public User( String account_Type, String account_Holder_Name, double account_Balance, long Account_Number) {
		super();
		this.Account_Number = Account_Number;
		this.Account_Type = account_Type;
		this.Account_Holder_Name = account_Holder_Name;
		this.Account_Balance = account_Balance;
	
	}
	

	//Getters and Setters
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Account_Number")
	public long getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(long account_Number) {
		this.Account_Number = account_Number;
	}

	public String getAccount_Type() {
		return Account_Type;
	}

	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}

	public String getAccount_Holder_Name() {
		return Account_Holder_Name;
	}

	public void setAccount_Holder_Name(String account_Holder_Name) {
		Account_Holder_Name = account_Holder_Name;
	}

	public double getAccount_Balance() {
		return Account_Balance;
	}

	public void setAccount_Balance(double account_Balance) {
		Account_Balance = account_Balance;
	}
	
	public List<EducationLoan> getEduList() {
		return eduList;
	}

	public void setEduList(List<EducationLoan> eduList) {
		this.eduList = eduList;
	}


	@Override
	public String toString() {
		return "User [eduList=" + eduList + ", Account_Number=" + Account_Number + ", Account_Type=" + Account_Type
				+ ", Account_Holder_Name=" + Account_Holder_Name + ", Account_Balance=" + Account_Balance + "]";
	}


	@Id 
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Account_Number",length=16)
	private long Account_Number;
	
	@Column(name="Account_Type")
private String Account_Type;
	
	@Column(name="Account_Holder_Name")
private String Account_Holder_Name;
	
	@Column(name="Account_Balance")
private double Account_Balance;

}
