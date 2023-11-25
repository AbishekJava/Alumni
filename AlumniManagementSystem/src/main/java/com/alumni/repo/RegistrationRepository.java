package com.alumni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumni.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration,Long> {

	public Registration findByemailId(String emailId);
	public Registration findByemailIdAndPassword(String email,String password);
}
