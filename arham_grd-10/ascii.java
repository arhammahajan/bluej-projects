
import java.util.*;
public class ascii
{
    public static void print()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("LC or UC");
        String ch=sc.nextLine();
        if(ch=="LC")
        {
            System.out.println("Enter letter");
            String letter=sc.nextLine().toLowerCase();
            System.out.println((int)letter.charAt(0));

        }
        else 
        {
            System.out.println("Enter letter");
             String letter=sc.nextLine().toUpperCase();
            System.out.println((int)letter.charAt(0)); 
        }
    }

    static int sum(int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    static double sum(double N)
    {
        double p=1;
        for(double i=1.0;i<=N;i=i+0.2)
        {
            p=p*i;
        }
        return p;
    }

    static int sum(int n)
    {
        int sum=0;
        do
        {
            if((n%10)%2!=0)
            {
                sum=sum+n%10;
            }
            n=n/10;

        }while(n>0);
        return sum;
    }

    static void main(String[] args)
    {
        ascii obj=new ascii();
        System.out.println(obj.sum(4,16));
        System.out.println(obj.sum(5));
        System.out.println(obj.sum(123456));
    }
    
    public static void perc(String[] students,double[] perc)
    {
        double temp=0;String c;
        if(students.length==perc.length)
        {
            for(int i=perc.length-1;i>=0;i--)
            {
                for(int j=0;j<i;j++)
                {
                    if(perc[j]<perc[j+1])
                    {
                        temp=perc[j];
                        perc[j]=perc[j+1];
                        perc[j+1]=temp;
                        c=students[j];
                        students[j]=students[j+1];
                        students[j+1]=c;
                    }
                }
            }
        }
        
        for(int k=0;k<=9;k++)
        {
            System.out.println("Toppers are "+students[k]);
        }
    }
}
