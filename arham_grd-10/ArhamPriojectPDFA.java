import java.util.Scanner;
public class ArhamPriojectPDFA
{ 
    static Scanner sc=new Scanner(System.in);
    //Section 1
    /*
     * Q1
     */
    public static void elecBill(String name,int units)
    {
        double  cost=0;
        if(units<=200)
        {
            cost=units*3.80;
        }
        else if(units>200 && units<=300)
        {
            cost=200*3.80+(units-200)*4.40;
        }
        else if(units>300 && units<=400)
        {
            cost=200*3.80+100*4.40+(units-300)*5.10;

        }
        else if(units>400)
        {
            cost=200*3.80+100*4.40+100*5.10+(units-400)*5.80;

        }

        System.out.println("Name: "+name+"\nElectricity Bill= ₹"+cost);
    }

    /*
     * Q4
     */
    public static void roomAllo()
    {
        System.out.println("Enter your age");
        int age=sc.nextInt();
        String sem="";
        if(age>=21 && age<100)
        {
            if(age>=21 && age<=35)
            {
                sem="Hall";
            }
            else if(age>=36 && age<=45)
            {
                sem="LevelD";
            }
            else if(age>=46 && age<=60)
            {
                sem="LevelB";
            }
            else if(age>=61 && age<=70)
            {
                sem="LevelA";
            }
            else if(age>=71 && age<=90)
            {
                sem="GF2";
            }
            else if(age>=91)
            {
                sem="GF1";
            }
            System.out.println(sem);
        }
        else
        {
            System.out.println("Sorry you are not eligible to get a Seminar Room");
        }

    }

    /*
     * Q5
     */
    public static String nSidedShape(int n)
    {
        String shape="";
        if(n==1)
        {
            shape="circle";
        }
        else if(n==2)
        {
            shape="semi-circle";
        }
        else if(n==3)
        {
            shape="triangle";
        }
        else if(n==4)
        {
            shape="square";
        }
        else if(n==5)
        {
            shape="pentagon";
        }
        else if(n==6)
        {
            shape="hexagon";
        }
        else if(n==7)
        {
            shape="heptagon";
        }
        else if(n==8)
        {
            shape="octagon";
        }
        else if(n==9)
        {
            shape="nonagon";
        }
        else if(n==10)
        {
            shape="decagon";
        }
        return shape;
    }

    /*
     * q6
     */
    public static boolean acceptIntoMOvie(int age,boolean sup)
    {
        boolean a=false;
        if(age>=15 || sup==true)
        {
            a=true;
        }
        return a;
    }

    //Section 2
    /*
     * Q1
     */
    public static int equalNums(int a,int b,int c)
    {
        int n=0;
        if(a==b && b==c)
        {
            n=3;
        }
        else if(a==b || b==c || c==a)
        {
            n=2;
        }

        return n;
    }

    /*
     * Q2
     */
    boolean lastDigit(int a,int b,int c)
    {
        boolean ch=false;
        if(((a%10)*(b%10))%10==(c%10))
        {
            ch=true;
        }
        return ch;
    }

    /*
     * Q3
     */
    public static boolean numTest(int a,int b,int c)
    {
        boolean ch=false;
        for(int i=1;i<=b;i++)
        {
            a=a+a;
        }
        if(a%c==0)
        {
            ch=true;
        }
        return ch;
    }

