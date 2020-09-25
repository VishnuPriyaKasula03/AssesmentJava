package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int x=s.nextInt();
		if(Arrays.binarySearch(a, x)>=0)
		System.out.println(x+" is Present in array");
		else
			System.out.println(x+" is not Present in array");
		
		

	}

}
