package HWPrimeNumber;

import java.util.Scanner;

public class PrimeNumberPrint {
	
	public class PrimeNumber{
		public static boolean isPrime(int num) {
			if(num <=1)
			{
				return false;
			}
			for (int i = 2; i<=Math.sqrt(num); i++)
			{
				if(num %i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		// Gets the number from the user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = scanner.nextInt();
		scanner.close();
		if (isPrime(num))
		{
			System.out.println(num +" is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
		

	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		return false;
	}

}
