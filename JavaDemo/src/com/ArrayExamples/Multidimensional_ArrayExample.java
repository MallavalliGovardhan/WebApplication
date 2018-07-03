package com.ArrayExamples;

public class Multidimensional_ArrayExample 
{
	public static void main(String[] args)
	{
		String a[][] = new String[3][3];
		
		a[0][0]= "Govardhan";
		a[0][1]= "Surya";
		a[0][2]= "Durga";
		
		a[1][0]= "Nag";
		a[1][1]= "Chitti";
		a[1][2]= "Ravi";
						
		a[2][0]= "Chinni";
		a[2][1]= "Nani";
		a[2][2]= "Vittu";
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
