
public class series
{
    static void printSeries(int a)
    {
        String s="";
        for(int i=1;i<=a;i++)
        {
            do
            {
                if(i%2==1)
                {
                    s=s+i+" , ";
                }
                else
                {
                    s=s+(i*i)+" , ";
                }
            }while(0>1);
        }
        System.out.println(s);
    }
    
    static void displayFactors(int a)
    {
        int i=0;
        while(a>0)
        {
            i++;
            if(a%i==0)
            {
                System.out.println(i);
            }
            if(a==i)
            {
                break;
            }
        }
    }
    
}

