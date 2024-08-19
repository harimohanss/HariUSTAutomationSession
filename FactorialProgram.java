package Factorial;

public class FactorialProgram {
	
	public static void main(String[] args)
	{
		System.out.println("Factorial of 7 is  " + fact(7));
	}	
		//Recursions
		static int fact(int n)
		{
			if(n ==1)
				return 1;
			else {
				return n *fact (n-1);
			}
		}
		
	}


