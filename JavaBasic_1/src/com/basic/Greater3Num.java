package com.basic;
import java.util.Scanner;

public class Greater3Num {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Any Three Number");
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();		
		
		if(num1>num2 && num1>num3) // logical && and operator Check Both Condition True then executed
		{
			System.out.println("Number: "+num1+" is Greater than "+num2+" And "+num3);
		}		
		else if(num1<num2 && num3<num2)
		{
			System.out.println("Number: "+num2+" is Greater than "+num1+" And "+num3);
		}else
		{
			
			System.out.println("Number: "+num3+" is Greater than "+num1+" And "+num2);
		}
		
		
		
scan.close(); // Object should be closed inside Main
	}

}
