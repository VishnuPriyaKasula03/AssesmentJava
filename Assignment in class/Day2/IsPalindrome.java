package day2;
import java.util.Scanner;
public class IsPalindrome {
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int org=n;
		int rev=0,rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(org==rev)
		System.out.println(org+" is a Palindrome");
		else
		System.out.println(org+" is not a Palindrome");	
		
	}

}
