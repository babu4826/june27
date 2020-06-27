package com.bean.scopes;

public class Course {
	
	private String name;
	private String tutorName;
	private int fee;
	private int duration;
	
	public Course() {
		
	}
	public Course(String name, String tutorName, int fee, int duration) {
		 this.name = name;
		 this.tutorName = tutorName;
		 this.fee = fee;
		 this.duration = duration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTutorName() {
		return tutorName;
	}
	public void setTutorName(String tutorName) {
		this.tutorName = tutorName;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", tutorName=" + tutorName + ", fee=" + fee + ", duration=" + duration + "]";
	}
	

}
