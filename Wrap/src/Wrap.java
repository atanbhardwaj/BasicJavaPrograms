import java.util.Scanner;
import java.lang.*;
public class Wrap {
	public static void main(String st[]) {
		int d=0,al=0,sp=0,v=0,w=0;
		String s;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the String");
		s = x.nextLine();
		/*for(char ch:s)
		{
			if(s.isDigit(ch))
				d++;
			else if(s.toUpperCase(ch)=='A'||s.toUpperCase(ch)=='E'||s.toUpperCase(ch)=='I'||s.toUpperCase(ch)=='O'||s.toUpperCase(ch)=='U')
				v++;
			else
				sp++;
		}
		for(int i=0; i<s.length();i++)
		{
			if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97)||s.charAt(i)<=122)
				al++;
		}*/
		String arr[]=s.split();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
