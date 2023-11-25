package com.alumni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumni.entity.event;
import com.alumni.service.EventService;


@RestController
@RequestMapping("/alumni")
@CrossOrigin("*")
public class EventController {

	@Autowired
	private EventService eventService;
	
	
	
	@GetMapping("/event")
	public List<event> getAllevent()
	{
		return eventService.getAllevent();
	}
}
