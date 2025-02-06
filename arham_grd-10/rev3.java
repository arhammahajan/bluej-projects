
public class rev3
{
    public static void main(String[]args){}

    /*write an overloaded method
    sort()
    takes in char[]/int[] arrays*/
    
    public static void sort(int[] n)
    {
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-i-1;j++)
            {
                if(n[i]>n[i+1])
                {
                    int b=n[i];
                    n[i]=n[i+1];
                    n[i+1]=b;
                }
            }
        }
        displayIntArray(n);
    }
    
    public static void displayIntArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
        public static void displayCharArray(char[] a)
    {
        for(char i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    public static void sort(char[] n)
    {
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-i-1;j++)
            {
                if(n[i]>n[i+1])
                {
                    char b=n[i];
                    n[i]=n[i+1];
                    n[i+1]=b;
                }
            }
        }
        displayCharArray(n);
    }
}
