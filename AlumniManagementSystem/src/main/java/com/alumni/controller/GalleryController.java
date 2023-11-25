package com.alumni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumni.entity.gallery;
import com.alumni.service.GalleryService;

@RestController
@RequestMapping("/alumni")
@CrossOrigin("*")
public class GalleryController {

	@Autowired
	private GalleryService gallerySer;
	
	@GetMapping("/gallery")
	 public List<gallery> getAllGallery() {
		    return gallerySer.getAllGallery();
		  }
	 
	@PostMapping("/gallery/add")
	 public gallery postGallery(@RequestBody gallery Gallery)
	{
		return gallerySer.postGallery(Gallery);
	}
}
