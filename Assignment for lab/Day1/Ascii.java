package Day1;
import java.util.Scanner;
public class Ascii {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Ener a character");
		char c=(s.next()).charAt(0);
		int n=(int)c;
		System.out.println("The ascii value of "+c+" is "+n);
	}

}
