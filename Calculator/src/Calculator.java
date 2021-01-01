import java.util.Scanner;

public class Calculator{
    public static void main(String st[])
    {
        Scanner x=new Scanner(System.in);
        Cal c=new Cal();
        int choice;
        double a,b;
        System.out.println("Enter two numbers");
        a=x.nextInt();
        b=x.nextInt();
        System.out.println("Enter choice\nPress 1 to add\nPress 2 to subtract\nPress 3 to multiply\nPress 4 to Divide");
        choice=x.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Addition is:"+c.add(a,b));
                break;
            }
            case 2:
            {
                System.out.println("Subtraction is:"+c.subtrat(a,b));
                break;
            }
            case 3:
            {
                System.out.println("Multiplication is:"+c.multiply(a,b));
                break;
            }
            case 4:
            {
                System.out.println("Division is:"+c.divide(a,b));
                break;
            }
            default:
                System.out.println("Invalid Input");
        }
    x.close();
    }
}

class Cal{

    double add(double a,double b)
    {
        return a+b;
    }
    double subtrat(double a,double b)
    {
        return a-b;
    }
    double multiply(double a,double b)
    {
        return a*b;
    }
    double divide(double a, double b)
    {
        return a/b;
    }
    
}