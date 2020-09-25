package Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException 
{
	public static void main(String args[])
	{
	try
	{
	BufferedReader bf=new BufferedReader(new FileReader("xxxx"));
	System.out.println(bf);
	}
	catch(FileNotFoundException e)
	{
		System.err.println(e);;
	}
	}
	
}
