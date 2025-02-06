
public class test_32
{
    static void mm()
    {
        int m=10,n=6;
         m  -= 9%++n + ++n/2; 
        System.out.print("TRANSPARENT".compareTo("TRANSITION"));

    }

    static void print()
    {
        System.out.print(10/5+",");
    }

    public static int calc(int n1,int n2)
    {
        return n1==n2?(2*n1):(2*n2);
    }

    public static void ages(int[] age,char []gender)
    {
        if(age.length==gender.length)
        {
            float c1=0,c2=0,c3=0,m=0,f=0,sum1=0,sum2=0;
            float avgm=0,avgf=0;
            for(int i=0;i<age.length;i++)
            {
                if(age[i]<18)
                {
                    c1++;
                }
                else if(age[i]>=18 && age[i]<=80)
                {
                    c2++;
                    if(gender[i]=='m')
                    {
                        m++;
                        sum1=sum1+age[i];
                    }
                    else
                    {
                        f++;
                        sum2=sum2+age[i];
                    }
                }
                else if(age[i]>80)
                {
                    c3++;
                }
            }
            avgm=sum1/m;
            avgf=sum2/f;
            System.out.println("less than 18\t:"+c1);
            System.out.println("18-80\t\t:"+c2);
            System.out.println("above 80\t:"+c3);
            System.out.println("average of men in the range of 18-80\t:"+avgm);
            System.out.println("average of women in the range of 18-80\t:"+avgf);
        }
    }

    String join(int a,int b,int c)
    {
        String s="";
        s=s+a+b+c;
        return s;
    }

    String join(char a,char b,char c)
    {
        String s="";
        s=s+a+b+c;
        return s;
    }

    static void reverse(int n)
    {
        do
        {
            System.out.print(n%10);
            n=n/10;

        }while(n>0);
    }

    public static void series(int n)
    {
        int sum=1,p=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=i;j++)
            {
                sum=sum+j;
                p=p*j;
                System.out.print(p/sum+",");
            }
        }
    }
}
