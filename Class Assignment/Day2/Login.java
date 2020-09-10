package day2;
import java.util.Scanner;
public class Login 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username:");
		String un=s.nextLine();
		System.out.println("Enter password:");
		String pw=s.nextLine();
		LoginUser u=new LoginUser(un,pw);
		System.out.println(u);
	}

}
