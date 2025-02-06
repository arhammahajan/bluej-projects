
public class PrimeNumber
{
    int number;
    boolean ans;

    void getNumber(int n)
    {
        number=n;
        ans=true;
    }

    private void prime()
    {

        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                ans=false;
                break;
            }
        }
    }

    public void decide()
    {
        prime();
        if(ans)
        {
            System.out.println(number+"is a Prime Number");
        }
        else
        {
            System.out.println(number+"is not a Prime Number");
        }
    }

}

