package conditionalStatement;

public class NestedIf {

	public static void main(String[] args)
	{
		int x=40;
		int y=20;
		int z=60;
		
		if(x>y)
		{
			System.out.println("x is greater");
		}
		else
			if(y>z)
			{
				System.out.println("Y is greater");
			}
			else
			{
				System.out.println("Z is greater");
			}
		

	}

}
