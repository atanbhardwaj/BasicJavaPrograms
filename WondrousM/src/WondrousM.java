import java.util.Scanner;
import java.lang.Math;
public class WondrousM {
	public static void main(String st[])
	{
		Scanner x = new Scanner(System.in);
		int i,j,n,sum=0,count=0,temp=0,p,np=0;
		double k;
		System.out.print("Enter the dimension of the matrix \n");
		n=x.nextInt();
		k=0.5*n*((n*n)+1);
		int [][]ar=new int[n][n];
		System.out.print("Enter elements in the matrix \n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				ar[i][j]=x.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				temp=ar[i][j];
				np=0;
				for(p=2;p<=Math.sqrt(temp);p++)
				{
					if(temp%p==0)
					{
						np++;
						break;
					}
				}
				if(np==0&&temp!=1)
					System.out.print("\nPrime: "+ar[i][j]+"\nRow Index: "+i+"\nColumn Index "+j);
				sum+=ar[i][j];
			}
			if(sum==k)
			{
				sum=0;
				count++;
			}
			else
			{
				count=0;
				break;
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				sum+=ar[j][i];
			}
			if(sum==k)
			{
				sum=0;
				count++;
			}
			else
			{
				count=0;
				break;
			}
		}
		if(count!=0)
			System.out.print("\nYes it represents a wondrous matrix ");
		else
			System.out.print("\nIt does not represents a wondrous matrix ");
		x.close();	
	}


}
