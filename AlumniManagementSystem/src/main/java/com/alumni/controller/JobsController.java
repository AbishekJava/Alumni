package com.alumni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumni.entity.jobs;
import com.alumni.service.JobsService;

@RestController
@RequestMapping("/alumni")
@CrossOrigin("*")
public class JobsController {
	
	@Autowired
	private JobsService jobService;
	@GetMapping("/jobs")
	public List<jobs> getAlljobs()
	{
		return jobService.getAlljobs();
	}
	
	@PostMapping("/jobs/add")
	public jobs postJobs(@RequestBody jobs Jobs)
	{
		return jobService.postJobs(Jobs);
	}
	
	@DeleteMapping("/jobs/del/{sno}")
	public void deleteJobs(@PathVariable Long sno)
	{
		jobService.deleteJobs(sno);
	}
}
