package com.arrays;

import java.util.Scanner;

public class UserInptArray1D {

	
	
	public static void main(String[] args) {
		
// subscript []
		char a[]=new char[5]; //Array Declare
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.next().charAt(0);
//			
		}
		
		System.out.println("Display Array Element :");
		for(int i=0;i<a.length;i++)
		{
		
			System.out.print(a[i]+" ");
//			
		}
		scan.close();
	}

}
