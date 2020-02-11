package com.bayrktlihn.jsf.validedemo;

import javax.faces.bean.ManagedBean;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
public class StudentTwo {
	private String firstName;
	private String lastName;
	private String postalCode;
	private int freePasses;
}
