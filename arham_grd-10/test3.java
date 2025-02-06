
public class test3
{
    void arrs(int[] array)
    {
        int l=0,s=0;
        l=array[0];
        s=array[0];
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>l)
            {
                l=array[i];
            }
            if(array[i]<s)
            {
                s=array[i];
            }
        }
        sum=l+s;
        System.out.println(sum);
    }

    
    public void arrdata(int[] array)
    {
        float sum=0;
        float avg=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];

        }
        avg=sum/array.length;
        System.out.println(sum);
        System.out.println(avg);
    }

    void d()
    {
        
        char y='y';
        boolean z=Character.isLetter(y);
        System.out.println(z);
    }
}
