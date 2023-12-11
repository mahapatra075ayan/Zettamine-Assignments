package com.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LeastOffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of items: ");
		int noofItems = sc.nextInt();
		sc.nextLine();
		
		int minDiscount = Integer.MAX_VALUE;
		
		StringBuffer itemDetail = new StringBuffer();
		for (int i = 0; i < noofItems; i++) {
			String itemDetails = sc.nextLine();
			String[] details = itemDetails.split(",");
			
			String itemName = details[0];
			int price = Integer.parseInt(details[1]);
			int discPercentage = Integer.parseInt(details[2]);
			
			int discount = (price*discPercentage) / 100;
			
			if(discount < minDiscount) {
				minDiscount = discount;
				itemDetail = new StringBuffer(itemName);
			}else if(discount == minDiscount) {
				itemDetail.append("\t").append(itemName);
			}
		}
		System.out.println("Items with Minimum Discount: "+itemDetail);
		

	}

}
