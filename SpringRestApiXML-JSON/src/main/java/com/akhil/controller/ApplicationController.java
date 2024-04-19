package com.akhil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.entity.Courses;
import com.akhil.service.ApplicationServiceImpl;

@RestController
public class ApplicationController {
	@Autowired
	private ApplicationServiceImpl service;
	
	@GetMapping(value="/data",produces= {"application/xml","application/json"})
	public ResponseEntity<?> fetchingData(){
		Courses course= new Courses(101,"Java","Navin Reddy",600.5);
		return new ResponseEntity<>(course,HttpStatus.OK);
	}
	
	@GetMapping(value="/fetch-data", produces= {"application/xml","application/json"})
	public ResponseEntity<?> fetchingAllData(){
		return new ResponseEntity<>(service.fetchData(),HttpStatus.OK);
	}
	
	@PostMapping(value="/data",consumes= {"application/xml","application/json"})
	public ResponseEntity<?> gettingData(@RequestBody Courses course){
		
		return new ResponseEntity<>("data saved with id: "+service.savingData(course).getCourseId(),HttpStatus.OK);
	}
	
}
