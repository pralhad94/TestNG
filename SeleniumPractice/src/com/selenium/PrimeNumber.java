package com.selenium;

public class PrimeNumber {

	public static void main(String[] args) {
	
		
		int num=99;
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
					count++;
			}
			
			if(count==2)
			{
				System.out.println("prime numbr");
			}
			else
			{
				System.out.println(" not a prime number");
			}
				
		}
		
		else
		{
			System.out.println(" not a prime number");
		}

	}

}
