
public class string_ops_1 extends rev3
{
    /*eg "pass1 pass2" 
      sod= 3
     */
   public static int sumOfDigitsInString(String word)
   {
       String s="";
       int sod=0;
       for(int k=0;k<word.length();k++)
       {
           char c=word.charAt(k);
           if(Character.isDigit(c))
           {
               
               int n=Integer.parseInt(word.substring(k,k+1));
               sod=sod+n;
           }
       }
       return sod;
   }
   
   
   public static int sumOfNumbersInAString(String word)
   {
       word=word.trim()+" ";
       String digitset="";
       int son=0;
       for(int k=0;k<word.length();k++)
       {
           char c=word.charAt(k);
           if(Character.isDigit(c))
           {
               digitset=digitset+c;
            }
            else
            {
                
                if(digitset.length()>0)
                {
                    int n=Integer.parseInt(digitset);
                    son=son+n;
                }
                digitset="";
            }
        }
        return son;
   }
   
   public static void check()
   {
       String str = "Training Days" + (1+0);
System.out.println("Understanding" + str);

    }
}
