import java.util.Scanner;
public class GetPrime {
	public static void main(String st[]) {
		Scanner x = new Scanner(System.in);
		int lower,upper;
		System.out.println("Enter the lower limit: ");
		lower = x.nextInt();
		System.out.println("Enter the upper limit: ");
		upper = x.nextInt();
		TwinPrime tw = new TwinPrime(lower,upper);
		tw.PrintTwins();
		x.close();
	}
}
