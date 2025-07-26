package Exceptionss;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		//a= 1/1; One
		//a= 1/0; Infinity
		//a= 0/1; Zero
		
		try
		{
		
		int a = 1/0;
		
		System.out.println(a);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Handeled the exception");;
		}

	}

}
