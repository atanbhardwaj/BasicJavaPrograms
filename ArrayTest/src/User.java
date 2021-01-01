import java.util.Scanner;
public class User {
	public static void main(String st[]) {
		int size;
		Scanner x = new Scanner(System.in);
		ArrayTest a = new ArrayTest();
		System.out.println("Enter the Size of array:\n");
		size = x.nextInt();
		a.input(size);
		a.duplicate();
		x.close();
	}
}
