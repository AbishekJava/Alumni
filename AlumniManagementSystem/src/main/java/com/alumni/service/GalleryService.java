package com.alumni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumni.entity.gallery;
import com.alumni.entity.jobs;
import com.alumni.repo.GalleryRepository;

@Service
public class GalleryService {

	@Autowired
	private GalleryRepository galleryRepo;
	
	 public List<gallery> getAllGallery() {
	    return galleryRepo.findAll();
	  }
	 

	public gallery postGallery(gallery gallery) {
		// TODO Auto-generated method stub
		return galleryRepo.save(gallery);
	}
}
