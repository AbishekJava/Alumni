package com.alumni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumni.entity.jobs;
import com.alumni.repo.JobsRepository;




@Service
public class JobsService {
	@Autowired
	private JobsRepository jobsRepo;
	
	public List<jobs> getAlljobs()
	{
		return jobsRepo.findAll();
	}
	public jobs postJobs(jobs Jobs)
	{
		return jobsRepo.save(Jobs);
	}
	
	public void deleteJobs(Long sno)
	{
		jobsRepo.deleteById(sno);
	}
}
