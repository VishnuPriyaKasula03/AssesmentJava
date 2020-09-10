package Day1;
import java.util.Scanner;
public class MainEvenSumSq {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		CheckSum cs=new CheckSum(s.nextInt());
		
		    System.out.println("Sum of even digits is "+cs.EvenSumSq());
		
		
	}

}
