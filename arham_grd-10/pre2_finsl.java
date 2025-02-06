import java.lang.Math.*;
import java.util.*;
public class pre2_finsl
{
    //2015 q5a
    public static void pattern1()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    public static void pattern2()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(j+" "); 
            }
            System.out.println();
        }
    }
    // 2015 q7 ii
    public static void findSpaceIndex(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.println(s);
                System.out.println("first space "+i);
                break;
            }
        }

        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                System.out.println(s);
                System.out.println("last space "+i);
                break;
            }
        }

    }
    //2014 q6
    public static void filenameExtension(String s)
    {
        String ext="",fn="";
        for(int i=0;i<s.length();i++)
        {
            ext=s.substring(s.indexOf('.')+1);
            fn=s.substring(s.lastIndexOf('\\')+1,s.indexOf('.'));
        }

        System.out.println("Path is "+s);
        System.out.println("Filename is "+fn);
        System.out.println("extension is "+ext);
    }

    public static void ISBN(int n)
    {
        String s="";
        s=s+n;
        int sum=0,cc=0;
        if(s.length()==10)
        {
            for(int j=1;j<=10;j++)
            {
                for(int k=cc;k<j;k++)
                {
                    sum=sum+(j*s.charAt(k));
                }
                cc++;
            }
            if(sum%11==0)
            {
                System.out.println("LEGAL");
            }
            else
            {
                System.out.println("ILLEGAL");
            }
        }
        else
        {
            System.out.println("ILLEGAL"); 
        }

    }

    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' ||     c=='u' || c=='U')
        {    
            return true;
        }    
        else
        {
            return false;
        }    
    }
    //2013 q6
    public static void Piglatin(String w)
    {
        w=w.toUpperCase();
        for(int i=0;i<w.length();i++)
        {
            if(isVowel(w.charAt(i))==true)
            {
                w=w.substring(w.indexOf(w.charAt(i)),w.length())+w.substring(0,w.indexOf(w.charAt(i)))+"AY";
                break;
            }
        }
        System.out.println(w);
    }
    //2013 q8ii
    public static void numPat(double a, double n)
    {
        double pro=1,div=1,sum=0;
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=c+1;k++)
            {
                pro=pro*a;
            }
            div=c/pro;
            sum=sum+div;
            c=c+3;
            div=0;
            pro=1;
        }
        System.out.println(sum);
    }
    //2013 q9 ii
    public static void findSmallest(int i)
    {

    }

    /*
     * Write a program in java where user enters a certain numbers in
     * an array , create functions to find mean , median and mode of 
     * the elements entered.
     */

    public static void numStats(int []a)
    {
        ascendingOrder.ascendingOrder(a);
        double sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        double mean=sum/a.length;
        int g=a.length/2;
        int h=g+1;
        double median=0;
        if(a.length%2==0)
        {
            median=0.5*(a[g-1]+a[h-1]);
        }
        else
        {
            median=a[g];
        }
        int b=0,c=0,d=0,e=0;
        for(int i=0;i<a.length;i++)
        {
            for(int k=0;k<a.length;k++)
            {
                b=a[i];
                if(a[k]==b)
                {
                    c++;
                }

            }
            if(c>d)
            {
                e=c;
            }
            d=c;
            c=0;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Mean is "+mean+"\n"+"Median = "+median+"\n"+"Mode = "+e);
        //how to find out mode
    }

    public static void numPat1(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void numPat2(int r)
    {
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    /*(a) Convert the following segment into equivalent for loop
    {
    Int I,L=0;
    while(i<=20)
    {
    System.out.println(i+” “);
    L++;
    }
     */
    public static void convert()
    {
        int i,L=0;
        for(i=0;i<=20;)
        {
            System.out.println(i+" ");
            L++;
        }    
    }

    /*
     * enter angle in degree
     */
    public static void sinSeries(double x)
    {
        int cc=1;
        double rad=(x*3.14)/180,mul=1,fac=1,sin=rad;

        for(int i=3;i<=1000;i=i+2)
        {

            for(int j=1;j<=i;j++)
            {
                mul=mul*rad;
                fac=fac*j;
            }
            double v=mul/fac;

            if(cc%2==1)
            {
                sin=sin-v;
            }
            else
            {
                sin=sin+v;
            }
            cc++;
        }
        System.out.println(sin);
    }

    public static void password()
    {
        int[]a={0,1,2,3,4,5,6,7,8,9};
        char[] c={'a','b','c','d','e','f','g','h','i','j'};
        //System.out.println(Math.random());
        int n=(int)(Math.random()*10);
        int n2=(int)(Math.random()*10);
        System.out.println(n+"\n"+n2);
        String pass="";
        for(int i=1;i<=6;i++)
        {
            if(i%2==1)
            {
                pass=pass+c[n];
            }
            else
            {
                pass=pass+Character.toUpperCase(c[n2]);
            }
        }
        for(int i=1;i<=4;i++)
        {
            if(i%22==1)
            {
                pass=pass+a[n];
            }
            else
            {
                pass=pass+"$";
            }
        }
        System.out.println(pass);
    }

    public static void pat(int n)
    {
        double sum=0,div=1,pr=1;
        for(int i=2;i<=n+1;i++)
        {
            for(int k=1;k<=i;k++)
            {
                pr=pr*k;
                sum=sum+k;
            }
            div=pr/sum;
            System.out.print(div+",");
            pr=1;sum=0;div=1;
        }
    }

    public static void libraryFees(int d)
    {
        int f=0;
        if(d>0 && d<=5)
        {
            f=10;
        }
        else if(d>5 && d<=10)
        {
            f=10+(d-5)*5;
        }
        else if(d>10 && d<=15)
        {
            f=10+5*5+(d-10)*7;
        }
        System.out.println("Sir, your fine ="+f);

    }
    static Scanner sc=new Scanner(System.in);
    public static void randomNumberGenerator()
    {
        System.out.println("Sir enter the size of the number you want");
        int n=sc.nextInt(),pro=1;
        for(int i=1;i<=n;i++)
        {
            pro=pro*10;
        }

        double r=Math.random();
        String s=r+"";
        int rn=0;
        if(s.charAt(0)!=0)
        {
            rn=(int)(Math.random()*pro);
        }
        else
        {
            rn=(int)(Math.random()*pro*10);
        }
        System.out.println(rn);

    }

    public static void randomPassWordGenerator()
    {
        System.out.println("How long should the password be?");
        int n=sc.nextInt();
        int nl=n/2,nn=0;
        if((n-n/2)%2==0)
        {
            nn=(n-(n/2))/2;
        }
        else
        {
            nn=(n-(n/2)+1)/2;
        }
        int nsc=n-nn-nl;
        int rn=(int)(Math.random()*10);
        int rn1=(int)(Math.random()*10);
        String pass="";
        char[]l={'a','b','c','d','e','f','g','h','i','j'};
        char[]sc={'!','@','#','$','%','^','&','*','?','\\'};
        int cc=0;
        if(rn<=4)
        {
            for(int i=1;i<=nn;i++)
            {
                int r=(int)(Math.random()*10);
                pass=pass+r;

            }
            if(rn%2==0)
            {
                for(int i=1;i<=nl/2;i++)
                {
                    pass=pass+l[rn];
                    cc++;
                }
                for(int i=1;i<=nl-2;i++)
                {
                    pass=pass+Character.toUpperCase(l[rn1]);
                    cc++;
                }
            }
            else
            {
                for(int i=1;i<=nl-2;i++)
                {
                    pass=pass+Character.toUpperCase(l[rn1]);
                    cc++;
                }
                for(int i=1;i<=nl/2;i++)
                {
                    pass=pass+l[rn];
                    cc++;
                }
            }
            pass=pass+sc[fact.factorial(rn)%10];
        }
        else
        {
            pass=pass+sc[fact.factorial(rn)%10];
            for(int i=1;i<=nn;i++)
            {
                int r=(int)(Math.random()*10);
                pass=pass+r;

            }
            for(int i=1;i<=nl-2;i++)
            {
                pass=pass+Character.toUpperCase(l[rn]);
                cc++;
            }
            for(int i=1;i<=nl/2;i++)
            {
                pass=pass+l[rn1];
                cc++;
            }
        }
        System.out.println(pass);
    }

    static void sam()
    {
        Double d=new Double(2.09);
        System.out.println(d.intValue());
        String s="10092";
        int t=Integer.parseInt(s);
    }

    public static void array(int []a)
    {
        int tmp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;i<=a.length-i-1;i++)
            {
                if(a[j]>a[j+1])
                {
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void perfectNumber()
    {

    }

    public static void findWord(String s,String w)
    {
        s=s.trim().toLowerCase()+" ";
        w=w.trim().toLowerCase();
        String word="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word=word+s.charAt(i);
            }
            else
            {
                if(word.equals(w))
                {
                    System.out.println("The word has been found");
                    break;
                }
                else
                {
                    System.out.println("The word has not been found");
                }
                word="";
            }

        }

    }

    public static void capital(String s)
    {
        s=s.trim().toLowerCase()+" ";
        String word="";
        String ss="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                word=word+s.charAt(i);
            }
            else
            {
                word=Character.toUpperCase(word.charAt(0))+word.substring(1);;
                ss=ss+" "+word;
                word="";
            }

        }
        System.out.println(ss);
    }
    //ask
    public static void removeDuplicate(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        for(int i=0;i<a.length;i++)
        {
            int tn=a[i];
            for(int k=0;k<a.length;k++)
            {
                if(k==i)
                {
                }
                else
                {
                    if(tn==a[k])
                    {
                        a[k]=-1;
                    }
                }
            }

        }
        int []b=new int[a.length];
        int p=0;
        System.out.println();
        for(int i=0;i<a.length;i++)
        {

            if(a[i]!=-1)
            {
                b[p]=a[i];
                p++;
            }
        }
        b[p]=-11;
        int i=0;
        while(b[p]!=-11)
        {
            System.out.println(b[i]);
            i++;
        }
    }
    //ask
    public static void patSum(int n)
    {
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum-(1/(double)i);
            }
            else
            {
                sum=sum+(1/(double)i);
            }
        }
        System.out.println(sum);
    }

    public static void sumOfFact(int n)
    {
        int fact=1,sum=0;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                fact=fact*k;
            }
            sum=sum+fact;
            fact=1;
        }
        System.out.println(sum);
    }

    public static void HarshadNumber(int n)
    {
        int sum=0,nn=n;;
        do
        {
            sum=sum+n%10;
            n=n/10;
        }while(n>0);
        if(nn%sum==0)
        {
            System.out.println("it is harshad number");
        }
        else
        {
            System.out.println("it is not harshad number");
        }
    }

    public static void quadratic(int a,int b,int c)
    {

        double root1=0,root2=0;
        if(b*b-4*a*c>=0)
        {
            root1=(-b+Math.sqrt(b*b-4*a*c))/2;
            root2=(-b-Math.sqrt(b*b-4*a*c))/2;
            System.out.println("Root 1 "+root1);
            System.out.println("Root 2 "+root2);
        }
        else
        {
            System.out.println("No real roots possible" );
        }
    }
    
    public static void cbyV(int a,int b)
    {
        int tmp=a;
        a=b;
        b=tmp;
        System.out.println("a= "+a+" "+"b= "+b);
    }
    
    
    public static void callerM()
    {
        int a=15,b=50;
        System.out.println("a= "+a+" "+"b= "+b);
        cbyV(a,b);
    }
    
    
    
}
