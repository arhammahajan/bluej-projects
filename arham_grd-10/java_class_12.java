import java.util.Scanner;
public class java_class_12
{
    static Scanner sc=new Scanner(System.in);
    public static void switches(char ch)
    {
        ch=Character.toLowerCase(ch);
        switch(ch)
        {
            case 'a':
            {
                System.out.println("Lamp A");
                break;
            }
            case 'b':
            {
                System.out.println("Lamp B");
                break;
            }
            case 'c':
            {
                System.out.println("Lamp C");
                break;
            }
            case 'd':
            {
                System.out.println("Lamp D");
                break;
            }
            case 'e':
            {
                System.out.println("Lamp E");
                break;
            }
            default:
            {
                System.out.println("Please enter valid letter");
            }
        }
    }

    public static void Calculator(int n1,char op,int n2)
    {
        int f=0;
        double d=0;
        switch(op)
        {
            case '+':
            {
                f=n1+n2;
                System.out.println("Sum = "+f);
                break;
            }
            case '-':
            {
                if(n1>n2)
                {
                    f=n1-n2;
                }
                else
                {
                    f=n2-n1;
                }
                System.out.println("Difference = "+f);
                break;
            }
            case '*':
            {
                f=n1*n2;
                System.out.println("Product = "+f);
                break;
            }
            case '/':
            {
                if(n1>n2)
                {
                    d=n1/n2;

                }
                else
                {
                    d=n2/n1;
                }
                System.out.println("Dividend = "+d);
                break;
            }
            case '%':
            {
                if(n1>n2)
                {
                    f=n1%n2;
                }
                else
                {
                    f=n2%n1;
                }
                System.out.println("Remainder= "+f);
                break;
            }
        }
    }

    public static void HDCF()
    {
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        System.out.println("Enter another");
        int n2=sc.nextInt();
        int ln=1,hcf=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                for(int l=1;l<=n2;l++)
                {
                    if(n2%l==0)
                    {
                        if(i==l)
                        {
                            hcf=l;

                            if(l>ln)
                            {
                                ln=l;
                            }
                        }
                    }
                }
            }
            else
            {
            }
        }
        System.out.println("Highest common factor = "+ln);
    }

    public static void fibronacci(int n)
    {
        int digit=0;
        int[] array=new int[n];
        System.out.print(array[0]+" "+array[1]);
        for(int i=2;i<n;i++)
        {
            array[0]=0;
            array[1]=1;
            array[i]=array[i-1]+array[i-2];
            System.out.print(" "+array[i]);
        }
    }

    private static int prime(int n)
    {
        int factor=0;
        for(int l=2;l<n;l++)
        {
            if(n%l==0)
            {
                factor++;
            }
            else
            {

            }
        }
        return factor;
    }

    public static void primeFactors(int n)
    {
        System.out.println("The prime factors are");
        boolean b=false;
        int i;
        for( i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(prime(i)==0)
                {
                    System.out.println(i);
                }
            }
        }

    }

    public static void checkDivisibility(int number,int divisor)
    {
        if(number-divisor*(number/divisor)==0)
        {
            System.out.println(number+" is divisible by "+divisor);
        }
        else
        {
            System.out.println(number+" is not divisible by "+divisor);
        }
    }
    
    
}
