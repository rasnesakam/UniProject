package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity{
	
	 
	

	
	 	
	  private int Id;
	  private String FirstName;
	  private String LastName;
	  private LocalDate DateOfBirth;
	  private String NationalityId;
	  
	  
	  
	  
	  public Customer(LocalDate DateOfBirth, String FirstName, String LastName, String NationalityId) {
		  this.DateOfBirth=DateOfBirth;
		  this.FirstName=FirstName;
		  this.LastName=LastName;
		  this.NationalityId=NationalityId;
		  
	  }
	  
	  
	  
	  
	  
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	  
	  
	  
	  
	  
	  
	}


