import java.util.*;
public class User {
	public static void main(String st[]) {
		String s1;
		String s2;
		Scanner x = new Scanner(System.in);
		s1 = x.nextLine();
		s2 = x.nextLine();
		OverLoadDemo o = new OverLoadDemo();
		o.merge(s1,s2);
		x.close();
		
	}
}
