import java.util.Scanner;
public class maxOf3 {
	
	public static int checkMax(int a, int b, int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				return a;
			}
			else
			{
				return c;
			}
		}
		else
		{
			if(b>c)
			{
				return b;
			}
			else
			{
				return c;
			}
		}
	}
	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		int max = checkMax(x, y, z);
		
		System.out.print("Maximum of them is " + max);
		
	}
	
	

}
