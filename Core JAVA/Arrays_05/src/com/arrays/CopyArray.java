package com.arrays;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		
		int a[]=new int[5];
		
		int copyArray[]=new int[5];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array Element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt(); //			
		}
		
		
		
		System.out.println("Display Array Element :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(+a[i]+" ");
			System.out.println();
			
//			
		}
		 
		for(int i=0;i<a.length;i++)
		{
			copyArray[i]=a[i]; //All value of array a will store in copyArray		
		}
		
		System.out.println("Copy Array is :");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(+copyArray[i]+" ");
		}
		
scan.close();
	}

}


/*forEach loop
 * for(int a:s) s is array
 * print (s);
 * */
