import java.util.*;
public class at2
{
    int[] rollnos;
    String[] name; 
    char[] housealpha;
    double[] overallpercent;
    Scanner is=new Scanner(System.in);
    Scanner ts=new Scanner(System.in);
    public void callerMethod(int n)
    {
        initializeArray(n);
        fillarrayWithScanner(n);
        displayDetails(n);
    }
    
    private void initializeArray(int n)
    {
        rollnos=new int [n];
        name =new String[n];
        housealpha=new char[n];
        overallpercent=new double[n];
    }
    
    private void fillarrayWithScanner(int n)
    {
        for(int k=0;k<n;k++)
        {
            System.out.println("Enter the roll no.");
            rollnos[k]=is.nextInt();
            System.out.println("Enter the name");
            name[k]=ts.nextLine();
            System.out.println("Enter your house ");
            housealpha[k]=ts.nextLine().trim().charAt(0);
            System.out.println("Enter the overall percent");
            overallpercent[k]=is.nextInt();
        }
    }
    
    private void displayDetails(int n)
    {
        for(int k=0;k<n;k++)
        {
            System.out.println(rollnos[k]+"\t"+name[k]+"\t"+housealpha[k]+"\t"+overallpercent[k]);
        }
    }
}
