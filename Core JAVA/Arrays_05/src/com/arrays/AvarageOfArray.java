package com.arrays;


import java.util.Scanner;

public class AvarageOfArray {
	
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5]; // Size of array Elements
		System.out.println("Enter Array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		scan.close();
		return a;
	}
	static void display(int a[])
	{
		int avg=0,sum=0;
		System.out.println("Display Array element :");
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			avg=(sum)/a.length;
		}
		System.out.println("Avarage of "+sum+" is :"+avg);
	}

	public static void main(String[] args) {
		
		int b[]=input();
		display(b);
	}

}
