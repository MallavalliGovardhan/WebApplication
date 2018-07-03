package com.ArrayExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args)
	{
		//List<String>a= new ArrayList<>();
		List<Integer>a= new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(36);
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+" ");
		}
		
	}

}
