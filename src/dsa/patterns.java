package dsa;
import java.util.Scanner;
import java.lang.Math;
public class patterns {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		pattern8(n); 
	}
	static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern2(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	static void pattern5(int n)
	{
		for(int i=1;i<= 2*n;i++)
		{
			int totcols = (i > n) ? 2*n - i  : i;
			for(int j=1;j<= totcols;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	static void pattern6(int n)
	{
		for(int i=1;i<= 2*n;i++)
		{
			int totcols = (i > n) ? 2*n - i  : i;
			int spaces= n-totcols;
			for(int s=0;s < spaces;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<= totcols;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	static void pattern7(int n)
	{
		for(int row = 1;row <=n;row++)
		{
			for(int space=0;space < n-row;space++)
			{
				System.out.print("  ");
			}
			for(int col = row;col >= 1;col--)
			{
				System.out.print(col+" ");
			}
			for(int col = 2;col <= row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
	}
	static void pattern8(int n)
	{
		for(int row = 1;row <= 2*n;row++)
		{
			int c = (row > n) ? 2*n - row  : row;
			{
				for(int space=0;space < n-c;space++)
				{
					System.out.print("  ");
				}
				for(int col = c;col >= 1;col--)
				{
					System.out.print(col+" ");
				}
				for(int col = 2;col <= c;col++)
				{
					System.out.print(col+" ");
				}
				System.out.println();
			
			}
		}
	}	
}
