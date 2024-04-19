package com.akhil.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhil.entity.Courses;
@Repository
public interface IRepository extends JpaRepository<Courses, Integer> {

}
