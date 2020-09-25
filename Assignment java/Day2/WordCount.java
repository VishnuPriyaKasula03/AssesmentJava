package day2;

import java.util.Scanner;

public class WordCount 
{
	public static void main(String... args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str=s.nextLine();
		String b[]=str.split(" ");
		System.out.println("Number of words in the sentence is "+b.length);
	}

}
