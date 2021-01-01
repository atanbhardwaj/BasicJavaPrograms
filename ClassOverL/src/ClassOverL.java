
public class ClassOverL {
	

	public void printdata(String s1) {
		char []a = new char [100];
		int []b= new int [5];
		int i=0;
		char []m = s1.toCharArray();
		int l1=m.length;
		
		for(i=0;i<l1;i++) {
			System.out.print(m[i]);
		int j=0;
		for(char k: m) {
			if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U') {
				m[i]='$';
				i++;
			}
			if(k=='a'||k=='A') {
				b[0]++;
			}
			else if(k=='e'||k=='E') {
				b[1]++;
			}
			else if(k=='i'||k=='I') {
				b[2]++;
			}
			else if(k=='O'||k=='o') {
				b[3]++;
			}
			else
				b[4]++;
		}
		
		int l2=b.length;
		System.out.println(a[i]);
		for(i=0;i<l1;i++) {
			System.out.print(m[i]);
		}
	}
}
}

