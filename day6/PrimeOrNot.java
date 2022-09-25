package com.brz.day6;
import java.util.Scanner;

public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		int temp;
		boolean isPrime=true;
		Scanner input =new Scanner(System.in);
		System.out.println("enter the number");
		int num=input.nextInt();
		
		for(int i=2; i<=num/2; i++)
		{
				temp=num/i;
		if(temp==0)
			{
				isPrime=false;
					break;
			}
		}
			if(isPrime) 
				System.out.println(num+ " is prime number");
			else 
		
				System.out.println(num+ "is not a prime number");
	}
}