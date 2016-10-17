// MathLab0404st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the MathLab04 assignment.



import java.text.DecimalFormat;
import java.util.Scanner;


 
public class MathLab04st
{
	static int MAX;
	public static void main(String args[]) 
	{
		System.out.println("\nMathLab04\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		MAX = input.nextInt();
		boolean primes[] = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		
		for (int k = 1; k<MAX; k++)
		{
			primes[k] = true;
				
		}
		for(int a = 1; a < MAX/2; a++ )
		{
			if (primes[a] == true)
			{
				for (int z=(a+1)*2;z<MAX;z+=a+1)
				{
					primes[z-1] = false; 
				}
			}
		}
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		for (int b = 1; b<MAX; b++)
		{
			if (primes[b-1]==true)
			{
				
				System.out.print(b+" ");
			}
		}
				
	}
	
}



