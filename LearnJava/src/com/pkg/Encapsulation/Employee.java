package com.pkg.Encapsulation;

import java.util.Objects;

public class Employee {
	private int id;
	private char grade;
	private String name;
	private double salary;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(grade, id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return grade == other.grade && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", grade=" + grade + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[]arg) {
		Employee e1 = new Employee();
		e1.setId(123);
		//write
		e1.setSalary(1000);
		System.out.println(e1.getId());//read
		System.out.println(e1.getSalary());//read
		System.out.println(e1.hashCode());
		//System.out.println(e1.hashCode());	
		System.out.println(e1.toString());	

		Employee e2 = new Employee();
		//System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		
		

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
