
public class find_facorial
{
    int fact=1;
    int x;
    public void  factorial(int n)
    {
        for(int lv=1;lv<n;lv++)
        {
            
            fact =fact*lv;
            x=fact*n;
            
        }
        System.out.println(n+"! = "+x);
    }
}
