//Program to check Initialized value is Alphabet, Digit or Special Character
class Assignment5
{
	public static void main(String args[])
	{
		char ch=args[0].charAt(0);

		if((ch>='a' && ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.print("Alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.print("Digit");
		}
		else
		{
			System.out.print("Special Character");
		}
	}
}