package Day2;
import java.util.Scanner;
public class Inherit 
{
	public static void main(String... args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 6 numbers");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		int u=sc.nextInt();
		B ab =new B(p,q,r,s,t,u);
		System.out.println("p:"+ab.p);
		System.out.println("p:"+ab.q);
		System.out.println("p:"+ab.r);
		System.out.println("p:"+ab.s);
		System.out.println("p:"+ab.t);
		System.out.println("p:"+ab.u);
		

		

	}
}
