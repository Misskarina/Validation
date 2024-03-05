package com.validation.Validation;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class PersonController 
{
	@Autowired
	PersonRepository prepo;
	
	@RequestMapping ("/test")
	public String test()
	{
		return"this is test of validation";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		Person p=new Person();
		p.setFirstname("Akshat singh");
		p.setLastname("Rawat");
		p.setPassportNumber("A12345R");
		
		prepo.save(p);
		return"data saved in database";		
	}
	@RequestMapping("/saveall")
	public String saveall()
	{
		Person p1=new Person();
		p1.setFirstname("Vikash kkumar");
		p1.setLastname("Barnawal");
		p1.setPassportNumber("R346789L");
		
		Person p2=new Person();
		p2.setFirstname("Abishek Kumar");
		p2.setLastname("Rajput");
		p2.setPassportNumber("M235674B");

		Person p3=new Person();
		p3.setFirstname("Arun kumar");
		p3.setLastname("Sharma");
		p3.setPassportNumber("G2463434J");
		
		Person p4=new Person();
		p4.setFirstname("Subham Kumar");
		p4.setLastname("Sharma");
		p4.setPassportNumber("B56789U");
		
		Person p5=new Person();
		p5.setFirstname("Shivam Kumar");
		p5.setLastname("Modi");
		p5.setPassportNumber("R257858Q");
		 
		List<Person>list=Arrays.asList(p1,p2,p3,p4,p5);
		prepo.saveAll(list);
		return"MULTIPLES DATA ARE SAVED";
	}
}
