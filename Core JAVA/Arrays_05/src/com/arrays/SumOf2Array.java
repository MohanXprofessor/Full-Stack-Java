package com.arrays;

import java.util.Scanner;

public class SumOf2Array {
	
	static int [] input()
	{
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[a.length+b.length]; //TO MERGE array
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Array Element :");
		for(int i=0;i<a.length;i++)   
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("Enter second Array Element :");
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=scan.nextInt();
		}
		
		
		//  FOR MERGING ARRAY
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		
		
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		// END 
		scan.close();
		return c;
	}

	static void display(int c[])
	{
		int sum=0;
		System.out.println("Display Merge Array Element :");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		for(int i=0;i<c.length;i++)
		{
		sum=sum+c[i];
		}
		System.out.println();
		System.out.println("sum is :"+sum);
	}
	
	public static void main(String[] args) {
		
		int b[]=input();
		display(b);

	}

}
