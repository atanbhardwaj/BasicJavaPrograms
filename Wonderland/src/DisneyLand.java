import java.util.*;
public class DisneyLand extends LogicPark{
	 	DisneyLand(int adult, int children) {
		super(adult, children);
	}
		public void playgame() {
		Scanner x = new Scanner(System.in);
		char ch = 'y';
		Boolean[] Games = new Boolean[30];
		Arrays.fill(Games, Boolean.FALSE);
		while(ch == 'y') {
			System.out.println("Which game do you want to play in Disney Land:");
			int g = x.nextInt();
			if(Games[g-1]==Boolean.FALSE)
				Games[g-1] = Boolean.TRUE;
			else{
				System.out.println("Please enter another choice ");
				continue;
			}
			System.out.println("Do you want to continue y/n \n");
			ch = x.next().charAt(0);	
		}
		x.close();
	}
}
