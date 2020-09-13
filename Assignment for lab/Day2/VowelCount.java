package Day2;
import java.util.Scanner;
public class VowelCount 
{
	public static void main(String...args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=s.nextLine().toLowerCase();
	int n=str.length();
	int k=0;
	for(int i=0;i<n;i++)
	{
		char c=str.charAt(i);
	if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
		k++;
	}
	System.out.println("Number of vowels in the string :"+k);
	}
}
