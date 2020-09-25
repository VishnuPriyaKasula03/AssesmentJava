package Day2;
import java.util.Scanner;
public class RoomMain 
{
	public static void main(String... args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Room no:");
		int rn=s.nextInt();
		System.out.println("Enter Room Type:");
		String rt=s.next();
		System.out.println("Enter Room Area:");
		double ra=s.nextDouble();
		System.out.println("Enter Room Ac machine:");
		String ram=s.next();
		Room r=new Room(rn,rt,ra,ram);
		r.displayData();
		
	}
}
