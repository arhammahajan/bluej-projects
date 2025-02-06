import java.lang.Math;
import java.util.*;
public class prelim_prep
{
    public static void main(float r)
    {
        float area=(2*r*r)/7;
        System.out.println(area);
    }

    public static void avg(String[]n, int[]tm)
    {
        if(n.length==tm.length)
        {
            double dev=0;
            int sum=0;
            for(int i=0;i<n.length;i++)
            {
                sum=sum+tm[i];
            }
            double avg=sum/tm.length;
            System.out.println("avg="+avg);
            for(int l=0;l<n.length;l++)
            {
                dev=tm[l]-avg;
                System.out.println("Deviation of "+n[l]+" is "+dev);
                dev=0;
            }

        }
    }

    public static double series(int n)
    {
        double ans=0;
        for(double i=1;i<=n;i++)
        {
            ans=ans+(1/i);
        }
        return ans;
    }

    public static double series(double a,double n)
    {
        double ans=0;
        double g=1;
        double f=2;

        for(int i=1;i<=n;i++)
        {
            ans=ans+(g/Math.pow(a,f));
            f=f+3;
            g=g+3;
        }
        return ans;
    }

    public static void righttriangle(double hypo,double base)
    {
        double perpendicular=Math.sqrt(hypo*hypo-base*base);
        System.out.println(perpendicular);
    } 

    public static void toLowerCase(String w)
    {
        w=w.toLowerCase();
        for(int i=0;i<w.length();i++)
        {
            if(w.charAt(i)=='a')
            {
                w=w.replace(w.charAt(i),'b');
            }
            if(w.charAt(i)=='e')
            {
                w=w.replace(w.charAt(i),'f');
            }
            if(w.charAt(i)=='i')
            {
                w=w.replace(w.charAt(i),'j');
            }
            if(w.charAt(i)=='o')
            {
                w=w.replace(w.charAt(i),'p');
            }
            if(w.charAt(i)=='u')
            {
                w=w.replace(w.charAt(i),'v');
            }
        }
        System.out.println(w);
    }

    public static void reverseCase(String w)
    {
        System.out.print("The original word is "+w+"\nreversed case word is ");
        for(int i=0;i<w.length();i++)
        {
            char c=w.charAt(i);
            if(Character.isUpperCase(c))
            {
                c=Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c))
            {
                c=Character.toUpperCase(c);
            }
            System.out.print(c);
        }
    }

    public static void checkPrime(int n)
    {
        String b="prime";
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                b="non prime";
                break;
            }
        }
        System.out.print(b);
    }
    static Scanner sc=new Scanner(System.in);
    public static void menu()
    {
        System.out.println("which area u want\n1. square\n2. rectangle\n3. circle");
        int ch=sc.nextInt();
        if(ch==1)
        {
            square();
        }
        else if(ch==2)
        {
            rectangle();
        }
        else if(ch==3)
        {
            circle();
        }
    }

    private static void circle()
    {
        System.out.println("enter radius ");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println(area);
    }

    private static void square()
    {
        System.out.println("enter side");
        double s=sc.nextDouble();
        double area=s*s;
        System.out.println(area);
    }

    private static void rectangle()
    {
        System.out.println("enter length");
        double l=sc.nextDouble();
        System.out.println("enter breadth");
        double b=sc.nextDouble();
        double area=l*b;
        System.out.println(area);
    }

    public static void arrange(int[]a)
    {
        int n = a.length;  
        int temp = 0;  
        for(int i=0; i < n; i++)
        {  
            for(int j=1; j < (n-i); j++)
            {  
                if(a[j-1] > a[j])
                {  
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  

    }  

} 

