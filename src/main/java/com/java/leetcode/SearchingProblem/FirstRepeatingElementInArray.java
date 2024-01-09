package com.java.leetcode.SearchingProblem;

import java.util.Scanner;

public class FirstRepeatingElementInArray {
	
	public static int getFirstRepeatingElement(int[] arr , int size) {
		for(int i=0;i<size;i++) {
			for(int j = i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					return i;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The First Repeating Element In The Array : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size of The Array : ");
		int size = sc.nextInt();
		int[] arrNumber = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter ELement In the Array : ");
			arrNumber[i] = sc.nextInt();
		}
		int firstRepeatELement = getFirstRepeatingElement(arrNumber, size);
		if(firstRepeatELement==-1) {
			System.out.println("No Repeated ELement Found In the Array ");
		}else {
			System.out.println("Element Found At The Given Index is : "+ firstRepeatELement);
		}
	}

}
