package com.day1;

import java.util.Scanner;

public class MagicBoardOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 numbers: ");
		int[] numArr = new int[4];
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		System.out.println();
		for(int i = 0; i<numArr.length; i++) {
			System.out.println(numArr[i]+"-"+(char)numArr[i]);
		}
	}

}
