package com.alumni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumni.entity.Registration;
import com.alumni.repo.RegistrationRepository;



@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	public Registration postRegistration(Registration registration)
	{
		return registrationRepository.save(registration);
	}
	
	public Registration fetchRegistrationByemailId(String emailId)
	{
		return registrationRepository.findByemailId(emailId);
	}

	public Registration fetchRegistrationByemailIdAndPassword(String email,String password)
	{
		return registrationRepository.findByemailIdAndPassword(email, password);
	}
	public List<Registration> getAllDetails()
	{
		return registrationRepository.findAll();
	}
	
}
