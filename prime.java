import java.util.Scanner;

public class prime {
	
	public static void checkPrime(int n)
	{
		int i,flag=0;
		for(i=2 ; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("Yes " + n + " is a prime number.");
		}
		else
		{
			System.out.print("No " + n + " is not prime.");
		}
	}
	
	public static void main(String a[])
	{
		Scanner n = new Scanner(System.in);
		int number = n.nextInt();
		checkPrime(number);
	}

}
