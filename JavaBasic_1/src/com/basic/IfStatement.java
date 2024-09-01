package com.basic;
import java.util.Scanner;

// Q1] Write a jAVA Program to check weather a number is Positive OR Negative Number?

public class IfStatement {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		if(num>=0)
		{
			System.out.println("Number:\t"+num+"\tis Positive");
			
		}else
		{
			System.out.println("Number:\t"+num+"\tis Negative");
		}
sc.close();
	}

}
/*
	
	
*/