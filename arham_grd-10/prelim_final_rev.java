
public class prelim_final_rev
{
    public static void library(int days)
    {
        int fine=10;
        if(days==5)
        {

        }
        else if(days>5 && days<=10)
        {
            fine=fine+(days-5)*5;
        }
        else if(days>10 && days<=15)
        {
            fine=fine+(5*5)+(days-10)*7;
        }
        System.out.println(fine);
    }

    public static void ONEseries(int n)
    {
        String s="";
        for(int i=0;i<=n;i++)
        {
            s=s+"1";
            System.out.print(s+"\t");
        }
    }

    public static void arrange(int []a)
    {
        int n=a.length;
        int s,j,tmp,r;
        for(s=1;s<=n-1;s++)
        {
            for( j=0;j<=n-1-s;j++)
            {
                if(a[j]>a[j+1])
                {
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" "); 
        } 
    }

}
