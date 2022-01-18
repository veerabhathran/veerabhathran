package Condition1;

import java.util.Scanner;

public class example7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
           int number;
           Scanner scanner = new Scanner(System.in);
           number = scanner.nextInt();
           if(number > 0)
           {
        	   if(number%2==0)
        	   {
        		   System.out.println("the number is even");
        	   }
        	   else
        	   {
        		   System.out.println("the number is odd");
        	   }
        	  
           }
           else
        	   
        	   {
        		   System.out.println(" The person is negative ");
        	   }
      
       		scanner.close();
           }
           
	}


