package com.bayrktlihn.jsf.hello;

import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
public class StudentFour {
	private String firstName;
	private String lastName;

	private String [] favoriteLanguages;
}
