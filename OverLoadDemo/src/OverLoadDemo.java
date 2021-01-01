
public class OverLoadDemo {
	public void merge(String s1, String s2) {
		char []a = new char [100];
		char []b= new char [100];
		char []m = s1.toCharArray();
		char []n = s2.toCharArray();
		int i=0;
		int j=0;
		for(char k: m) {
			if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U') {
				a[i]=k;
				i++;
			}
			else
				{b[j]=k; j++;}
		}
		int l1=a.length;
		int l2=b.length;
		for(i=0;i<l1;i++) {
			System.out.print(a[i]);
		}
	}

	
}
