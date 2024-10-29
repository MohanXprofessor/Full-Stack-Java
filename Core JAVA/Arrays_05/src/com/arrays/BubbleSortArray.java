package com.arrays;

import java.util.Scanner;

public class BubbleSortArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
//		Array is Created 
		
		int a[]=new int [5];
		
		System.out.println("Enter array element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
//		Display 
		System.out.println("Display Array enter is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		// Bubble Sort of Array
		
		for(int i=0;i<a.length-1;i++) //Array length n-1 iteration
		{
			for(int j=0;j<a.length-i-1;j++) // 
			{
				if(a[j]>a[j+1])
				{

					int swap=a[j];   //Swap Method
					a[j]=a[j+1];
					a[j+1]=swap;
				}
			}
		}
		//END Bubble Sort of Array
		
		System.out.println();
		System.out.println("Bubble Sort is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
		
		scan.close();

	}

}
