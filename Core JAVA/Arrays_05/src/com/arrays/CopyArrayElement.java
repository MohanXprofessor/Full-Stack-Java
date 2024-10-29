package com.arrays;

import java.util.Scanner;

public class CopyArrayElement {
	
	
	static int []  input()
	{
		int a[]=new int[5];
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array Element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt(); //			
		}
		scan.close();
		return a;
		
	}
	static void display(int a[]) 
	{
		
		System.out.println("Display Array Element :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" "); 			
		}
		
		
	}
	
	static void copyarray(int a[])
	{
int copyArray[]=new int[5];
		
		System.out.println("Copy Array is :");
		
		for(int i=0;i<a.length;i++)
		{
				copyArray[i]=a[i]; 			
			
		System.out.print(+copyArray[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		
		int b[]=input();
		display(b);
		copyarray(b);
	}

}
