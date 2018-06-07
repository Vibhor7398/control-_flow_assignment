package leapYear;
import java.util.Scanner;

public class leapYear {

	public static void checkYear(int yr)
	{
		if(yr%4==0)
		{
			if(yr%100==0)
			{
				if(yr%400==0)
				{
					System.out.print(yr + " is a leap year.");
				}
				else
				{
				System.out.print(yr + " is not a leap year.");
				}
			}
			else
			{
				System.out.print(yr + " is a leap year.");
			}
		}
		else
		{
			System.out.print(yr + " is not a leap year.");
		}
	}
	public static void main(String a[])
	{
		int year;
		Scanner s = new Scanner(System.in);
		year = s.nextInt();
		checkYear(year);
	}
}
