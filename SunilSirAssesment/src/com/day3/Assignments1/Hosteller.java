package com.day3.Assignments1;

public class Hosteller extends Student{
	
	private String hostelName; 
	 private int roomNumber;
	 
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
		
		public Hosteller(int studentId, String name, int departmentId, String gender, String phone, String hostelName,
				int roomNumber) {
			super(studentId, name, departmentId, gender, phone);
			this.hostelName = hostelName;
			this.roomNumber = roomNumber;
		}
	
		public Hosteller() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
	
		
		
		
		

}
