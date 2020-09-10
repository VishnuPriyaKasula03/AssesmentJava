package Day1;

public class CheckSum
{
	int num;
	public CheckSum(int num)
	{
		super();
		this.num = num;
	}
	public int OddSum()
	{
		String n=Integer.toString(this.num);
		int sum=0;
		for(int i=0;i<n.length();i++)
		{
			if(i%2==1)
			{
				String str=""+n.charAt(i);
				sum+=Integer.parseInt(str);
			}
				
		}
		if(sum%2==0)
			return -1;
		else
			return 1;
	}
	public int EvenSumSq()
	{
		String n=Integer.toString(this.num);
		int sum=0;
		for(int i=0;i<n.length();i++)
		{
			if(i%2==0)
			{
				String str=""+n.charAt(i);
				sum+=Integer.parseInt(str)*Integer.parseInt(str);
			}
				
		}
			return sum;
	}
	

}
