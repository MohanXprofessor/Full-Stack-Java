package com.arrayofobject;
import java.util.Scanner;

class Student{ //Data Hold Class 
	
	private int id;
	private String name;
	
	public Student() {
		
		super();  
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	void input()
	{
		System.out.println("Enter id And Name :");
		
		id=new Scanner(System.in).nextInt();
		
		name=new Scanner(System.in).next();
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
		
}

public class ArrayOfObject {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("How many Student Record You want to Insert...!");
		int n=scan.nextInt();
		
		Student s[]=new Student[n];  // Object Array value 3
		
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Student(); // s[0] object call 
			s[i].input();
		}
		System.out.println("**********************");
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
		}

	}

}

