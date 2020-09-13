package DAY4;
import java.util.Scanner;
  class MyCalculator implements AdvancedArithmetic {
		public int divisor_sum(int n) 
		{
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					sum+=i;
			}
			return sum;
	  }
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int n=new Scanner(System.in).nextInt();
		MyCalculator m=new MyCalculator();
		System.out.println("I implemented: AdvancedArithmetic");
		System.out.print(m.divisor_sum(n));

	}

	
	}


