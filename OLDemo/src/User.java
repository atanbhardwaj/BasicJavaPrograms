import java.util.*;
public class User {
	public static void main(String st[]) {
		Scanner x = new Scanner(System.in);
		String S1, S2;
		System.out.println("Input String 1:");
		S1 = x.nextLine();
		System.out.print("Enter String 2: ");
		S2 = x.nextLine();
		System.out.println("Enter the String including numbers :");
		String S3;
		S3 = x.nextLine();
		OLDemo ol = new OLDemo();
		ol.merge(S1,S2);
		int res = ol.merge(S3);
		System.out.print("\n"+res);
		x.close();
	}
}
