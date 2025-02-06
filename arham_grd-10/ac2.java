 
public class ac2
{
    int largestValue(int[] a)
    {
        int i,lv=a[0];
        for(i=0;i<a.length;i++)
        {
            if(a[i]>lv)
            {
                lv=a[i];
            }
            
        }
        return lv;
    }
    
     int smallestValue(int[] a)
    {
        int i,sv=a[0];
        for(i=0;i<a.length;i++)
        {
            if(a[i]<sv)
            {
                sv=a[i];
            }
            
        }
        return sv;
    }
    
    String largestString(String[] a)
    {
        int i;
        String ls=a[0];
        for(i=0;i<a.length;i++)
        {
            if(a[i].length()>ls.length())
            {
                ls=a[i];
            }
            
        }
        return ls;
    }
    
     String smallestString(String[] a)
    {
        int i;
        String ss=a[0];
        for(i=0;i<a.length;i++)
        {
            if(a[i].length()>ss.length())
            {
                ss=a[i];
            }
            
        }
        return ss;
    }
    
    
}
