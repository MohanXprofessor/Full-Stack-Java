package com.typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		
//		Widening Casting (automatically) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
		
		
		
//			    int myInt = 9;
//			    double myDouble = myInt; // Automatic casting: int to double
//
//			    System.out.println(myInt);      // Outputs 9
//			    System.out.println(myDouble);   // Outputs 9.0
			  
			

	
	
	
	
//	Narrowing Casting (manually) - converting a larger type to a smaller size type
//	double -> float -> long -> int -> char -> short -> byte
			    
//			    Narrowing casting must be done manually by placing the type in parentheses () in front of the value:
			    
			    double myDouble = 9.78d;
			    int myInt = (int) myDouble; // Manual casting: double to int

			    System.out.println(myDouble);   // Outputs 9.78
			    System.out.println(myInt);      // Outputs 9
			    
			    

}
}