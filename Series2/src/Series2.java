import java.util.Scanner;
public class Series2 {
	public static void main(String st[])
	{
		Scanner x = new Scanner(System.in);
		int n,ch;
		System.out.print("Press 1 for S=1/22+1/33+1/44...upto n terms \nPress 2 for S=1/1!+22/2!+33/3!+...upto n terms");
		System.out.print("\nEnter the value of n:");
		n=x.nextInt();
		System.out.print("Enter your choice ");
		ch=x.nextInt();
		switch(ch)
		{
		case 1:
			S1 s1=new S1();
			s1.input(n);
			break;
		case 2:
			S2 s2=new S2();
			s2.input(n);
			break;
		}
		x.close();
	}
}

class S1{
	double sum=0.0;
	int i;
	void input(int n)
	{
		for(i=2;i<=(n+1);i++)
		{
			sum+=(1/(double)(11*i));
		}
		System.out.print("The sum is: "+sum);
	}
}

class S2{
	double sum=0.0;
	int i,f;
	void input(int n)
	{
		if(n==1)
			sum=1;
		else
		{
			sum=1;
			for(i=2;i<=n;i++)
				sum+=(11*i)/(double)(in(i));
		}
		System.out.print("Sum is "+sum);
	}
	int in(int k)
	{
		f=1;
		while(k!=0)
		{
			f*=k;
			k--;
		}
		return f;
	}
}

