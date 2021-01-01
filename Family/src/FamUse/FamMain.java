package FamUse;
import java.util.Scanner;
import Family.*;
public class FamMain {
	public static void main(String st[]) {
		Scanner x=new Scanner(System.in);
		CheckStatus c = new CheckStatus();
		String S1,S2,S3;
		System.out.println("Enter Father's Name:");
		S1=x.nextLine();
		System.out.println("Enter Mother's Name:");
		S2=x.nextLine();
		System.out.println("Enter Gender: ");
		S3=x.nextLine();
		c.checkRelation(S1,S2,S3);
		x.close();
	}
}
