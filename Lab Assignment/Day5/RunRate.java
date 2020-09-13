package Day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRate 
{

	public static void main(String[] args) throws IOException 
	{
		try
		{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total runs scored");
		int r=Integer.parseInt(bf.readLine());
		System.out.println("Enter the total overs faced");
		int o=Integer.parseInt(bf.readLine());
			System.out.println("Current Run Rate : "+r/o);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}

	}

}
