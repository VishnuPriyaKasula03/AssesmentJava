package Day1;
import java.util.Scanner;
public class Swap {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers to be swapped\nEnter a:");
		int a=s.nextInt();
		System.out.println("Enter b:");
		int b=s.nextInt();
		b=(a+b)-(a=b);
		System.out.println("After swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

}
