
import java.util.Scanner;
public class User {
	public static void main(String st[]) {
		String s1;
		String s2;
		Scanner x = new Scanner(System.in);
		s1 = x.nextLine();
		s2 = x.nextLine();
		ClassOverL o = new ClassOverL();
		o.printdata(s1);
		x.close();
		
	}
}