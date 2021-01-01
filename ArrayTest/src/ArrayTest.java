import java.util.Scanner;
public class ArrayTest {
	private int n;
	private int []A = new int [100];
	
	void input(int n) {
		this.n = n;
		Scanner x = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			A[i] = x.nextInt();
		}
		x.close();
	}
	
	void duplicate() {
		int count=0,G=0,j;
		for(int i=0;i<n-1;i++) {
			for( j=i+1;j<n;j++) {
				if(A[i]>A[j]) {
					A[i]+=A[j];
					A[j]=A[i]-A[j];
					A[i]-=A[j];
				}
			}
		}
		
		for(int i=0;i<n-1;i++)
		{
			for( j=i+1;j<n;j++) {
				if(A[i]==A[j])
					count++;
				else 
					break;
			}
			if(count>0) {System.out.println("\nThe Duplicate Element is :"+A[i]); G++;}
			i = j-1;
			count = 0;
		}
		if(G==0) System.out.println("No Duplicate Element in the array was found:\n");
		
	}
}
