package com.grwts.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "student")
public class StudentVo {

	private String name;
	private String city;
	private String college;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public StudentVo(String name, String city, String college) {
		super();
		this.name = name;
		this.city = city;
		this.college = college;
	}

	public StudentVo() {
		super();
	}

	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", city=" + city + ", college=" + college + "]";
	}

}
