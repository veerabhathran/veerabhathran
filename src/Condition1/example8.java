package Condition1;

import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int mark;
           Scanner scanner = new Scanner(System.in);
           mark = scanner.nextInt();
           if ( mark<100 && mark<=70)
           {
        	   System.out.println("Destinction");
    
           }
           else if (mark<70 && mark<=60)
           {
        	   System.out.println("First class");
           }
           if ( mark<60 && mark<=50)
           {
        	   System.out.println(" Second class ");
    
           }
           else if (mark<50 && mark<=49)
           {
        	   System.out.println(" Third class ");
        	   
           }
           else if (mark == 40)
           {
        	   System.out.println(" Pass ");
        	   
           }
           else if (mark < 40 )
           {
        	   System.out.println(" fail ");
        	   
           }
           
           scanner.close();;
	}  
           
         
	}
