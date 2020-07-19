package com.sooriya.Entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sooriya.Validator.CourseCode;
import com.sooriya.Validator.PhoneNumber;

public class Student {

	@NotBlank
	@Size(max=20)
	private String name;
	@NotNull
	@Min(3)
	@Max(18)
	private Integer age;
	@Pattern(regexp="^[0-9]{6}")
	private String postalCode;
	@CourseCode(value={"CSE","ECE","EEE","IT"})
	private String courseCode;
	@PhoneNumber
	private String phoneNumber;
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
}
