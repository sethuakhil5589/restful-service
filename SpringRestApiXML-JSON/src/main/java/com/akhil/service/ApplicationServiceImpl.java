package com.akhil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akhil.dao.IRepository;
import com.akhil.entity.Courses;

@Service
public class ApplicationServiceImpl implements IApplicationService {
	@Autowired
	private IRepository repo;
	
	@Override
	public Courses savingData(Courses course) {
		return repo.save(course);
	}

	@Override
	public List<Courses> fetchData() {
		
		return repo.findAll();
	}

}
