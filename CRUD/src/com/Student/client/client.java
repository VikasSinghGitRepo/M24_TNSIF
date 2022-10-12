package com.Student.client;

import com.Student.entity.Student;
import com.Student.services.StudentService;
import com.Student.services.StudentServiceImpl;

public class client {
	public static void main(String[] args) 
	{		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
//	student.setStudentid(111);
//	student.setName("shyam");
//	service.addStudent(student);
		
		
	// Retrieve Operation
//	    service.findStudentById(111);
//		System.out.println("ID is: "+student.getStudentid());
//		System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
//		student  =service.findStudentById(109);
//		student.setName("Asha");
//		service.updateStudent(student);
		
		
		//service.findStudentById(101); 
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
		student=service.findStudentById(109);
		service.removeStudent(student);
		System.out.println("Row removed");
		
		System.out.println("End of the Program/Life cycle completed...");
	}
}