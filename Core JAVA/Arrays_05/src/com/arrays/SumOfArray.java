package com.arrays;

import java.util.Scanner;

public class SumOfArray {
	
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
	   int [] a=new int[5];
	   
		System.out.println("Enter Array Element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		scan.close();
		return a;
	}
	
	static void display(int a[])
	{
		int sum=0;
		System.out.println("Display Array Element :");
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array element is :"+sum);
	}

	public static void main(String[] args) {
		
		int b[]=input();
		display(b);
	}

}
