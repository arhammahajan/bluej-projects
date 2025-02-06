import java.util.*;
public class Pay
{
    Scanner sc=new Scanner(System.in);
    int basic;
    double tax;
    double gross;
    Pay()
    {
        basic=0;
        tax=0.0;
        gross=0.0;
    }
    private void Input()
    {
        System.out.println("Please enter the amount");
        basic=sc.nextInt();
        System.out.println("Please enter the tax");
        tax=sc.nextDouble();
    }
    private void compute()
    {
        gross=basic-tax;
    }
    private void display()
    {
        System.out.println("Gross is "+gross);
        System.out.println("Basic amount is "+basic);
        System.out.println("Tax is "+tax);
    }
    public static void main(String args[])
    {
        Pay obj=new Pay();
        obj.Input();
        obj.compute();
        obj.display();
    }
}
