import java.util.*;
public class Wonderland extends LogicPark{
	Wonderland(int adult, int children) {
		super(adult, children);
	}

	public void playgame(){
		Scanner x = new Scanner(System.in);
		int []ind = new int[40];
		char ch='y';
		while(ch=='y') {
		System.out.println("Which game do you want to play : \n");
		int k = x.nextInt();
		ind[k-1]++;
		System.out.println("Do you want to continue y/n \n");
		ch = x.next().charAt(0);
		}
		for(int i=0;i<40;i++) {
			if(ind[i]>0) {
				System.out.println("The Game Number "+(i+1)+"is played "+ind[i]+"times");
			}
			else {
				System.out.println("The game "+(i+1)+"is not played");
			}
		}
		x.close();
	}
}
