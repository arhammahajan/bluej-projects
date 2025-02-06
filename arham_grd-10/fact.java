public class fact
{
    public static int factorial(int n)
    {
        int fa=n;
        if(n!=0)
        {
            for(int i=n-1;i>=1;i--)
            {
                fa=fa*i;
            }
        }
        else
        {
            fa=1;
        }
        return fa;
    }
}
