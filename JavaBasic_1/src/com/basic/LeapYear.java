package com.basic;
import java.util.Scanner;

public class LeapYear {

	/*Write a java Program  to Check Leap Year ?
	 * 2 LOGIC 
		 * 1. Century (100%==0 && 400%==0) leap year 2000 2400
		 * 2. Yearly (100!=0 && 4%==0)  leap year 2020 2024
		 * */
	public static void main(String[] args) {

		
		System.out.println("Enter Any Year :");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) // Logic OR Operator mean Any one condition is True it will executed
		{
			System.out.println("Leap Year");
		}else
		{
			System.out.println("NOT Leap Year");
			
		}
		
scan.close();
}

}
