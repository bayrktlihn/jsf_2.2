package com.bayrktlihn.jsf.hello;

import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
public class StudentFive {
	private String firstName;
	private String lastName;

	private String favoriteLanguage;
	
	public StudentFive() {
		firstName = "Alihan";
		lastName = "Bayraktar";
		favoriteLanguage = "Java";
	}

}
