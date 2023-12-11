package com.day2;

import java.util.Scanner;

public class StudentMain {
	static String collegeName = "NIT";
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String collName = null;
		
		System.out.print("Enter Student's Id: ");
		int sid = sc.nextInt();
		System.out.print("Enter Student's Name: ");
		sc.nextLine();
		String sname = sc.nextLine();
		System.out.print("Enter Student's address: ");
		String saddress = sc.next();
		String choice;
		System.out.print("Whether the student is from NIT(Yes/No): ");
		choice = sc.next();
			if(choice.equalsIgnoreCase("No")) {
				System.out.print("Enter the college name: ");
				collName = sc.next();
				Student st = new Student(sid, sname, saddress, collName);
				System.out.println();
				System.out.println("Student id:"+st.getStudentId());
				System.out.println("Student name: "+st.getStudentName());
				System.out.println("Address: "+st.getStudentAddress());
				System.out.println("College Name: "+st.getCollegeName());
				System.exit(0);
				
			}else if(choice.equalsIgnoreCase("Yes")) {
				Student st = new Student(sid, sname, saddress);
				System.out.println();
				System.out.println("Student id:"+st.getStudentId());
				System.out.println("Student name: "+st.getStudentName());
				System.out.println("Address: "+st.getStudentAddress());
				System.out.println("College Name: "+collegeName);
			}else{
				System.out.println("Wrong input");
				do {
					System.out.print("Whether the student is from NIT(Yes/No): ");
					choice = sc.next();
					Student st = new Student(sid, sname, saddress);
					System.out.println();
					System.out.println("Student id:"+st.getStudentId());
					System.out.println("Student name: "+st.getStudentName());
					System.out.println("Address: "+st.getStudentAddress());
					System.out.println("College Name: "+collegeName);
					break;
				}while(choice.equalsIgnoreCase("Yes"));
			}
		
		

	}

}
