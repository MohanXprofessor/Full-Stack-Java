package arrayInput;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		int array[]=new int[5];
		
		System.out.println("Enter Array Element :");
		
		//To take input from user
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		
		//Display
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
		
	}

}
