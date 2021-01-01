import java.util.Scanner;
public class Strings {
	public static void main(String st[]) {
		//String Methods
		Scanner x = new Scanner(System.in);
		String s,str;
		s="Hello";
		str="This is a Multiverse Theory";
		//int n=s.length();
		
		System.out.println("Hello".length());
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.substring(2,4));// substring(i,j) returns substring till index j-1
		
		String s1="kkk";
		String s11=s.concat(s1);
		System.out.println(s11);
		
		System.out.println(s+" "+"Java");
		
		System.out.println(str.indexOf("is",3));
		
		
	}
}
