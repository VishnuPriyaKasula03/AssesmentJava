package Day1;

import java.util.Scanner;

public class LongestWord 
{
	public static void main(String... args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str=s.nextLine();
		String b[]=str.split(" ");
		int max=b[0].length();
		int k=0;
		for(int i=0;i<b.length;i++)
		{
			if(max<b[i].length())
			{
				max=b[i].length();
				k=i;
			}	
		}
		System.out.println("The longest word in the sentence is "+b[k]);
	}

}
