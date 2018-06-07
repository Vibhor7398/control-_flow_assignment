import java.util.Scanner;
public class Sum {
	
	public static int sumNumbers()
	{
		int a,b,sum;
		Scanner S1 = new Scanner(System.in);
		a = S1.nextInt();
		b = S1.nextInt();
		sum = a + b;
		
		return sum;
	}
	
	public static void main(String a[])
	{
		int sum = sumNumbers();
		
		System.out.print("Sum is " + sum);
	}

}
