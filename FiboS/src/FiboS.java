import java.util.Scanner;
public class FiboS {
	public static void main(String st[])
	{
		Scanner x=new Scanner(System.in);
		long n;
		System.out.print("Enter the value of n: \n");
		n=x.nextInt();
		Fib f=new Fib();
		f.input(n);
		x.close();
	}

}

class Fib{
	long  i,a=0,b=1,c,n;
	void input(long k)
	{
		n=k;
		for(i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
