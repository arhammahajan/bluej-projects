import java.util.*;
public class factorial
{
    static Scanner sc=new Scanner(System.in);
    static Scanner ic=new Scanner(System.in);
    public static void fact()
    {
        int fact=1;
        while(1>0)
        {
            System.out.println("do you want to continue 'y' or 'n'");
            String ch=ic.nextLine();
            char a=ch.charAt(0);
            if(a=='y')
            {
                System.out.println("enter a number");
                int n=sc.nextInt();
                for(int i=1;i<=n;i++)
                {
                    fact=fact*i;
                }
                System.out.println("factorial is "+fact);
            }
            else if(a=='n')
            {
                break;
            }
            else
            {
                System.out.println("invalid input, enter 'y' or 'n'");
            }
            ch="";
            fact=1;
        }
    }
}
