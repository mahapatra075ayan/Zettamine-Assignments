package com.day4;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Hosteller hst = getHostellerDetails();
		System.out.println("The Student Details are as follows:");
		System.out.println();
		System.out.println("Student ID: "+hst.getStudent().getStudentId());
		System.out.println("Student Name: "+hst.getStudent().getName());
		System.out.println("Department ID: "+hst.getStudent().getDepartmentId());
		System.out.println("Student Gender: "+hst.getStudent().getGender());
		System.out.println("Student Phone No: "+hst.getStudent().getPhone());
		System.out.println("Hostel Name: "+hst.getHostelName());
		System.out.println("Room No: "+hst.getRoomNumber());
		
		
	}
	
	public static Hosteller getHostellerDetails(){
		
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
		
		Student s1 = new Student(sId, name, deptId, gender, phone);
		
		System.out.print("Hostel Name: ");
		String hostelName = sc.next();
		System.out.print("Room Number: ");
		int roomNo = sc.nextInt();
		
		Hosteller hstl = new Hosteller(hostelName, roomNo,s1); 
		
		System.out.print("Modify Room Number(Y/N): ");
		String modifyRoomNoChoice = sc.next();
		if(modifyRoomNoChoice.equalsIgnoreCase("Y")) {
			System.out.print("New Room Number: ");
			hstl.setRoomNumber(sc.nextInt());
			
		}else if(modifyRoomNoChoice.equalsIgnoreCase("N")){
			System.exit(0);
		}
		System.out.print("Modify Phone Number(Y/N): ");
		String modifyPhoneChoice = sc.next();
		if(modifyPhoneChoice.equalsIgnoreCase("Y")) {
			System.out.print("New Phone Number: ");
			s1.setPhone(sc.next());
		}else if(modifyPhoneChoice.equalsIgnoreCase("N")) {
			System.exit(0);
		}
		
		return hstl;
		
	}

}
