package day1;
import java.util.Scanner;
public class RepeatedAlpha {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.next();
		int[] f=new int[str.length()];
		for(int i=0;i<str.length();i++)
		{
				f[i]=0;
		}
		for(int i=0;i<str.length();i++) 
		{
			for(int k=i+1;k<str.length();k++)
			{
				if(str.charAt(i)==str.charAt(k))
				{
					f[i]++;
				}
			}
		}
		int max=f[0];
		for(int i=0;i<str.length();i++)
		{
			if(max<f[i])
				max=f[i];
		}
		System.out.println("The character \""+str.charAt(max)+"\" in String \""+str+"\" is mostly repeated that is for "+max+" times");

	}

}
