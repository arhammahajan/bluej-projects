import java.util.*;
public class loopPatternsRev
{
    Scanner sc=new Scanner(System.in);
    public static void d1(int n)
    {
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=n;c++)
            {
                if(r<c)
                {
                    System.out.print("*");
                }
                else
                {
                     System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    
    public static void d2(int n)
    {
         for(int r=1;r<=n;r++)
        {
            for(int c=n;c>=1;c--)
            {
                if(r<c)
                {
                    System.out.print("*");
                }
                else
                {
                     System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    
    public static void d3(int n)
    {
         for(int r=n;r>=1;r--)
        {
            for(int c=1;c<=n;c++)
            {
                if(r<=c)
                {
                    System.out.print("*");
                }
                else
                {
                     System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    
    public static void d4(int n)
    {
          for(int r=n;r>=1;r--)
        {
            for(int c=n;c>=1;c--)
            {
                if(r<=c)
                {
                    System.out.print("*");
                }
                else
                {
                     System.out.print(" ");
                }
            }
             System.out.println();
        }
    }
    
    public  void patterMenu()
    {
        System.out.println("pattern 1");
        System.out.println("pattern 2");
        System.out.println("pattern 3");
        System.out.println("pattern 4");
        System.out.println("Please input your choice");
        int choice=sc.nextInt();
        System.out.println("please enter your number ");
        int n=sc.nextInt();
        if(choice==1)
        {
            d1(n);
        }
        else if(choice==2)
        {
            d1(n);
        }
        else if(choice==3)
        {
            d1(n);
        }
        else if(choice==4)
        {
            d1(n);
        }
    }
}
