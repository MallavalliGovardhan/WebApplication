package com.ArrayExamples;
public class ObjectArrayExample 
{
	public static void main(String[] args) 
	{
		Object []a = new Object[3];
		a[0]=10;
		a[1]="Selenium";
		a[2]=13.45;
		for(Object i:a)
		//or
		//for(int i=0;i<a.length;i++)
		{
			System.out.println(i);
		}
	}

}
