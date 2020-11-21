//Program to check given number is Positive, Negative or Zero
class Assignment1A
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);

		if(num>0)
		{
			System.out.print(num+"  is Positive.");
		}
		else if(num<0)
		{
			System.out.print(num+"  is Negative.");
		}
		else if(num==0)
		{
			System.out.print("Entered number is Zero.");
		}
		else
		{
			System.out.print("Invalid Input.");
		}
	}
}