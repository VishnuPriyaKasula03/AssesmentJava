package Day3;

import java.util.Scanner;

public class ReplaceDs {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=(s.nextLine());
		String x=str.replaceAll("d", "h");
		x=x.replaceAll("D", "H");
		System.out.println(x);
		
		

	}

}
