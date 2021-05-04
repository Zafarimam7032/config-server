package com.grwts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grwts.vo.StudentVo;

@RestController
@RefreshScope
public class StudentController {

	@Autowired
	private StudentVo student;

	@GetMapping(path = "/display")
	public StudentVo getStudent() {
		return student;
	}

}
