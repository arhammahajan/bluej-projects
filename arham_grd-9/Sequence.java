

public class Sequence
{
    public void compute(int n)
    {
        int sum=0;
        for(int lv=1;lv<=n;lv=lv+2)
        {
            sum=sum+lv;
            
            
        }
        System.out.println(sum);
    }
    
    public void doubleSequence(int n)
    {
        int tsum=0;
        for(int i=1;i<=n;i++)
        {
            int lsum=0;
            for(int j=1;j<=i;j++)
            {
                lsum=lsum+j;
            }
            tsum=tsum+lsum;
        }
        System.out.println("Total sum = "+tsum);
    }
}
