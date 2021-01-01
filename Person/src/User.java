import java.util.*;
public class User {
	public static void main(String st[]) {
		Person p = new Person();
		System.out.println("Enter the email:");
		String strr;
		Scanner x = new Scanner(System.in);
		strr = x.nextLine();
		p.checkemail(strr);
		x.close();
	}
}
