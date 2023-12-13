package com.demo.util;

import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import com.demo.entity.Student;
import com.demo.model.Student_DTO;

@Component                                    
public class Converter {
	
	// Conversion from DTO to Entity
	public Student convertToStudentEntity(Student_DTO ref) {
		Student s = new Student();
		if(ref != null) {
			// Its a static method to copy the properties from source obj to target obj 
			//where the property name are same for both the object
			BeanUtils.copyProperties(ref, s);
		}
		return s;
	}
	
//	conversion From entity to DTO
	public Student_DTO convertToStudentDto(Student s) {
		Student_DTO res = new Student_DTO();
		if(s != null) {
			BeanUtils.copyProperties(s, res);
		}
		return res;
	}
	
}
