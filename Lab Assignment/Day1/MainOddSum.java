package Day1;
import java.util.Scanner;
public class MainOddSum {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		CheckSum cs=new CheckSum(s.nextInt());
		if(cs.OddSum()==1)
		    System.out.println("Sum of odd digits is odd");
		else
			System.out.println("Sum of odd digits is even");	
		
	}

}
