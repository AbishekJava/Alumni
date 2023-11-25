package com.alumni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumni.entity.Registration;
import com.alumni.entity.event;
import com.alumni.repo.EventRepository;
import com.alumni.service.RegistrationService;


@RestController
@RequestMapping("/alumni")
@CrossOrigin("*")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	
	
	@PostMapping("/registration")
	public Registration postRegistration(@RequestBody Registration registration)throws Exception
	{
		String tempemailId=registration.getEmailId();
		if(tempemailId != null && !"".equals(tempemailId))
		{
			Registration regobj=registrationService.fetchRegistrationByemailId(tempemailId);
			if(regobj !=null)
			{
				throw new Exception("user with "+ tempemailId+" is already exists");
			}
		}
		return registrationService.postRegistration(registration);
	}
	
	/*@GetMapping("/login")
	public Registration login(@RequestBody Registration registration ) throws Exception
	{
		String tempemail=registration.getEmailId();
		String temppass=registration.getPassword();
		Registration regobj=null;
		if(tempemail != null && temppass !=null)
		{
			regobj=registrationService.fetchRegistrationByemailIdAndPassword(tempemail, temppass);
			
		}
		if(regobj ==null)
		{
			throw new Exception("wrong credentials");
		}
		return regobj;
		}*/

	@GetMapping("/all")
	public List<Registration> getAllDetails()
	{
		return registrationService.getAllDetails();
	}
	
	@GetMapping("/user/{email}")
	public Registration getByEmailId(@PathVariable String email ){
		return registrationService.fetchRegistrationByemailId(email);
	}
	
	
	
}	
