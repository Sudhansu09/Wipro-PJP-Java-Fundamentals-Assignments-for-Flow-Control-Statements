/*Program to print true if last digit of given two numbers are same
Otherwise print false*/
class Assignment1B
{
	public static void main(String args[])
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);

		num1=num1%10;
		num2=num2%10;

		if(num1==num2)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("False");
		}
	}
}