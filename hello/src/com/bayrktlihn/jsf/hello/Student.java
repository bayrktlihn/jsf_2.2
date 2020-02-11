package com.bayrktlihn.jsf.hello;

import javax.faces.bean.ManagedBean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private String firstName;
	private String lastName;
	
}
