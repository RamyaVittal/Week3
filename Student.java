package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("student Name - Test student");
	}
	public void studentDept() {
		System.out.println("student Code - CSE");
	}
	public void studentID() {
		System.out.println("student id - 1087");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c = new College();
		c.collegeCode();
		c.collegeName();
		c.collegeRank();
		
		Department d = new Department();
		d.deptName();
		
		
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentID();
		
		

	}

}
