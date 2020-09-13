package day1;

public class ArgumentAccess 
{
	public static void main(String... args)
	{
		System.out.println("Enter the Name(String),Mobile number(Integer) and Salary(double) in command prompt");
		System.out.println("Employee Name:"+args[0]);
		System.out.println("Employee mobile number:"+Integer.parseInt(args[1]));
		System.out.println("Employee Salary:"+Double.parseDouble(args[2]));	
	}

}

