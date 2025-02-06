import java.util.*;
public class prelim_1_1st_rev
{
    public static void commonFactors(int a,int b)
    {
        System.out.println("The common factors ars");
        for(int i=2;i<=a;i++)
        {
            if(b%i==0)
            {
                System.out.println(i);      
            }
        }
    }

    public static void commonMultiples(int a,int b)
    {
        int p=a*b;
        System.out.println("The common multiples ars");
        for(int i=a;i<=p;i++)
        {
            if(i%b==0)
            {
                System.out.println(i);      
            }
        }
    }

    public static void reverseDigits(int a)
    {
        int digit=0;
        System.out.println(a+"\n"+"Digits in reverse order");
        do
        {
            digit=a%10;
            a=a/10;
            System.out.print(digit);
        }while(a>0);
    }

    public static void numStats(int a)
    {
        int digit=0,even=0,odd=0,ones=0;
        do
        {
            digit=a%10;
            a=a/10;
            if(digit%2==0)
            {
                even++;
            }
            if(digit%2==1)
            {
                odd++;
            }
            if(digit==1)
            {
                ones++;
            }

        }while(a>0);
        System.out.println("Even "+even+" Odd "+odd+" Ones "+ones);
    }

    public static void lastLetter(String s)
    {
        String print="";
        s=s.trim();
        String word="";
        for(int i=0;i<s.length();i++)
        {
            char l=s.charAt(i);
            if(l!=' ')
            {
                word=word+l;
            }
            else
            {
                print=print+" "+s.charAt(i-1);
                word="";
            }

        }
        System.out.println("The last letters are "+print+" "+s.charAt(s.length()-1));
    }

    public static void reverseWords(String s)
    {
        s=s.trim();
        s=s+" ";
        String word="";
        String rw="";      
        for(int i=0;i<s.length();i++)
        {
            char l=s.charAt(i);
            int j=0;
            if(l!=' ')
            {
                word=word+l;
            }
            else
            {
                j=word.length()-1;
                do
                {
                    rw=rw+word.charAt(j);
                    j--;
                }while(j>=0);
                System.out.print(rw+" ");
                word="";
                rw="";
                j=0;
            }

        }

    }

    public static void nextLine(String s)
    {
        s=s.trim();
        s=s+" ";
        String word="";
        for(int i=0;i<s.length();i++)
        {
            char l=s.charAt(i);
            if(l!=' ')
            {
                word=word+l;
            }
            else
            {  
                System.out.println(word);
                word="";
            }

        }

    }

    public static void name(String n)
    {
        n=n.trim();
        int cc=0;
        n=" "+n;
        String word="",word3="",word1="",word2="";
        for(int i=n.length()-1;i>=0;i--)
        {
            if(n.charAt(i)!=' ')
            {
                word=word+n.charAt(i); 
            }
            else
            {
                cc++;

                for(int j=word.length()-1;j>=0;j--)
                {
                    if(cc==1)
                    {
                        word1=word1+word.charAt(j);
                    }
                    else if(cc==2)
                    {
                        word2=word2+word.charAt(word.length()-1);
                        break;
                    }
                    else if(cc==3)
                    {
                        word3=word3+word.charAt(word.length()-1);
                        break;
                    }
                }

                word="";
            }
        }
        System.out.print(word1+" "+word3+" "+word2);
    }

