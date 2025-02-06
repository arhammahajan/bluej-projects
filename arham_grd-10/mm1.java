import java.util.Scanner;
public class mm1
{
    static Scanner is=new Scanner(System.in);
    public static void main(String[]args)
    {
        mm1 mm1obj1=new mm1();
        mm1obj1.userchoice();
    }
    
    private static void userchoice()
    {
        do
        {
            System.out.println("1-upper right triangle");
            System.out.println("2-upper left triangle");
            System.out.println("3-lower left triangle");
            System.out.println("4-lower right triangle");

            System.out.println("pls input number of choice");
            int ch=is.nextInt();
            if(ch<0 || ch>4)
            {
                System.out.println("Invalid Input");
                continue;
            }
            if(ch==0)
            {
                break;
            }
            System.out.println("pls enter a number for the triangle");
            int chtg=is.nextInt();
            if(ch==1)
            {
                p1utrt(chtg);
            }
            if(ch==2)
            {
                p2utlf(chtg);
            }
            if(ch==3)
            {
                p3ltlf(chtg);
            }
            if(ch==4)
            {
                p4ltrt(chtg);
            }

        }while(1>0);

    }

    private static void p1utrt(int n)
    {
        for(int r=0;r<=n;r++)
        {
            for(int c=0;c<=n;c++)
            {
                if(r>c)
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

    private static void p2utlf(int n)
    {
        for(int r=0;r<=n;r++)
        {
            for(int c=n;c>=1;c--)
            {
                if(r>=c)
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

    private static void p3ltlf(int n)
    {
        for(int r=n;r>=1;r--)
        {
            for(int c=n;c>=1;c--)
            {
                if(r>c)
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

    private static void p4ltrt(int n)
    {
        for(int r=n;r>=1;r--)
        {
            for(int c=1;c<=n;c++)
            {
                if(r>c)
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

}
