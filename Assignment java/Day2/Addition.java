package Day2;

import java.util.Arrays;

public class Addition 
{
	int count;
	int[] n=new int[count];
	public Addition(int count, int[] n) 
	{
		super();
		this.count = count;
		this.n = n;
	}
	@Override
	public String toString() {
		int sum=0;
		String str="";
		for(int i=0;i<n.length;i++)
		{
			if(i==0)
				str+=Integer.toString(n[i]);
			else
			    str+="+"+Integer.toString(n[i]);
			sum+=n[i];
		}
		return String.format(str+"="+sum);
	}
	
	
}
