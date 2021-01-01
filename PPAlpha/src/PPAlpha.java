import java.util.Scanner;
public class PPAlpha {
	public static void main(String st[])
	{
		Scanner x = new Scanner(System.in);
		int n;
		char ch='A';
		System.out.println("Enter the value of n:");
		n=x.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<(n-i);j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.print("\n");
		}
		x.close();
	}
}
