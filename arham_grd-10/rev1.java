
public class rev1
{
    public void whatIsFactor(int a,int b)
    {
        if(a%b==0)
        {
            System.out.println(b+" is a factor of "+a);
        }
        if(b%a==0)
        {
            System.out.println(a+" is a factor of "+b);
        }
    }

    public void checkfactors(int n)
    {
        System.out.println("Factors are");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }

    public int printSum(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }

    public boolean isPerfectNumber(int n)
    {
        boolean b=false;
        int sum=0;

        if(n==printSum(n))
        {
            b=true;
        }
        return b;
    }

    public long factorial(int n)
    {
        long fact =1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public void displayigits(int n)
    {
        int digit=0;
        System.out.println("Digits are");
        while(n>0)
        {
            digit=n%10;
            System.out.println(digit);
            n=n/10;
        }
    }

    public int reverseThheNumber(int n)
    {
        int digit=0;
        String f="";
        int b=0;
        while(n>0)
        {
            digit=n%10;
            f=f+digit;
            b=Integer.parseInt(f);
            n=n/10;
        }
        return b;
    }

    boolean isPalindrome(int n)
    {
        boolean b=false;

        if(reverseThheNumber(n)==n)
        {
            b=true;
        }

        return b;
    }

    boolean isAmicablePair(int n1, int n2)
    {
        boolean b=false;
        if(printSum(n1)==n2 && printSum(n2)==n1)
        {
            b=true;
        }
        return b;
    }

    boolean areAllNumbersSame(int n)
    {
        boolean b=true;

        int ld=n%10;
        while(n>0)
        {
            int digit=n%10;
            if(ld!=digit)
            {
                b=false;
                break;

            }
            n=n/10;
        }

        return b;
    }

    boolean firstAndLast(int n)
    {
        boolean b=false;
        String n1=""+n;
        if(n1.charAt(0)==n1.charAt(n1.length()-1))
        {
            b=true;
        }
        return b;
    }

    static boolean isFirstLastSameDigit(int n1)
    {
        boolean b=false;
        int ldigit=n1%10;
        int fdigit=0;
        do
        {
            fdigit=n1%10;
            n1=n1/10;
        }
        while(n1>0);
        if(fdigit==ldigit)
        {
            b=true;
        }
        return b;
    }

    public void lastOddorFirtstEven(int n)
    {
        int fd=0,ld=n%10;
        do
        {
            fd=n%10;
            n=n/10;
        }
        while(n>0);
        if(fd%2==0 && ld%2!=0)
        {
            System.out.println("first is even an last is odd");
            
        }
         if(fd%2!=0 && ld%2==0)
        {
            System.out.println("first is odd an last is even");
            
        }
    }
    
    
    boolean isExchangeFirstLastNumber(int n, int n1)
    {
        boolean b=false;
        int fd1=0,ld1=n%10;;
        int fd2=0,ld2=n1%10;
        
          do
        {
            fd1=n%10;
            n=n/10;
        }
        while(n>0);
           do
        {
            fd1=n1%10;
            n1=n1/10;
        }
        while(n1>0);
        
        if(fd1==ld2 && fd2==ld1)
        {
            b=true;
        }
        return b;
    }
}
