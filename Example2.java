package Exceptionss;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		try {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Please enter the size of an array");
		int rollno[] = new int[S1.nextInt()];
		
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Please enter the value of an array index-->"+i); 
			rollno[i] = S1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		S1.close();
		}
		catch(NegativeArraySizeException e1)
		{
			System.out.println("Array size can not be negative");
			Scanner S1 = new Scanner(System.in);
			System.out.println("Please enter the size of an array");
			int rollno[] = new int[S1.nextInt()];
			
			for(int i=0;i<rollno.length;i++)
			{
				System.out.println("Please enter the value of an array index-->"+i); 
				rollno[i] = S1.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			S1.close();
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Enter the valu in int");
			Scanner S1 = new Scanner(System.in);
			System.out.println("Please enter the size of an array");
			int rollno[] = new int[S1.nextInt()];
			
			for(int i=0;i<rollno.length;i++)
			{
				System.out.println("Please enter the value of an array index-->"+i); 
				rollno[i] = S1.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			S1.close();
		}
		
	   finally   // finally block will execute what ever it may be.
	   {
		   System.out.println("Finally Nanilly");
	   }
	
	
	}

}
