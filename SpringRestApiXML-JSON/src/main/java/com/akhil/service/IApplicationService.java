package com.akhil.service;

import java.util.List;

import com.akhil.entity.Courses;

public interface IApplicationService {
	Courses savingData(Courses course);
	List<Courses> fetchData();
}
