package com.basic;

import java.util.Scanner;
// Q1] Write a JAVA Program to Check Number is EVEN OR ODD?  
public class OddEvenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num=sc.nextInt();
		
	if(num%2==0) // Any Number divide by 2 is Even Number
	{
		System.out.println("The Number:"+num+"\tis EVEN");
	}else
		System.out.println("The Number:"+num+"\tis ODD");

	sc.close();
	}
}
