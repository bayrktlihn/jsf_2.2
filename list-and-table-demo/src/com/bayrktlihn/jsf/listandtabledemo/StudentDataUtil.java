package com.bayrktlihn.jsf.listandtabledemo;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import lombok.Getter;

@ManagedBean
@ApplicationScoped
public class StudentDataUtil {
	
	@Getter
	private List<Student> students;
	
	public StudentDataUtil() {
		loadSampleData();
	}

	private void loadSampleData() {
		students = new ArrayList<Student>();
		
		students.add(new Student("alihan","bayraktar","alihanbayraktar@bayrktlihn.com"));
		students.add(new Student("ferhat","aykan","ferhataykan@bayrktlihn.com"));
		students.add(new Student("mimar","aslan","mimaraslan@bayrktlihn.com"));
		students.add(new Student("levent","erguder","leventerguder@bayrktlihn.com"));
		
		
		
	}
}
