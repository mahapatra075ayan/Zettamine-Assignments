package com.day4.Assignments1;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Student s = getHostellerDetails();
		System.out.println();
		System.out.println("The Student Details are as follows:");
		System.out.println();
		System.out.println("Student ID: "+s.getStudentId());
		System.out.println("Student Name: "+s.getName());
		System.out.println("Department ID: "+s.getDepartmentId());
		System.out.println("Student Gender: "+s.getGender());
		System.out.println("Student Phone No: "+s.getPhone());
		System.out.println("Hostel Name: "+s.getHostel().getHostelName());
		System.out.println("Room No: "+s.getHostel().getRoomNumber());
		
		
	}
	
	public static Student getHostellerDetails(){
		
		System.out.print("Enter the Student Details & Hostel Details: ");
		System.out.println();
		System.out.print("Student ID: ");
		int sId = sc.nextInt();
		System.out.print("Student Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Department Id: ");
		int deptId = sc.nextInt();
		System.out.print("Gender[M/F]: ");
		String gender = sc.next();
		System.out.print("Phone Number: ");
		String phone = sc.next();
		
		System.out.print("Hostel Name: ");
		String hostelName = sc.next();
		System.out.print("Room Number: ");
		int roomNo = sc.nextInt();
		
		Hosteller hstl = new Hosteller(hostelName, roomNo);
		Student student = new Student(sId ,name, deptId, gender, phone, hstl);
		
		System.out.print("Modify Room Number(Y/N): ");
		String modifyRoomNoChoice = sc.next();
		if(modifyRoomNoChoice.equalsIgnoreCase("Y")) {
			System.out.print("New Room Number: ");
			hstl.setRoomNumber(sc.nextInt());
			
		}
		
		System.out.print("Modify Phone Number(Y/N): ");
		String modifyPhoneChoice = sc.next();
		if(modifyPhoneChoice.equalsIgnoreCase("Y")) {
			System.out.print("New Phone Number: ");
			student.setPhone(sc.next());
		}
		
		return student;
		
	}

}
