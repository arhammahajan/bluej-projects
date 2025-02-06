public class t3
{
    int sumOfArray(int [] na)
    {
        int ss=0;
        for(int i=0;i<na.length;i++)
        {
            ss=ss+na[i];
        }
        return ss;
    }

    double avgOfArray(int [] na )
    {
        //sum/na.length
        return (sumOfArray(na)/na.length);
    }

    /*write a method which returns all the single digit values from
     * an array which has been received as the parameter
     * //22,32,1,4,67,898,6,5
     * returns only 1,4,5,6
     */

    //which returns the facr=tors of a number

    public static int countfactors(int n)
    {
        int nf=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                nf++;
            }
        }
        return nf;
    }
    
    public static int[] factors(int n)
    {
        int[] af=new int[countfactors(n)];
        int p=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                af[p]=i;p++;
            }
        }
        return af;
    }
    
    int [] displayNumbersUpto(int nv)
    {
        int na[]=new int[nv];
        for(int lv=1;lv<nv;lv++)
        {
            na[lv-1]=lv;//System.out.print(lv+" ");
        }
        return na;
    }
}
