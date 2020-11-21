//Program to display the given two characters in alphabetical order
class Assignment4
{
	public static void main(String args[])
	{
		char ch1=args[0].charAt(0);
		char ch2=args[1].charAt(0);

		int diff=ch1-ch2;

		if(diff>0)
		{
			System.out.print(ch2+", "+ch1);
		}
		else if(diff<0)
		{
			System.out.print(ch1+", "+ch2);
		}
		else if(diff==0)
		{
			System.out.println(ch1+", "+ch2);
		}
		else
		{
			System.out.print("Invalid Input");
		}
	}
}