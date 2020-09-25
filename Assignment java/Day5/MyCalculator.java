package Day5;

public class MyCalculator 
{
	void Mycalculator()
	{
		
	}
	long power(int num1,int num2) throws PowerException
	{
		if(num1<0 || num2<0 || (num1==0 && num2==0))
			throw new PowerException(num1,num2);
		else
		return (long) Math.pow((double)num1,(double)num2);
	}
}
  