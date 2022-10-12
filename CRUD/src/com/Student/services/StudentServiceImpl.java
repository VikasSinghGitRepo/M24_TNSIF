package com.Student.services;

import com.Student.dao.StudentDao;
import com.Student.dao.StudentDaoImp;
import com.Student.entity.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;

	public StudentServiceImpl() 
	{
		dao = new StudentDaoImp();
	}

	@Override
	public void addStudent(Student student) 
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public Student findStudentById(int id)
	{
		Student student = dao.getStudentById(id);
		return student;
	}

	@Override
	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	
	

}