package com.arrays;

import java.util.Scanner;

public class FindEvenOddArray {

	static void count(int x[])	
	{
		int even=0,odd=0;
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
				even++;
			else
				odd++;
		}
		
		System.out.println("even number is :"+even);
		
		System.out.println("Odd number is :"+odd);
	}
	
	

	static int [] input()
	{
		int a[]=new int[5]; 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array Element :");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		scan.close();
		
		return a;
	}
	
	
	public static void main(String[] args) 
	{
		
		int b[]=input();
		
		count(b);
		

	}

}