    /*
     * Q5
     */
    public static String oddsVsEvens(int n)
    {
        String ans="even";
        int d=0;
        int odd=0;
        int even=0;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
            {
                even=even+d;
            }
            else if(d%2==1)
            {
                odd=odd+d;
            }
            n=n/10;

        }
        if(odd>even)
        {
            ans="odd";
        }
        return ans;
    }

    /*
     * Q6
     */
    public static String oddishOrEvenish(int n)
    {
        String ans="even";
        int d=0;
        int sum=0;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;

        }
        if(sum%2==1)
        {
            ans="odd";
        }
        return ans;
    }

    //Section 3
    /*
     * Q2
     */
    public static void elementsWithLastDigit(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%10==3 || a[i]%10==5)
            {
                System.out.println(a[i]);
            }

        }
    }

    /*
     * Q3
     */
    public static void elementsWithLastDigit(int[] a,int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(b>0 && b<10)
            {
                if(a[i]%10==b)
                {
                    System.out.println(a[i]);
                }
            }
            else 
            {
                if(a[i]%10==0)
                {
                    System.out.println(a[i]);
                }
            }

        }
    }

    public static int programmers(int a,int b,int c)
    {
        int l=0,s=0,d=0;
        if(a>b && a>c)
        {
            l=a;
        }
        else
        {
            s=a;
        }
        if(b>c && b>a)
        {
            l=b;
        }
        else
        {
            s=b;
        }
        if(c>b && c>a)
        {
            l=c;
        }
        else
        {
            s=c;
        }
        d=l-s;
        return d;
    }

    public static int programmers(int []a)
    {
        int l=a[0];
        int s=a[0];
        int d=0;
        for(int i=0;i<a.length;i++)
        {

            if(a[i]>l)
            {
                l=a[i];
            }
            if(a[i]<s)
            {
                s=a[i];
            }
            d=l-s;

        }
        return d;
    }

    //section 4

    /*
     * Q1
     */
    public static void sumOfSeries(int n)
    {
        int sum=0;
        int p=1;

        if(n>=5 && n<=15)
        {
            for(int i=1;i<=n;i++)
            {
                p=1;
                for(int k=1;k<=i;k++)
                {
                    p=p*k;

                }
                sum=sum+p;
            }
        }
        System.out.println(sum);

    }

    /*
     * Q2
     */
    public static void numbers()
    {
        int count=0;
        double sum=0;
        int n=0;
        int l=1;
        int s=0;
        double avg=0;

        String w="";
        for(int i=0;i<=1;i--)
        {
            

            n=sc.nextInt();
            if(i==0)
            {
                s=n;
            }
            w=w+"        "+n;

            if(n==0)
            {
                break;
            }
            sum=sum+n;
            if(n>l)
            {
                l=n;
            }
            if(n!=0)
            {
                count++;
                if(n<s)
                {
                    s=n;
                }
            }

        }

        avg=sum/count;
        System.out.println(w);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        System.out.println("Largest no. = "+l);
        System.out.println("Smallest no. = "+s);

    }

    //Section 5

    /*
     * Q1
     */
    public static void groupNumber(int[]a)
    {
        String p="",n="",o="",e="";
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                if(a[i]<0)
                {
                    n=n+a[i]+",";
                }
                if(a[i]>0)
                {
                    p=p+a[i]+",";
                }
                if(a[i]%2==0)
                {
                    e=e+a[i]+",";
                }
                if(a[i]%2!=0)
                {
                    o=o+a[i]+",";
                }
            }
        }
        System.out.println("Negative numbers are: "+n);
        System.out.println("Positive numbers are: "+p);
        System.out.println("Even numbers are: "+e);
        System.out.print("Odd numbers are: "+o);
    }

    /*
     * Q2
     */
    public static void arrayStats(int []a)
    {
        double l=a[0],s=a[0],avg=0,avg1=0,sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>l)
            {
                l=a[i];
            }
            if(a[i]<s)
            {
                s=a[i];
            }
            sum=sum+a[i];

        }
        avg=sum/a.length;
        avg1=(l+s)/2;
        System.out.println("Largest ="+l);
        System.out.println("Smallest = "+s);
        System.out.println("Sum= "+sum);
        System.out.println("Avg = "+avg);
        System.out.println("Avg of "+l+" and "+s+" = "+avg1);

    }

    /*
     * Q4
     */
    public static int warOfNumbers(int[]a)
    {
        int d=0,sum1=0,sum2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum1=sum1+a[i];
            }
            else if(a[i]%2==1)
            {
                sum2=sum2+a[i];
            }
        }
        if(sum1>sum2)
        {
            d=sum1-sum2;
        }
        else 
        {
            d=sum2-sum1;
        }
        return d;
    }

    //section 6
    /*
     * void driverAnalysis(char[] drivergender, int[] driverage , boolean[] hadAccident)
    method takes as input parameters the gender and age of n drivers and displays the following info based on the data received:
     */
    public static void driversAnalysis(int[]driverage,char[]drivergender,boolean[]hadaccident)
    {
        if(driverage.length==drivergender.length && driverage.length==hadaccident.length)
        {
            int a1=0,a2=0,a3=0,a4=0,a5=0;
            System.out.println("1>\nage range\tno of drivers\n*********\t*************");
            for(int i=0;i<driverage.length;i++)
            {
                if(driverage[i]<22)
                {
                    a1++;
                }
                if(driverage[i]>=22 && driverage[i]<=40)
                {
                    a2++;
                }
                if(driverage[i]>=41 && driverage[i]<=70)
                {
                    a3++;
                }
                if(driverage[i]>=71 && driverage[i]<=80)
                {
                    a4++;
                }
                if(driverage[i]>80)
                {
                    a5++;
                }
            }
            System.out.println("less than 22\t"+a1+"\n22-40\t\t"+a2+"\n41-70\t\t"+a3+"\n71-80\t\t"+a4+"\nabove 80\t"+a5+"\n");
            int fd=0,md=0,fa=0,ma=0;
            double summ=0,sumf=0;
            for(int k=0;k<driverage.length;k++)
            {
                if(drivergender[k]=='m'||drivergender[k]=='M')
                {
                    md++;
                    summ=summ+driverage[k];
                    if(hadaccident[k]==true)
                    {
                        ma++;
                    }
                }
                else if(drivergender[k]=='f'||drivergender[k]=='F')
                {
                    fd++;
                    sumf=sumf+driverage[k];
                    if(hadaccident[k]==true)
                    {
                        fa++;
                    }
                }
                
            }
            double avgm=summ/md;
            double avgf=sumf/fd;
            System.out.println("2>\nno.of female drivers:\t"+fd+"\nno. of male drivers:\t"+md+"\naverage age of female drivers:\t"+avgf+"\naverage age of male drivers:\t"+avgm+"\n");
            System.out.println("3>\nno. of female drivers who have met with an accident:\t"+fa+"\nno. of male drivers who have met with an accident:\t"+ma);
        }   
    }
}
 