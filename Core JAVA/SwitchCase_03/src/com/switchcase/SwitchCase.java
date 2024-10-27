package com.switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner Scan=new Scanner(System.in);
		        int choice;
		        
		        do {
		            // Display the menu
		            System.out.println("Calculator Menu:");
		            System.out.println("1. Addition");
		            System.out.println("2. Subtraction");
		            System.out.println("3. Multiplication");
		            System.out.println("4. Division");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            
		            // Read user choice
		            choice = Scan.nextInt();
		            
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter two numbers: ");
		                    int add1 = Scan.nextInt();
		                    int add2 = Scan.nextInt();
		                    System.out.println("Result: " + (add1 + add2));
		                    break;

		                case 2:
		                    System.out.print("Enter two numbers: ");
		                    int sub1 = Scan.nextInt();
		                    int sub2 = Scan.nextInt();
		                    System.out.println("Result: " + (sub1 - sub2));
		                    break;

		                case 3:
		                    System.out.print("Enter two numbers: ");
		                    int mul1 = Scan.nextInt();
		                    int mul2 = Scan.nextInt();
		                    System.out.println("Result: " + (mul1 * mul2));
		                    break;

		                case 4:
		                    System.out.print("Enter two numbers: ");
		                    int div1 = Scan.nextInt();
		                    int div2 = Scan.nextInt();
		                    if (div2 != 0) {
		                        System.out.println("Result: " + (div1 / div2));
		                    } else {
		                        System.out.println("Error: Division by zero");
		                    }
		                    break;

		                case 5:
		                    System.out.println("Exiting the program.");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please try again.");
		                    break;
		            }
		            System.out.println(); // Blank line for spacing
		        } while (choice != 5); // Continue until the user chooses to exit

		        Scan.close();
		    }
		

	

}
