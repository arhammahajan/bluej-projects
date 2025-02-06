
public class shishuPanda
{
    public static void nobiNobita(String s)
    {
        s=s.trim(); 

        String w=s.toLowerCase();

        String currentword="";
        for(int k=0;k<w.length();k++)
        {
            char a=w.charAt(k);
            if(a==' ')
            {
                System.out.println(currentword);

                currentword="";
                break;
            }
            else
            {
                currentword=currentword+a;

            }

        }

        for(int l=w.length()-1;l>=0;l--)
        {

            char b=w.charAt(l);
            if(b==' ')
            {
                for(int m=0;m<currentword.length();m++)
                {
                    currentword=currentword+currentword.charAt(m);
                }
                System.out.println(currentword);

                currentword="";
                break;
            }
            else
            {
                currentword=currentword+b;

            }
        }
    }
}
