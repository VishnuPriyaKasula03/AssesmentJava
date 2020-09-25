package day2;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0,rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println("The reverse of given number is "+rev);
		
	}

}
