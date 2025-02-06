

public class simple_interest 
{
    double p=0,r=0,t=0;
    static double interest=0,amount=0;   
    simple_interest(double p, double r,double t)
    {
        this.p=p;
        this.r=r;
        this.t=t;
        calculate(p,r,t);
    }
    protected static void calculate(double p,double r,double t)
    {
        interest=(p*r*t)/100;
        amount=p+interest;
        display();
    }
    private static void display()
    {
        System.out.println("Simple Interest = "+interest+"\nAmount = "+amount); 
    }
}
