
public class Person implements Exam {
	public void checkemail(String s) {
		int in,flag=0,l,len,diff;
		in = s.indexOf("@gmail.com");
		l = ("@gmail.com").length();
		len = s.length();
		diff = len - l;
		if(in!=-1) {
			char []cha = s.toCharArray();
			int i=0;
			while(diff!=0) {
				if((cha[i]>=65&&cha[i]<=90)||(cha[i]>=97&&cha[i]<=122)||(cha[i]>=48&&cha[i]<=57)) {
					flag=0;
				}
				else 
					{flag = 1;break;}
				i++;
				diff--;
			}
			if(flag==0) System.out.println("Gmail is valid");
			else System.out.print("Gmail is not valid");
		}
		else
			System.out.println("Gmail is not valid");
	}
}
