package Day1;
import java.util.Scanner;
public class IsPrime {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		int k=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				k=1;
		}
		if(k==0)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
		
		
	}

}
