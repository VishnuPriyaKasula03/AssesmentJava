package Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {

	public static void main(String[] args) 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend:");
		int dvdnd=sc.nextInt();
		System.out.println("Enter divisor:");
		int dvsr=sc.nextInt();
		int q;
			q=dvdnd/dvsr;
		}
		catch(ArithmeticException ae)
		{
			System.err.println(ae);
		}catch(InputMismatchException ae)
		{
			System.err.println(ae);
		}
		
		
	}

}
