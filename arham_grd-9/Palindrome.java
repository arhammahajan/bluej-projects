             
public class Palindrome
{
    int n;
    public void getData(int nn)
    {
        n=nn;
        decide();
    }
    
    private void decide()
    {
        int pn=0;
        int dig=0;
        
        int x=n;
        int rn=0;
        while(x>0)
        {
            
            dig=x%10;
            pn=pn+dig*dig*dig;
            rn=(10*rn)+dig;
            x=x/10;
        }
        if(rn==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        if(pn==n)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
    
}
