package com.arrays;

import java.util.Scanner;

class DemoArray    //Service Class
{
	 int [] input()
		{
			int a[]=new int[5];
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Array Element :");
			for(int i=0;i<a.length;i++)
			{
				a[i]=scan.nextInt();
			}
			scan.close();
			return a;
		}
		
		static void display(int sd[])
		{
			System.out.println("Display Array Element :");
			for(int i=0;i<sd.length;i++)
			{
				System.out.print(sd[i]+" ");;
			}
		}
}
public class Array1D2method { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoArray ob=new DemoArray();  // Service class Called with object
		int b[]=ob.input();
		
		//Call with static keyword    classname.static function name because display is static 
		DemoArray.display(b); 
	}

}
