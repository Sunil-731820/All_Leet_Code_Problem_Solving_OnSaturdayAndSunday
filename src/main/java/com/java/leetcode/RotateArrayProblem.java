package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArrayProblem {
	
	public static void RotateElementAccodingToUser(int[] numbers, int rotation) {
		System.out.println("Inside the RotateArray method is getting called : ");
		List<Integer> leftList = new ArrayList<Integer>();
		List<Integer> rightList = new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) {
			if(i<rotation) {
				leftList.add(numbers[i]);
			}else {
				rightList.add(numbers[i]);
			}
		}
		System.out.println("The Left List is After Adding The till Rotation Element is ");
		System.out.println(leftList);
		System.out.println("The Right list is After Adding The from Rotation To end is : =");
		System.out.println(rightList);
		System.out.println("Now Adding The Right into The left Portions ");
		rightList.addAll(leftList);
		System.out.println("After Adding The right List is : ");
		System.out.println(rightList);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The rotate An Array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The ELement In The Array : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Element for number of Rotation : ");
		int rotateElement = sc.nextInt();
		RotateElementAccodingToUser(arr, rotateElement);
		
	}

}
