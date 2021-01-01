import java.util.*;
public class User {
	public static void main(String st[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("Press 1 for Wonderland :\nPress 2 for Disneyland: ");
		int choice = x.nextInt();
		if(choice==1) {
			Wonderland wonder = new Wonderland(5,5);
			wonder.totalcost();
			wonder.playgame();
		}
		else {
			DisneyLand disney = new DisneyLand(5,5);
			disney.totalcost();
			disney.playgame();
		}
		x.close();
	}
}
