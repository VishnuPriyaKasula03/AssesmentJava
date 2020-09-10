package Day2;
import java.util.Scanner;
public class MiddleChar 
{
	public static void main(String...args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=s.next();
	int n=str.length();
	if(n%2==0)
		System.out.println("The middle characters in the string are "+str.charAt(n/2-1)+str.charAt(n/2));
	else
		System.out.println("The middle character in the string is "+str.charAt(n/2));

	}
}
