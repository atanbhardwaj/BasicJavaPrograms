
public class FindD {
	private int k=100;
	
	void method(int n) {
		int sum = 0;
		while(n>0) {
			int i=n;
			sum += n%10;
			n/=10;
			System.out.print(i);
		}
		System.out.print("The sum of Digits is: "+sum);
	}
	
	void pri() {
		System.out.print("The value of private variable k is "+(k++));
	}
	
}
