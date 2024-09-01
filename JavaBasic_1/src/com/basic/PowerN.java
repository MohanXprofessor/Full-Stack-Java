package com.basic;

import java.util.Scanner;

public class PowerN {
	int findPower(int num,int pow)
	 {
		 int product=1;
		
		 for(int i=0;i<pow;i++)
		 {
			 product=product*num;
			 
			 
		 }
		return product;
		 
	 }
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter a Base Number :");
		int num=scan.nextInt();
		System.out.println("Enter a Index Number :");
		int pow=scan.nextInt();
		
		PowerN ob=new PowerN();
		
		int result=ob.findPower(num,pow);
		
		System.out.println("Product is :"+result);
		scan.close();
	}

}
