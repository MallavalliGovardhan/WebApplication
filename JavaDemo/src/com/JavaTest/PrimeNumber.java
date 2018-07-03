package com.JavaTest;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int i,m=0,flag=0;
		int n=100;
		
		m=n/2;
		if (n==0||n==2)
		{
			System.out.println(n+"is not Prime number");
		}
		else
		{
			for(i=100;i<m;i++)
				
				if(n%i==0)
			{
				System.out.println(n+"is not Prime number");
				flag=1;
				break;
			}		
		}
		if(flag==0)
		{
			System.out.println(n+"is prime number");
		}
			
		
		
		
	}

}
