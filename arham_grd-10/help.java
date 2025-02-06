
public class help
{
    public static void bubbleSort(int []a)
    {
        int tmp=0;
        for(int i=1;i<=a.length-1;i++)
        {
            for(int j=0;j<=a.length-i-1;j++)
            {
               if(a[j]<a[j+1])
               {
                   tmp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=tmp;
                }
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    
}
