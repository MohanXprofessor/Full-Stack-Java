package com.arrays;

import java.util.Scanner;

public class SelectionSortArray {

	
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		int a[]=new int [5];
		System.out.println("Enter are element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		System.out.println("Original Array :");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		
		// Selection Sort method 
		
		for(int i=0;i<a.length-1;i++) //position at 0   and no of array length n-1 iteration
		{
			for(int j=i+1;j<a.length;j++) //position at 0+1=1 
			{
				if(a[i]>a[j]) // condition a > J
				{
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
		// Display sorting array
		System.out.println("Selection Sort Array Element is:");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		scan.close();

	}

}
