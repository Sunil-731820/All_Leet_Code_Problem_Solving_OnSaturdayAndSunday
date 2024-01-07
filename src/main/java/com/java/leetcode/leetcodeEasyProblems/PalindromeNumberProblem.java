package com.java.leetcode.leetcodeEasyProblems;

public class PalindromeNumberProblem {
	public static void main(String[] args) {
		int number = 121;
		int saveNumber = number;
		int rev = 0;
		while(number!=0) {
			int rem = number%10;
			
			rev = rev*10+rem;
			number = number/10;
		}
		if(saveNumber==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome ");
		}
	}

}
