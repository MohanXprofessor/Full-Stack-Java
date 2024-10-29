package com.arrays;

public class Arrays {

	public static void main(String[] args) {
		
//		String Array
		
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		
//		for(int i=0;i<cars.length;i++)
//		{
//			
//			System.out.println(cars[i]);
//		}
		
//		OR
//		 displaying with index value
//		System.out.println(cars[0]);
		
		
		
		// Number Array
		
//		int[] myNum = {10, 20, 30, 40};
//		
//		System.out.println("1st way "+myNum[2]);
//		System.out.println();
//		
//		System.out.println("Second Way to print array :");
//		for(int i=0;i<myNum.length;i++)
//		{
//			
//			System.out.println(myNum[i]);
//		}
		
		
//		Using for each loop 
//		System.out.println();
//		System.out.println("Using for each loop :");
//		for(int s:myNum)
//			System.out.println(s);
		
		
		
		
		
		
//		Sum of Array
		int sum=0;
		int[] myNum = {10, 20, 30, 40};
		
		
		for(int num:myNum) {
		
			sum+=num;
		}
		
		int arrlen=(myNum).length;
		
		float result=sum/arrlen;
		
		
		System.out.println("Avarage :"+result);
	}
	

}

