
public class searching_programs
{
    public static int[] search(int n,int []a)
    {
        int low=a[0];
        int high=a[a.length-1];
        int mid=(0+a.length-1)/2;
        for(int i=0;i<a.length;i++)
        {
            if(n==mid)
            {
                System.out.println("Search was found");
                break;
            }
            else if(n>mid)
            {
                
            }
        }
        return a;
    }

}
