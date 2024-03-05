package com.validation.Validation;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity(name="Person")

public class Person 
{
	
  // @SequenceGenerator(name="mySeqGen",sequenceName="kanSeq",initialValue=12345,allocationSize= 100 )
	//@GeneratedValue(generator = "mySeqGen")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@NotEmpty(message="First name is required")
	String firstname;
	
	@NotEmpty(message="Lastname is also required")
	String lastname;
	
	 @NotNull
	  @Size(min=7, message="Passport should have atleast 2 characters")
    String passportNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	 
}