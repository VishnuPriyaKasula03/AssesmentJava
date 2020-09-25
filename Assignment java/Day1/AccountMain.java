package day1;
import java.util.Scanner;
public class AccountMain {
	public static void main(String[] args) throws NumberFormatException,ArrayIndexOutOfBoundsException{

        Scanner s=new Scanner(System.in);
        System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
        int n=s.nextInt();
        s.nextLine();
        String com;
        String cs[];
   
        if(n==1)
        {
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
            com=s.nextLine();
            cs=com.split(",",0);
            Account sa=new SavingsAccount(cs[0],cs[1],cs[2],cs[3]);
            sa.display();
        }
        else
        {
             System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
            com=s.nextLine();
            cs=com.split(",",0);
            Account ca=new CurrentAccount(cs[0],cs[1],cs[2],cs[3]);
            ca.display();
        }
	}
}
