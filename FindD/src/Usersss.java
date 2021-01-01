import java.util.Scanner;
public class Usersss {
	public static void main(String st[]) {
		Scanner x = new Scanner(System.in);
		FindD fi = new FindD();
		int n;
		System.out.print("Enter any number \n");
		n = x.nextInt();
		fi.method(n);
		fi.pri();
		x.close();
	}

}
