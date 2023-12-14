package com.da6.Assignments3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberOfNewWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student's Article:");
		String article = sc.nextLine().toLowerCase();
		
		String[] strArray = article.split("[,;:.?! ]+");
		System.out.println("Number of words: "+strArray.length);
		System.out.println();
		TreeSet<String> uniqueWords = new TreeSet<String>(Arrays.asList(strArray));
		System.out.println("Number of unique words: "+uniqueWords.size());
		int count = 1;
		for (String words : uniqueWords) {
			System.out.println(count+"."+words);
			count++;
		}
		sc.close();
	}

}
