
public class OLDemo {
	void merge(String S1, String S2) {
		char []a=new char[100];
		char []b=new char[100];
		char []cha1= S1.toCharArray();
		char []cha2= S2.toCharArray();
		int i=0,j=0;
		for(char p: cha1)
		{
			if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U') {
				a[i]=p;i++;
			}
			else
				{b[j]=p;j++;}
		}
		for(char p: cha2)
		{
			if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'||p=='A'||p=='E'||p=='I'||p=='O'||p=='U') {
				a[i]=p;i++;
			}
			else
				{b[j]=p;j++;}
		}
		String ss= new String(a);
		String sss = new String(b);
		System.out.println(ss);
		System.out.print(sss);
	}
	int merge(String Sr) {
		int sum = 0;
		char []ct=Sr.toCharArray();
		for(char k: ct) {
			if(k>=48&&k<=57) {
				sum += Integer.parseInt(String.valueOf(k));
			}
		}
		return sum;
	}
}
