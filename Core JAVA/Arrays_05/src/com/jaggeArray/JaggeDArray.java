package com.jaggeArray;

import java.util.Scanner;

public class JaggeDArray {
	/*
	 * 5 8
	 * 5
	 * 4 2 6
	 */

	public static void main(String[] args) {
		
		int a[][]=new int [3][];
		//   row         Column	
		
		
		a[0]=new int[2];
		a[1]=new int[1];
		a[2]=new int[3];
		
		System.out.println("Enter Array element :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=new Scanner(System.in).nextInt();
				
				
			}
		}
		System.out.println("Display Jagge Array :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
 