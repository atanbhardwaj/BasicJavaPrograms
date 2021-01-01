
public class Ternary {
	public static void main(String [] st) {
		int a = 100;
		int b = 1250;
		int c = 180;
		int r = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("The greatest Number is :"+r);
	}
}
