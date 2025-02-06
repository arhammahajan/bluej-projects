import java.util.Scanner;
public class sirSts4
{
    static Scanner sc=new Scanner(System.in); 
    static void oddEven(int a)
    {
        String r=(a%2==0)?"even":"odd";
        System.out.println(r);
    }

    static void count(String s)
    {
        int a=0,n=0,sc=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s)
            {
                case "1":
                {
                    n++;
                }
                case "2":
                {
                    n++;
                }
                case "3":
                {
                    n++;
                }
                case "4":
                {
                    n++;
                }
                case "5":
                {
                    n++;
                }
                case "6":
                {
                    n++;
                }
                case "7":
                {
                    n++;
                }
                case "8":
                {
                    n++;
                }
                case "9":
                {
                    n++;
                }

            }
        }
    }

    static void findPalindrome()
    {
        int r,sum=0,temp,n=0;    
        String s=sc.nextLine();
        n=Integer.parseInt(s);

        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
    }  

    static void storeArray()
    {
        int count=0;
        int[] array=new int[5];;
        int sum=0;
        while(count<5)
        {

            System.out.println("Enter a number");
            int n=sc.nextInt();
            if(n%2==0)
            {
                sum=sum+n;
            }
            array[count]=n;
            count++;
        }
        System.out.println(sum);
    }

    static void makeNumber(int a,int b,int c,int d)
    {
        String s="";
        if(a!=0&&b!=0&&c!=0&&d!=0)
        {
            s=s+a+b+c+d;
        }
        System.out.println(s);
    }

    static void factorial(int n)
    {
        int fact=1;
        for(int i=0;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

    static void replaceA(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='a')
            {
                s=s.replace(s.charAt(i),'*');
            }
        }
        System.out.println(s);
    }

    static void makeName(String fn,String mn,String ln)
    {
        fn=fn.toLowerCase().trim();
        mn=mn.toLowerCase().trim();
        ln=ln.toLowerCase().trim();

        String fn1=Character.toUpperCase(fn.charAt(0))+fn.substring(1,fn.length());
        String mn1=Character.toUpperCase(mn.charAt(0))+mn.substring(1,mn.length());
        String ln1=Character.toUpperCase(ln.charAt(0))+ln.substring(1,ln.length());

        String name=fn1+" "+mn1+" "+ln1; 
        System.out.println(name);
    }

    static void pattern()
    {
        int k=9;
        for(int i=0;i<4;i++)
        {

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int d=4;d>=1+i;d--)
            {
                System.out.print(k);
                k--;
            }
            System.out.println();

        }
    }

    static void additiveInverse(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            {
                a[i]=a[i]+(2*a[i]);
            }

            else 
            {
                a[i]=a[i]-(2*a[i]);
            }
            System.out.println(a[i]);
        }

    }

    static void test(int n,String s)
    {
        Integer nv=new Integer(n);
        for(int i=0;i<s.length();i++)
        {
            Character.toLowerCase(s.charAt(0));
        }
        Character a=new Character(s.charAt(0));

        float x=Float.parseFloat(s);

    }

    static void passFail(int[] marks)
    {
        float sum=0;
        float av=0;
        if(marks.length==3)
        {
            for(int i=0;i<marks.length;i++)
            {
                sum=sum+marks[i];
            }
            av=sum/3;
        }
        System.out.println(av>=40?"pass":"fail");
    }

    static void positiveNegative(int n)
    {
        System.out.println(n<0?"negative":"positive");
    }

    static void findSum(int n)
    {
        int sum=0;
        int product=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                product=product*i;
            }
            sum=sum+product;
            product=1;
        }
        System.out.println(sum);
    }

    static void pattern1(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum+=j;
            }
        }
        System.out.println(sum);
    }

    static void pattern2(int n)
    {
        int sum=0;
        int product=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                product*=j;
            }
            sum=sum+product;
            product=1;
        }
        System.out.println(sum);
    }

    static String prime(int n)
    {
        String b="prime";
        int factor=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                factor++;
            }
            else
            {

            }
            if(factor>0||n==1)
            {
                b="non-prime";
            }

        }
        return b;
    }

    static void countPrime(int n)
    {
        int count=0;
        while(n>0)
        {
            if(prime(n%10)=="prime" && n%10!=1)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }

    static void difference(int n)
    {
        String s="";
        int n1=n;
        while(n>0)
        {
            s=s+(n%10);
            n=n/10;
        }
        
        System.out.println(n1-Integer.parseInt(s));
        
    }
    
    

}
