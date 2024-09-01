package com.basic;

import java.util.Scanner;

public class CharIsAlphabet {

	// to check weather a character is alphabet or not
	public static void main(String[] args) {
		System.out.println("Enter a Alphabet :");
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') // Logical && used for Both condition should be true then it will Executed.
		{
			System.out.println("  Letter:");
		}
		else 
		{
			System.out.println(" Not Letter:");
		}
		scan.close();
	}

}
