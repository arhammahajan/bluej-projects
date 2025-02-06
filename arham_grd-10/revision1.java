
public class revision1
{
    ///write a method which takes in a string parameter and displays each character of the string and its ascii value on different lines

    public void charascii(String line)
    {
        line=line.trim();
        for(int k=0;k<line.length();k++)
        {
            char letter=line.charAt(k);
            System.out.println("Character = "+letter+"   Ascii value is "+((int)letter));
        }
    }

    //method to print the sum of ascii of each letter

    public void sumOfAscii(String word)
    {
        int total=0;
        word=word.trim();

        for(int k=0;k<word.length();k++)
        {
            char letter =word.charAt(k);
            int ascii=(int)letter;
            total=total+ascii;
            System.out.println("Total = "+total);
        }
    }

    //write a method which takes in 2 int parameters and  provided their values are in the range of 70-300 displays the char value of all number between these numbers

    public void printCharValue(int sv,int ev)
    {
        if(sv>50 && ev<=100)
        {
            for(int k=sv;k<=ev;k++)
            {
                char a=(char)k;
                System.out.println("Number "+k+" Char value "+a);
            }
        }
    }

    /* write a method which displays the vowels ,consonants,special characters and digits of a word
     * accepted as a parameter
     */

    public void wordStats(String word)
    {
        word=word.trim();
        String w=word.toLowerCase();
        String vow="";
        String sc="";
        String con="";
        String dig="";
        char a=' ';
        for(int k=0;k<w.length();k++)
        {
            a=w.charAt(k);
            if(a>='a' && a<='z')
            {

                if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
                {
                    vow=vow+word.charAt(k);
                }
                else
                {
                    con=con+ word.charAt(k);
                }
            }

            else if (a>=0 && a<=9)
            {
                dig=dig+word.charAt(k);
            }
            else
            {
                sc=sc+word.charAt(k);
            }
        }
    }

    public static void alphaFreq(String s)
    {

        int cc=0;
        for(int k=0;k<s.length();k++)
        {
            char a=s.charAt(k);
            cc=0;
            for(int m=0;m<s.length();m++)
            {
                if(a==s.charAt(m))
                {
                    cc++;

                }
            }

            System.out.println(s.charAt(k)+" Appears "+cc+" times");
        }
    }

    // write a method which displays all the vowels in a given string provided it is followed by another vowel

    public static void disVowel(String s)
    {
        s=s.trim()+" ";
        String w=s.toLowerCase();
        for(int k=0;k<w.length();k++)
        {
            if(w.charAt(k)=='a' || w.charAt(k)=='e' ||w.charAt(k)=='i' ||w.charAt(k)=='o' ||w.charAt(k)=='u')
            {
                if(w.charAt(k+1)=='a' ||w.charAt(k+1)=='e' ||w.charAt(k+1)=='i' ||w.charAt(k+1)=='o' ||w.charAt(k+1)=='u')
                {
                    System.out.println(w.charAt(k)+" "+w.charAt(k+1));
                }
            }
        }
    }

    public static void vowFreq(String w)
    {
        w=w.trim().toLowerCase()+" ";
        int cc=0;

        for(char k='a';k<='z';k++)
        {

            for(int l=0;l<w.length();k++)
            {
                char a=w.charAt(l);
                if(k=='a')
                {
                    if(k==a)
                    {
                        cc++;
                        System.out.println("'A' appears "+cc+" times");
                    }
                    if(k==a)
                    {
                        cc++;
                        System.out.println("'E' appears "+cc+" times");
                    }
                }
            }

        }
    }

    public static void alphaseq(String w)
    {
        String s=w.toLowerCase().trim();
        for(int k=0;k<w.length()-1;k++)
        {
            char s1=s.charAt(k);
            char s2=s.charAt(k+1);
            if(s2==(s1+1))
            {
                System.out.println(w.charAt(k)+""+w.charAt(k+1));
            }
        }
    }

    public void alphafreq2(String s)
    {
        s.toLowerCase();
        int cc=0;
        for(char k='a';k<='z';k++)
        {

            cc=0;
            for(int l=0;l<s.length();l++)
            {
                char a= s.charAt(l);
                if(k==a)
                {
                    cc++;
                }
            }
            if(cc==0)
            {

            }
            else
            {
                System.out.println(k+" Appears "+cc+" times");
            }
        }
    }
}
