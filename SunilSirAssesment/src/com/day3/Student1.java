package com.day3;

public class Student1 {
	static int id = 101;
	private String studentId;
	private String studentName;
	private String studentEmail;
	private static String collegeName = "TIMT";
	
	
	
	public Student1(String studentName, String studentEmail) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentId = generateStudentId();
	}



	private String generateStudentId() {
		return "Zetta_"+(++id);
	}



	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-20s | %-10s",studentId,studentName,studentEmail,collegeName);
	}
	
	
	
	
}
