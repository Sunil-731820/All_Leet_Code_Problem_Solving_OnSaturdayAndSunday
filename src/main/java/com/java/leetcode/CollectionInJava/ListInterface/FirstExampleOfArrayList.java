package com.java.leetcode.CollectionInJava.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class FirstExampleOfArrayList {
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The Array List In Java : =");
		
		List<Integer> listOfInteger = new ArrayList<Integer>();
		listOfInteger.add(100);
		listOfInteger.add(200);
		listOfInteger.add(300);
		
		System.out.println("The List is : ");
		System.out.println(listOfInteger);
		
//		Adding The Object at Index 1 is : 
		listOfInteger.add(1, 12);
		System.out.println("After adding The List is : ");
		System.out.println(listOfInteger);
		
//		Removing The ELement At The Index 0 is 
		listOfInteger.remove(0);
		System.out.println("After Removing The ELement At The Index 0 is : =");
		System.out.println(listOfInteger);
		
//		Replace 0th Element With 5 
		listOfInteger.set(0, 5);
		System.out.println("The List is AFter setting 5 in 0th Position is : ");
		System.out.println(listOfInteger);
		
//		Searching Element using indexOf() 
		System.out.println("Searching Element using Index of method : "+listOfInteger.indexOf(200));
		
//		Acceesing The ELement using get() 
		System.out.println("After the Use of The get Method is : ="+ listOfInteger.get(1));
//		Checking The ELement is There in Array List or Not using COntain Method : 
		System.out.println("CHecking the Data is There In Array List or Not : "+ listOfInteger.contains(200));
		
//		Use Of The SOrt Method : 
		System.out.println("After Sorting The data is : ");
//		System.out.println(listOfInteger.sort(null));

	}

}
