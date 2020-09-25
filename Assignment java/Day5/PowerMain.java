package Day5;

import java.util.Scanner;

public class PowerMain 
{
	public static void main(String args[]) throws PowerException
	{
		Scanner s=new Scanner(System.in);
		MyCalculator mc=new MyCalculator();
		System.out.println("Enter base:");
		int num1=s.nextInt();
		System.out.println("Enter exponent:");
		int num2=s.nextInt();
		try
		{
		System.out.println(mc.power(num1, num2));
		}
		catch(PowerException pe)
		{
			System.err.println(pe.getMessage());
		}
	}
}
