package Day2;
public class Room 
{
	int roomno;
	String roomtype;
	double roomarea;
	String acmachine;
	public Room()
	{
		
	}
	public Room(int roomno, String roomtype, double roomarea, String acmachine) 
	{
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.acmachine = acmachine;
	}
	public void displayData() 
	{
		System.out.println("Room no:"+this.roomno);
		System.out.println("Room Type:"+this.roomtype);
		System.out.println("Room Area:"+this.roomarea);
		System.out.println("Room Ac machine:"+this.acmachine);
	}
	
	
}
