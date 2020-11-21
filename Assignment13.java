//Program to print prime numbers between 10 and 99
class Assignment13
{
	public static void main (String[] args)
   {
       String  primeNumbers = "";

       for (int i = 10; i <= 99; i++)         
       {
       		int counter=0; 	  
         	for(int num =i; num>=1; num--)
	 	 	{
	 	 		if(i%num==0)
	 			{
 					counter = counter + 1;
	  		   }
	  		}
	 		if (counter ==2)
	 		{
	     		//Appended the Prime number to the String
	   			primeNumbers = primeNumbers + i + " ";
	 		}	
       }	
       System.out.println(primeNumbers);
   }
}