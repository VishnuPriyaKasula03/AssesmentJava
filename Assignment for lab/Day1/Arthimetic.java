package Day1;

import java.util.Scanner;

public class Arthimetic 
{
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Select your choice");
		System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Modulo Division");
		int ch=s.nextInt();
		System.out.println("Enter first number:");
		int n1=s.nextInt();
		System.out.println("Enter second number:");
		int n2=s.nextInt();
		switch(ch)
		{
		case 1:
		{
			System.out.println("Addition :"+(n1+n2));
			break;
		}
		case 2:
		{
			System.out.println("Subraction :"+(n1-n2));
			break;
		}
		case 3:
		{
			System.out.println("Multiplication :"+(n1*n2));
			break;
		}
		case 4:
		{
			System.out.println("Division :"+(n1/n2));
			break;
		}
		case 5:
		{
			System.out.println("Modulo Division :"+(n1%n2));
			break;
		}
		default:
		{
			System.out.println("Enter a valid choice");
			break;
		}
			
		}
		
		
		
	}
}
