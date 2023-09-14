package com.collection.pkg;

import java.util.ArrayList;

public class CollectionForUserDefinedType {
	public static void main(String[]args) {
		Employee e1 = new Employee(123, "ram", 10000.0, 'C');
		Employee e2 = new Employee(456, "Venkat", 25000.0, 'A');
		Employee e3 = new Employee(789, "Vijay", 20000.0, 'B');
		Student s1 = new Student(12,"Raju");
		Student s2 = new Student(34,"Raja");
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(s1);
		al.add(s2);
		System.out.println(al);
	}

}
class Employee{
	int empID;
	String empName;
	double empSalary;
	char empGrade;
	public Employee(int empID, String empName, double empSalary, char empGrade) {
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empGrade = empGrade;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", empGrade="
				+ empGrade + "]";
	}
	}


class Student{
	int rollno;
	String studname;
	public Student(int rollno, String studname) {
		super();
		this.rollno = rollno;
		this.studname = studname;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + "]";
	}
}






