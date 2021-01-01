import java.util.Scanner;
public class Bi {
	public static void main(String st[])
	{
		Scanner x =new Scanner(System.in);
		int i,k,nm,count=0;
		String b="",o="";
		nm=x.nextInt();
		for(i=nm;i>0;i/=2)
		{
			k=i%2;
			if(k==1)
				count++;
			b=b+Integer.toString(k);
			if(count%2==0)
				o="Evil";
			else
				o="Not Evil";
		}
		k=Integer.parseInt(b);
		System.out.println(k+"\n"+o);
		x.close();
	}
}

