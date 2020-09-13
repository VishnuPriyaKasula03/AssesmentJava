package Day1;
import java.util.Scanner;
public class Average {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("Average :"+(double)(a+b+c)/3);
		
		
	}

}
