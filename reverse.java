import java.util.Scanner;

public class reverse {
	
	public static void reverseNumber(int n)
	{
		int rev = 0, rem = 0, temp;
		temp = n;
		while(temp>0)
		{
			rem = temp%10;
			rev = rev*10 + rem;
			temp/=10;
		}
		System.out.print("Reverse of " + n + " is " + rev);
	}
	
	public static void main(String a[])
	{
		Scanner r = new Scanner(System.in);
		int  num = r.nextInt();
		reverseNumber(num);
	}

}
