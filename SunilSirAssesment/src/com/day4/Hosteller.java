package com.day4;

public class Hosteller {
	private String hostelName; 
	private int roomNumber;
	private Student student;
	
	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Hosteller(String hostelName, int roomNumber, Student student) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		this.student = student;
	}

	

}
