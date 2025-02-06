
import java.util.*;
public class Numbers
{
   int[] numbs=new int[2];
   Scanner sc=new Scanner(System.in);
   
   void storeUserValues()
   {
       for(int k=0;k<numbs.length;k++)
       {
           numbs[k]=sc.nextInt();
        }
    }
   void displayEvens()
   {
        for(int k=0;k<numbs.length;k++)
       {
           if(numbs[k]%2==0)
           {
               System.out.println("evevn "+numbs[k]);
            }
        }
        
    }
        void displayOdds()
   {
        for(int k=0;k<numbs.length;k++)
       {
           if(numbs[k]%2==1)
           {
               System.out.println(" odd "+numbs[k]);
            }
        }
        
    }
}
