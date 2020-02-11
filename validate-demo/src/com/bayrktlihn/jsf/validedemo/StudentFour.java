package com.bayrktlihn.jsf.validedemo;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
public class StudentFour {
	private String firstName;
	private String lastName;
	private String courseCode;
	
	public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		if(value == null)
			return;
		
		String data = value.toString();
		
		if(!data.startsWith("BAY")) {
			FacesMessage message = new FacesMessage("Course code must start with BAY");
			
			throw new ValidatorException(message);
		}
	}
}
