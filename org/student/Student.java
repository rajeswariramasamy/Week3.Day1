package org.student;

import org.department.Department;

public class Student extends Department {
//Multiple Inheritance
	public void studentName(){
		System.out.println("Student Name: AAKAASH");
	}

	public void studentDept() {
		System.out.println("Student Department: 3rd year IT");
	}

	public void studentId(){
		System.out.println("Student ID: IIIIT01");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
