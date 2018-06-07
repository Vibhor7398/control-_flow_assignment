import java.util.Scanner;
public class palindrome {

	public static void checkPalindrome(int n)
	{
	int rev=0,rem=0,temp;
	temp=n;
	while(temp>0)
	{
		rem = temp%10;
		rev = rev*10 + rem;
		temp/=10;
	}
	if(rev==n)
	{
		System.out.print("Yes " + n + " is a palindrome.");
	}
	else
	{
		System.out.print("No " + n + " is not a palindrome.");
	}
	}
	
	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		checkPalindrome(number);
	}
}
