package com.basic;

import java.util.Scanner;

public class Greater2Num {

	// Check maximum number
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Any two Number");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		// if  else  Condition 
		if (num1 > num2) {
			System.out.println("Number: " + num1 + " is Greater than :" + num2);
		} else {

			System.out.println("Number: " + num2 + " is Greater than :" + num1);
		}
		scan.close();
	}

}
