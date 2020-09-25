package Day3;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=(s.nextLine());
		System.out.println("Enter from index");
		int f=s.nextInt();
		System.out.println("Enter to index");
		int t=s.nextInt();
		System.out.println("Substring is "+str.substring(f, t));
		
		

	}

}
