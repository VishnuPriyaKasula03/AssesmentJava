package day1;
import java.util.Scanner;
public class SearchAlpha {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		System.out.println("Enter the character to be searched");
		char ch=(sc.next()).toLowerCase().charAt(0);
		int o=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.toLowerCase().charAt(i)==ch)
				o++;
		}
		System.out.println("The character \""+ch+"\" in String \""+str+"\" is repeated for "+o+" times");

	}

}
