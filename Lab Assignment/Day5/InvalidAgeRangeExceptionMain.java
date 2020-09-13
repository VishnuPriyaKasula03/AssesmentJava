package Day5;

import java.util.Scanner;

public class InvalidAgeRangeExceptionMain 
{
	public static void  main(String args[])throws CustomException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter player name");
		String pn=s.nextLine();
		System.out.println("Enter player age");
		int pa=s.nextInt();
		try
		{
		if(pa<19)
			throw new CustomException();
		else
		{
			System.out.println("Player name : "+pn);
			System.out.println("Player age : "+pa);

		}
		}
		catch(CustomException ce)
		{
			System.err.println(ce.getMessage());
		}
	}

}