    public static void fnTotalFactors(int n)
    {
        int facts=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                facts++;
            }
        }
        System.out.println(facts);
    }

    public static void unicode()
    {
        for(char i='A';i<='Z';i++)
        {
            System.out.println(i+" "+(int)i);
        }
    }

    public static void pattern()
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    public static String revrsePrime(int n)
    {
        String prime="non prime";
        int digit=0;
        do
        {
            digit=digit+n%10;
            n=n/10;
        }while(n>0);
        for(int i=2;i<n/2;i++)
        {
            if(digit%i==0)
            {
                prime="prime";
            }
        }
        return prime;
    }

    public static void numSum(int n)
    {
        int sum=0;
        int digit=0;
        do
        {
            digit=n%10;
            n=n/5;
            if(sum+digit<10)
            {
                sum=sum+digit;
            }
            digit=0;
        }while(n>0);
        System.out.println(sum);
    }

    public static void IX_a()
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=r;c>=1;c--)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    public static void IX_b()
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    public static void IX_c()
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=r;c<=5;c++)
            {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    public static void IX_d()
    {
        for(int r=1;r<=5;r++)
        {
            for(int c=5;c>=r;c--)
            {
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }

    public static void IX_e()
    {
        for(int r=5;r>=1;r--)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(r+" ");
            }
            System.out.println();
        }
    }

    public static void IX_f()
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void IX_g()
    {
        for(int i=5;i>=1;i--)
        {
            for(int k=i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=5;j++)
            {
                System.out.print(j);
            }
            if(i<5)
            {
                for(int f=4;f>=i;f--)
                {
                    System.out.print(f);                    
                }
            }
            System.out.println();
        }
    }

    public static void series(int x,int n)
    {
        int p=1;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                p=p*x;
            }
            sum=sum+p;
            p=1;
        }
        System.out.println(sum);
    }

    public static void series(int p)
    {
        int ans=1;
        for(int i=1;i<=p;i++)
        {
            ans=(i*i*i)-1;
            System.out.print(ans+",");
            ans=1;
        }
    }

    public static void series()
    {
        double ans=0;
        for(int i=2;i<=10;i++)
        {
            ans=ans+1/i;
        }
    }

    public static void countWord(String s)
    {
        s=s.trim().toUpperCase();
        s=s+" ";
        String word="";
        int cc=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word=word+s.charAt(i);
            }
            else
            {
                if(word.charAt(0)=='A')
                {
                    cc++;
                }
                word="";
            }
        }
        System.out.println("The no. of words starting with a are "+cc);
    }

    public static void generateTechNumber()
    {
        System.out.println("Tech numbers are ");
        int d=0;
        String n1="",n2="",a="";
        int b=0,c=0;
        for(int i=1000;i<=9999;i++)
        {
            a=a+i;
            n1=n1+a.charAt(0)+a.charAt(1);
            n2=n2+a.charAt(2)+a.charAt(3);
            b=Integer.parseInt(n1);
            c=Integer.parseInt(n2);
            if(Math.pow(b+c,2)==i)
            {
                System.out.println(i);
            }
            a="";
            n1="";
            n2="";
        }
    }

    public static void checkPronic(int n)
    {
        String s="It is not a pronic number";
        for(int i=1;i<=n/2;i++)
        {
            if(i*(i+1)==n)
            {
                s="It is a pronic number";
                break;
            }
        }
        System.out.println(s);
    }

    public static void makeCapital(String s)
    {
        s=s.trim()+" ";
        String w="";
        String fs="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                w=w+s.charAt(i);
            }
            else
            {
                w=Character.toUpperCase(w.charAt(0))+w.substring(1,w.length());
                fs=fs+" "+w;
                w="";
            }
        }
        fs=fs.trim();
        System.out.println(fs);
    }

    public void test(String s)
    {
        System.out.println(s.substring(1,s.length()));        
    }

    public static void descendingOrder(int []a)
    {
        int temp=0;
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<=a.length-1-i;j++)
            {
                if(a[j+1]>a[j])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int k=0;k<a.length;k++)
        {
            System.out.println(a[k]);
        }
    }

    public static void arrange(int[] a)
    {
        int temp=0;
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<=a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int l=0;l<a.length;l++)
        {
            System.out.println(a[l]);
        }
    }

    public static void search(int n)
    {
        int a[]={10,20,30,40,50};
        int low=0,high=a.length-1,mid=0;
        boolean f=false;
        while(low <=high)
        {
            mid=(low+high)/2;
            if(a[mid]==n)
            {
                f=true;
                break;
            }
            else if(a[mid]>n)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }

        }
        if(f==true)
        {
            System.out.println("The number was found at position "+mid);
        }
    }

}
