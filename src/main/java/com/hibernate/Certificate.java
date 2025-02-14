package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	@Column(name="courses")
	private String course;
	
	@Column(name="course_duration")
	private String duration;
	
	@Column(name="course_teachby")
	private String taughtBy;
	
	public Certificate() {
		super();
	}
	
	public Certificate(String courses, String duration, String taughtBy) {
		super();
		this.course = courses;
		this.duration = duration;
		this.taughtBy = taughtBy;
	}
	
	public String getCourses() {
		return course;
	}
	public void setCourses(String courses) {
		this.course = courses;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getTaughtBy() {
		return taughtBy;
	}
	public void setTaughtBy(String taughtBy) {
		this.taughtBy = taughtBy;
	}
	
	
}
