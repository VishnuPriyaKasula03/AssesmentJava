package day1;
import java.util.Scanner;
public class ScannerUsage {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter some text ! I will take it using Scanner");
		String str=s.nextLine();
		System.out.println("Here ur text,,"+str);
		System.out.println("Now try giving an integer");
		int n=s.nextInt();
		System.out.println("Here ur integer,"+n);
		System.out.println("Now a double");
		double d=s.nextDouble();
		System.out.println("Here ur double,"+d);
	}

}
