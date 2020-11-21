//program to check given number is odd or even
class Assignment2
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);

		if(num%2==0)
		{
			System.out.print(num+"  is Even");
		}
		else
		{
			System.out.print(num+"  is Odd");
		}
	}
}