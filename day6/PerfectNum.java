package com.brz.day6;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args)
	{
		int i,n,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");
		n=input.nextInt();
		
		for(i=1; i<n; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				}
		}
		if(sum==n)
		{
			System.out.println("perfect number");
		}
			
		else
		{
			System.out.println("not a perfect number");
		}
		}
}
