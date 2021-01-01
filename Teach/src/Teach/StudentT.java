package Teach;

import java.util.Scanner;

public class StudentT {

	public static void main(String [] st) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the integer number \n ");
		
		int n = x.nextInt();
		
		int sum = 0,k;
		
		while(n>0) {
			k = n%10;
			sum += k;
			n/=10;
		}
		
		System.out.println("The sum of the number of the digits is = "+sum);
		
		x.close();
		
	}
}
