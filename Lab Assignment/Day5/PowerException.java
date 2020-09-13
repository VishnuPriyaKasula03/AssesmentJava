package Day5;

public class PowerException extends Exception 
{
	int n,p;
	
	public PowerException(int n, int p) {
		super();
		this.n = n;
		this.p = p;
	}
	@Override
	public String getMessage() 
	{
		if(n==0 && p==0)
			return "n and p should not be zero.";
		if(n<0 || p<0)
			return "n or p should not be negitive.";
		return super.getMessage();
		
		
	}
	

}
