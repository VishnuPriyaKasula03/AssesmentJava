package Day3;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String k=s.nextLine();
		StringBuffer sb=new StringBuffer(k);
		String x=(sb.reverse()).toString();
		if(k.equals(x))
		System.out.println("Yes");
		else
		System.out.println("No");
			
		
		

	}

}
