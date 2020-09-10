package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("In sorted order");
		for(int i:a)
			System.out.println(i);
		
		

	}

}
