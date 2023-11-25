package com.alumni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumni.entity.event;
import com.alumni.repo.EventRepository;


@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;

	public List<event> getAllevent()
	{
		return eventRepository.findAll();
	}
}
