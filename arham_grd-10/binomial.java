import java.util.*;
public class binomial
{
    private static long fact(long n)
    {
        long fact=1;
        for(long i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void compute()
    {
        Scanner sc=new Scanner(System.in);
        Scanner ic=new Scanner(System.in);
        while(1>0)
        {
            long c=0;

            System.out.println("enter n");
            long n=ic.nextLong();
            System.out.println("enter r");
            long r=ic.nextLong();
            long tmp=n-r;
            c=fact(n)/(fact(r)*fact(tmp));
            System.out.println("the computation is "+c);

        }
    }
}
