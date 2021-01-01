import Getprimepackage.Primal;
public class TwinPrime {
	private int lower;
	private int upper;
	TwinPrime(int lower, int upper){
		this.lower=lower;
		this.upper=upper;
	}
	void PrintTwins() {
		Primal p = new Primal();
		int i = 0;
		int []primenum = new int[upper];
		while(lower<=upper) {
			if(p.Validateforprime(lower)==1) {
				primenum[i] = lower;
				i++;
			}
			lower++;
		}
		for(int k=0;k<i-1;) {
			if(primenum[k+1]-primenum[k]==2)
				System.out.println("("+primenum[k]+","+primenum[k+1]+")");
			k++;
		}
	}
}
