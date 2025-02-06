
public class Test
{
    /*Write a program which takes a line of text from the user and find the number of vowels in
    it.
     */

    public static void vowFreq(String s)
    {
        s=s.trim()+" ";
        String w=s.toLowerCase();
        int cc=0;
        for(int k=0;k<s.length();k++)
        {
            char a =w.charAt(k);
            if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' )
            {
                cc++;
            }
        }
        System.out.println("There are "+cc+" vowels");
    }

    public static void replace(String s)
    {
        s=s.trim()+" ";
        String w=s.toLowerCase();

        w=w.replace('m','j');
        System.out.println(w);
    }

    public static void demo(char s)
    {
        int i=(int)s;
        System.out.println(i);
    }

    public static void findIndex(String s,char p)
    {

        String j="";
        for(int l=0;l<s.length();l++)
        {
            if(p==s.charAt(l))
            {

                j=j+" "+l;
            }
        }
        System.out.println(j);

    }

    public static void join(String s1,String s2)
    {
        int k=s1.compareTo(s2);
        String s=null;
        if(k>0)
        {
            s=s2.concat(s1);

        }
        else if(k<0)
        {
            s=s1.concat(s2);
        }
        else
        {
            s=s2.concat(s1) ;
        }
        System.out.println(s);
    }

    public static void  joinReverse(String s1,String s2)
    {
        String w1="";
        String w2="";
        for(int k=s1.length()-1;k>=0;k--)
        {
            w1=w1+s1.charAt(k);
        }
        for(int l=s2.length()-1;l>=0;l--)
        {
            w2=w2+s2.charAt(l);
        }
        System.out.println(w2.concat(w1).toUpperCase());
    }

    public static void sub(String s,int sv,int ev)
    {
        s=s.trim()+" ";
        String w=s.substring(sv,ev);
        System.out.println(w);
    }

    public static void removesub(String s,char n,char m)
    {
        s=s.toLowerCase();
        String d="";
        for(int k=0;k<s.length();k++)
        {
            char a=s.charAt(k);
            if(a==n)
            {
                for(int l=k;l<s.length();l++)
                {
                    if(s.charAt(l)==m)
                    {

                        d=s.substring(0,k)+s.substring(l+1,s.length());
                    }
                }
            }

        }
        System.out.println(d);
    }

    public static void nameEmail(String n,String e)
    {
        n=n.toUpperCase();
        e=e.toUpperCase();
        System.out.println("Name "+n);
        System.out.println("Email "+e);
        System.out.println("L of email "+e.length());
        System.out.println("L of name "+n.length());
        System.out.println("Index of '@' "+e.indexOf('@'));
    }

    public static void findConsonant(String s)
    {
        s=s.trim()+" ";
        String w=s.toLowerCase();
        int cc=0;

        for(int l='a';l<='z';l++)
        {
            if(l=='a' ||l=='e' ||l=='i' ||l=='o' ||l=='u' )
            {

            }
            else
            {
                for(int k=0;k<w.length();k++)
                {
                    char a=w.charAt(k);
                    if(l==a)
                    {
                        cc++;
                    }
                }
            }
        }
        System.out.println(cc);
    }

    public static void pass(String p)
    {
        p=p.trim()+" ";
        int sc=0;
        int lc=0;
        int up=0;
        if(p.length()>=8 && p.length()<=16)
        {
            for(int k=0;k<p.length();k++)
            {
                char a=p.charAt(k);

                if(a=='*' ||a=='&' )
                {
                    sc++;

                }
                for(char l='a';l<='z';l++)
                {
                    if(a==l)
                    {
                        lc++; 
                    }

                }
                for(char m='A'; m<='Z';m++)
                {
                    up++;
                }
            }
            if(sc>0 && lc>0 && up>0)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid"); 
            }
        }
        else
        {
            System.out.println("Invalid");
        }
    }

    public static void convert(String s)
    {

        for(int k=0;k<s.length();k++)
        {
            char a=s.charAt(k);
            if(a==' ')
            {
                char b=s.charAt(k+1);
                int i=(int)(b)+32;
                char uc=(char)i;

            }
            if(a=='.')
            {
                s.replace('.','!');
            }
        }
        System.out.println(s);
    }

    public static void addName(String n,String fn)
    {
        n=n.trim();
        fn=fn.trim();
        String s="";
        for(int k=0;k<n.length();k++)
        {
            n=n.trim()+" ";
            char a=n.charAt(k);
            if(a==' ')
            {
                if(k==n.length()-1)
                {

                }
                else
                {
                    s=n.substring(0,k)+" "+fn+n.substring(k,n.length());
                }
            }
        }
        System.out.println(s);
    }

    public static void arrange(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        String w1="";
        String w2="";
        for(char k='a';k<='z';k++)
        {

            for(int l=0;l<s1.length();l++)
            {
                char a=s1.charAt(l);
                if(k==a)
                {
                    w1=w1+a;
                }
            }
            for(int p=0;p<s1.length();p++)
            {
                char b=s2.charAt(p);
                if(k==b)
                {
                    w2=w2+b;
                }
            }

        }
        System.out.println(w1+"\n"+(w2));
    }

    public static void check(String w)
    {
        w=w.trim();
        w=w.toLowerCase();
        boolean b;
        String r="";
        for(int k=w.length()-1;k>=0;k--)
        {
            r=r+w.charAt(k);
        }
        if(w.equals(r))
        {
            b=true; 
        }
        else
        {
            b=false;
        }
        System.out.println(b);
    }

    public static void print(String w)
    {
        w=w.trim();
        String s="";
        for(int l=0;l<w.length();l++)
        {
            for(char k='a' ;k<='z';k++)
            {
                if(w.charAt(l)==k)
                {
                    s=s+w.charAt(l);
                }
            }
        }
        System.out.println(s);
    }

    public static void caps(String w)
    {
        w=w.trim();
        String h=w.toUpperCase();
        for(char k='A';k<='Z';k++)
        {

            for(int l=0;l<h.length();l++)
            {
                if(k==h.charAt(l))
                {
                    w.replace(w.charAt(l),k);
                }
            }
        }
    }
    
    public static void swag()
    {
        System.out.println("timtomtam".charAt("sam".indexOf('m')+"sam".length()));
    }
    
     public void test()
     {
                 int[] na={12,14,18,22,35,45,49};
        for(int p=0;p<na.length;p++)
        {
            if(na[p]%na.length==0)
            {
                System.out.print(na[p]+"\t");
            }
        }  
        }
}
