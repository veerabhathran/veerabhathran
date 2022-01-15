package Condition1;

import java.util.Scanner;

public class example6 
{

	public static void main(String[] args) 
	{
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter age:");
		age = scanner.nextInt();
		if(age >= 18)//condition
		
			System.out.println("the person is major");
		
		else
		
			System.out.println("the person is minor");
		
		
		scanner.close();
		
	}


}
