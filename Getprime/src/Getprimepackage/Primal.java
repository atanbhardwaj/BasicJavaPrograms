package Getprimepackage;
import java.lang.Math;
public class Primal {
	public int Validateforprime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)	return 0;
		}
		return 1;
	}
}
