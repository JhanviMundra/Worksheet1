package com.worksheet1;

import java.util.List;

public class Employee {
	  private String studentName;
	  private int studentAge;
	  private Address ob;
	  private List<String> numbers;
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		System.out.println("Setter injection");
		this.studentName = studentName;
	}
	/**
	 * @return the studentAge
	 */
	public int getStudentAge() {
		return studentAge;
	}
	/**
	 * @param studentAge the studentAge to set
	 */
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	/**
	 * @return the ob
	 */
	public Address getOb() {
		return ob;
	}
	/**
	 * @param ob the ob to set
	 */
	public void setOb(Address ob) {
		this.ob = ob;
	}
	/**
	 * @return the numbers
	 */
	public List<String> getNumbers() {
		return numbers;
	}
	/**
	 * @param numbers the numbers to set
	 */
	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;
	}
	public Employee(String studentName, int studentAge, Address ob, List<String> numbers) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.ob = ob;
		this.numbers = numbers;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [studentName=" + studentName + ", studentAge=" + studentAge + ", ob=" + ob + ", numbers="
				+ numbers + "]";
	}
	  
	 
}
