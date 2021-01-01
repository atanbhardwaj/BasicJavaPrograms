import java.util.Scanner;
public class Matrix90 {
	public static void main(String st[])
	{
		Scanner x = new Scanner(System.in);
		int r, i, j, p = 0, q = 0;
		System.out.println("Enter Dimension of the Matrix: \n");
		r=x.nextInt();
		int [][]arr=new int[r][r];
		int [][]rot=new int[r][r];
		if(r>2&&r<10)
		{
			System.out.println("Enter the elements into the matrix \n");
			for(i=0;i<r;i++)
			{
				for(j=0;j<r;j++)
				{
					arr[i][j]=x.nextInt();
				}
			}
			for(j=0;j<r;j++)
			{
				for(i=r;i>0;i--)
				{
					rot[p][q]=arr[i-1][j];
					q++;
				}
				q=0;
				p++;
			}
			System.out.println();
			System.out.print("Transformed matrix is:\n");
			for(i=0;i<r;i++)
			{
				for(j=0;j<r;j++)
				{
					System.out.print(rot[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
		x.close();
		System.out.println("The sum of corner Elements is: "+(arr[0][0]+arr[0][r-1]+arr[r-1][0]+arr[r-1][r-1]));
	}

}




