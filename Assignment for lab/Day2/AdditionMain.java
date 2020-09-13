package Day2;
import java.util.Scanner;
public class AdditionMain
{
	public static void main(String... args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of values u want to add");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		Addition add=new Addition(n,arr);
		System.out.println(add);
	}
}
