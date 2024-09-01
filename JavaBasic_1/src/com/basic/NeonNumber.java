package com.basic;

import java.util.Scanner;




public class NeonNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=scan.nextInt();
		
		isNeon(num);   // Static Function or Method  Calling 
	}
	
	
	
	
		static void isNeon(int num)
		{
			int square=num*num;
			
			System.out.println("You Enter Number square :"+square);
			int digit;
			int sum=0;
			while(square!=0)
			{
				digit=square%10;
				sum+=digit;
				square/=10;
				
			}
			
			System.out.println("Sum of Square Number is : "+sum);
			
			if(sum==num)
			{
				System.out.println();
				
				System.out.println("Neon Number");
			}else
			{
				System.out.println("NOT Neon Number");
				
			}
		
	}

}
