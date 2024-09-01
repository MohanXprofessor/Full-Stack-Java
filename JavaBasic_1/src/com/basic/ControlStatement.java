package com.basic;
import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		//

		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=ob.nextInt();
		System.out.println("Number" +num);
		
		if(num%5==0 || num%11==0) //OR operator  any one condition true 
		{
			System.out.println("Number is divisiable by 5 OR 11\t" +num);
		}else
		{
			System.out.println("Number is not Divisiable ");
		}
		 
		
		
		
		ob.close();
	}

}
