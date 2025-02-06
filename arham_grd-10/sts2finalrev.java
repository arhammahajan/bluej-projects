
public class sts2finalrev
{
    public void displaysomeElements(String[] a)
    {
        for(int k=0;k<a.length;k++)
        {
            if(a[k].length()>10)
            {
                System.out.println(a[k]);
            }
        }
        
    }
    
    public boolean firstlastSame(int [] a)
    {
        boolean b=false;
        if(a[0]==a[a.length-1])
        {
            b=true;
        }
        return b;
    }
    
    public int largeroffirstLast(int[] a)
    {    
        int i=0;
        if(a[0]>a[a.length-1])
        {
            i=a[0];
        }
        else
        {
            i=a[a.length-1];
        }
        return i;
    }
}