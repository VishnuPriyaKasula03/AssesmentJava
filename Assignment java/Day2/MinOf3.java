package Day2;
import java.util.Scanner;
public class MinOf3 
{
	public static void main(String... args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int sml,c=s.nextInt();
		if(a<b && a<c)
			sml=a;
		else if(b<a && b<c)
			sml=b;
		else
		{
			sml=c;
		}
		System.out.println("The smallest of 3 numbers is "+sml);
		
	}
}
