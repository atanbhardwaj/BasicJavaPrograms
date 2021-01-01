import java.util.Scanner;
public class Composite {
	public static void main(String st[]){
        Scanner x=new Scanner(System.in);
        int choice,n;
        System.out.println("Enter your choice\nPress 1 for Composite\nPress 2 for Smallest digit");
        choice=x.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter the number");
                n=x.nextInt();
                Compos c=new Compos();
                int res;
                res=c.input(n);
                if(res>2)   System.out.println("Composite Number");
                else
                    System.out.println("Not a Composite Number");
                break;
            }
            case 2:
            {
                System.out.println("Enter the number");
                n=x.nextInt();
                Digi d=new Digi();
                int res=d.input(n);
                System.out.println(res);
                break;
            }
            default:
                System.out.println("Invalid Input");
        }
        x.close();
    }

}

class Compos{
    int count=0;
    public int input(int a)
    {
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)  count++;
            if(count>2) break;
        }
        return count;
    }
}

class Digi
{
    int x,min;
    public int input(int a)
    {
    min=a%10;
    while(a!=0)
    {
        x=a%10;
        if(min>x)   min=x;
        a/=10;
    }
    return min;
    }   
}
