import java.util.Scanner;
public class oswaal_programs
{
    static Scanner it=new Scanner(System.in);
    public static void main(String args[])
    {
        specialNumber();
    }

    private static void specialNumber()
    {
        do
        {
            int sum=0;
            int product;
            System.out.println("Input a two digit no.");
            String ch=it.nextLine();
            int n=Integer.parseInt(ch);

            if(n>9 && n<100)
            {

                sum=n%10+(n/10)%10;
                product=n%10*(n/10%10);

                if(sum+product==n)
                {
                    System.out.println("It is a special two digit number");
                }
                else
                    System.out.println("It is not a special 2 digit number");
            }
            else
            { 
                System.out.println("Please enter a 2 digit number");
                continue;
            }
            System.out.println("Do you want to continue ?");
            System.out.println("Enter y or n");
            ch=it.nextLine();
            char c=ch.charAt(0);
            if(c=='y')
            {
                continue;
            }
            else
            {
                break;
            }

        } while(1>0);
    }

    public void specialNumber1()
    {
        do
        {
            int sum=0;
            int product;
            System.out.println("Input a two digit no.");
            String ch=it.nextLine();
            int n=Integer.parseInt(ch);

            if(n>9 && n<100)
            {

                sum=n%10+(n/10)%10;
                product=n%10*(n/10%10);

                if(sum+product==n)
                {
                    System.out.println("It is a special two digit number");
                }
                else
                    System.out.println("It is not a special 2 digit number");
            }
            else
            { 
                System.out.println("Please enter a 2 digit number");
                continue;
            }
            System.out.println("Do you want to continue ?");
            System.out.println("Enter y or n");
            ch=it.nextLine();
            char c=ch.charAt(0);
            if(c=='y')
            {
                continue;
            }
            else
            {
                break;
            }

        } while(1>0);
    }

    public static void checkPronic()
    {
        boolean b=false;
        int q=0;
        System.out.println("Enter a number");
        int ch=it.nextInt();
        for(int i=1;i<=ch;i++)
        {
            if(ch%i==0)
            {
                q=ch/i;
                if(i-q==1 || q-i==0)
                {
                    b=true;
                    break;
                }
                else
                    b=false;
            }
            else
            {
            }
        }
        if(b==true)
        {
            System.out.println("It is a pronic number");
        }
        else
            System.out.println("It is not a pronic number");
    }

    private static int factorial(int n)
    {
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }

    public static void isSpecailNumber()
    {
        int sum=0;
        int factorial;

        int n2=0;
        int factor=0;

        System.out.println("Please enter a number");
        int ch=it.nextInt();
        int n=ch;
        if(ch>0 &&ch<10)
        {
            n2=1;
        }
        else if(ch>9 && ch<100)
        {
            n2=2;
        }
        else if(ch>99 && ch<1000)
        {
            n2=3;
        }
        else if(ch>9999 && ch<10000)
        {
            n2=4;
        }
        for(int k=1;k<=n2;k++)
        {
            factor=ch%10;
            sum=sum+factorial(factor);
            ch=ch/10;
        }

        if(sum==n)
        {
            System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }

    }

    public static void twoNumbers()
    {
        System.out.println("Enter a number");
        int n1=it.nextInt();
        System.out.println("Enter another");
        int n2=it.nextInt();
        int sum=n1+n2;
        int product=n1*n2;
        int difference=0;
        int modulus=0;
        if(n1>n2)
        {
            difference=n1=n2;
            modulus=n1%n2;
        }
        else
        { 
            difference=n2-n1;
            modulus=n2%n1;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Product ="+product);
        System.out.println("Difference = "+difference);
        System.out.println("Modulus = "+modulus);
    }

    public static void polygon(int n,char ch)
    {
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n;k++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void polygon(int x,int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int k=1;k<=y;k++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void polygon()
    {
        for(int i=1;i<=3;i++)
        {
            for(int k=3;k>=3;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void changeWord(String w)
    {
        String a="";
        String newWord=" ";
        w=w.toLowerCase();
        for(int i=0;i<w.length();i++)
        {

            if(w.charAt(i)=='a' ||w.charAt(i)=='e' ||w.charAt(i)=='i' ||w.charAt(i)=='o' ||w.charAt(i)=='u' )
            {
                char ch=(char)(w.charAt(i)+1);
                newWord=w.replace(w.charAt(i),ch);
            }

        }
        System.out.println(newWord);
    }

    public static void reverseCase()
    {
        String w=it.nextLine();
        for(int i=0;i<w.length();i++)
        {
            Character ch=new Character(w.charAt(i));
            if(Character.isUpperCase(ch)==true)
            {
                w=w.replace(w.charAt(i),Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)==true)
            {
                w=w.replace(w.charAt(i),Character.toUpperCase(ch));
            }
            else 
            {
            }
        }
        System.out.println(w);
    }

    public void pattern()
    {
        System.out.println("Enter a number");
        int ch=it.nextInt();
        int m=1;
        int sum=0;
        for(int i=0;i<ch;i++)
        {
            for(int k=1;k<=i;k++)
            {
                m=m*i;
            }
            sum=sum+m;
        }
        System.out.println(sum);
    }
}
