
public class Armstrong
{   
    int n;

    private int decide(int x)
    {
        int pn=0;
        n=x;
        int dig=0;

        
        
        while(x>0)
        {

            dig=x%10;
            pn=pn+dig*dig*dig;

            x=x/10;
        }

        if(pn==n)
        {
            return pn;
        }
        else
        {
            return 0;
        }
    }
    
    public void printA(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int y=decide(i);
            if(y!=0)
            {
                System.out.println(y);
            }
        }
        
    }
}
