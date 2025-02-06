
public class sort
{
    public void bb(int[]na)
    {
        System.out.println("elements before sort");
        displayArray(na);
        for(int ol=0;ol<na.length;ol++)
        {
            for(int il=0;il<na.length-1-ol;il++)
            {
                if(na[il]>na[il+1])
                {
                    int t=na[il];
                    na[il]=na[il+1];
                    na[il+1]=t;
                }
            }
        }
    }

    void displayArray(int[]na)
    {
        for(int p=0;p<na.length;p++)
        {
            System.out.println(na[p]+" ");
        }
    }
}
