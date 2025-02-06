import java.util.*;
public class at1
{
    Scanner is=new Scanner(System.in);
    Scanner ss=new Scanner(System.in);
    public void createArray()
    {
        int[] numbers={1,4,5,2,6,7,0,9,2,76};
        String[] words={"raju", "ramesh", "paandu", "bheem", "nobita", "binod", "krishna" };
        
        displayArrayContents(numbers);
        displayArrayContents(words);
    }

    public void displayArrayContents(int[] na)
    {
        for(int k=0;k<na.length;k++)
        {
            System.out.print(na[k]+" ");
        }
        System.out.println();
    }
    
    public void displayArrayContents(String[] sa)
    {
        for(int k=0;k<sa.length;k++)
        {
            System.out.println(sa[k]);
        }
    }
    
    public void createArrayAtRuntime()
    {
        System.out.println("How many array elements do you want?");
        int n=is.nextInt();
        int[] gn=new int[n];
        for(int k=0;k<gn.length;k++)
        {
            System.out.println("enter the array content");
            n=is.nextInt();
            gn[k]=n;//or else gn[k]=is,nextInt();
        }
        displayArrayContents(gn);
    }
    
   
}
