package com.twodarray;
import java.util.Scanner;

public class Add2Matrix {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Enter Row of Matrix :");
		int row=scan.nextInt();
		System.out.println("Enter Column of Matrix :");
		int col=scan.nextInt();
		
		int array1[][]=new int [row][col];  //User input size of row and column 
		
		int array2[][]=new int [array1.length][array1.length]; // fetch size of array 1 row and column
		
		int array[][]=new int [array1.length][array1.length]; // fetch size of array 1 row and column
		
		System.out.println("Enter 1st Matrix Element :");
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				array1[i][j]=scan.nextInt();
			}
		}
		
		// Display 
//		System.out.println("Display 1st Matrix");
//		for(int i=0;i<array1.length;i++)
//		{
//			for(int j=0;j<array1.length;j++)
//			{
//				System.out.print(array1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		// Second Matrix 
		System.out.println();
		System.out.println("Enter 2nd Matrix Element :");
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				array2[i][j]=scan.nextInt();
			}
		}
		
		// Display 
		
//		System.out.println("Display 2nd matrix :");
//		for(int i=0;i<array2.length;i++)
//		{
//			for(int j=0;j<array2.length;j++)
//			{
//				System.out.print(array2[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println();
		
		// Sum of Matrix

		System.out.println("Added Matrix is :");
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				array[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();

	}

}

