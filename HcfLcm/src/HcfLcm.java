
public class HcfLcm {
	public static void main(String st[])
	{
		int x,y,hcf;
		float lcm;
		x=Integer.parseInt(st[0]);
		y=Integer.parseInt(st[1]);
		Rec a = new Rec();
		hcf=a.find(x, y);
		lcm=(x*y)/hcf;
		System.out.print("HCF :"+hcf+"\n"+"LCM :"+lcm);
	}
}

class Rec{
	int a,b;
	int find(int a, int b)
	{
		if(a==b)
			return a;
		if(a>b)
			return find((a-b),(b));
		else
			return find(a,(b-a));
	}
}
