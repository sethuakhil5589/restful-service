package com.akhil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Courses {
	@Id
	private Integer courseId;
	private String courseName;
	private String trainerName;
	private Double courseFee;
	
	public Courses(Integer courseId, String courseName, String trainerName, Double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.trainerName = trainerName;
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", trainerName=" + trainerName
				+ ", courseFee=" + courseFee + "]";
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public Double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}
	public Courses() {
		super();
	}
}
