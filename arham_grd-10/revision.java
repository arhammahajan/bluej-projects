
public class revision
{
    public void takeArray(int[] sampleArray)
    {
        for(int k=0;k<sampleArray.length;k++)
        {
            int n=sampleArray[k];
            if(n%10==6)
            {
                System.out.println(n);
            }
        }
    }

    public void takeArray(int[] sampleArray,int n)
    {
        if(n>=0 && n<10)
        {
            for(int k=0;k<sampleArray.length;k++)
            {
                int na=sampleArray[k];
                if(na%10==n)
                {
                    System.out.println(na);
                }
            }
        }
    }

    /*rite a method which takes in an array and
     *  displays all the 2 digit numbers
     */

    public void display2Digit(int[] sampleArray)
    {
        for(int k=0;k<sampleArray.length;k++)
        {
            int na=sampleArray[k];
            if(na>9 && na <100)
            {
                System.out.println(na);
            }
        }
    }

    public void details(int[] age, String[] name, int[] joiningyear)
    {
        if(age.length==name.length && name.length==joiningyear.length)
        {
            for(int p=0;p<age.length;p++)
            {
                if(age[p]>=60)
                {
                    System.out.println("Name "+name[p]+"\tage "+age[p]+"\tjoining year"+joiningyear[p]);
                }
            }
        }
    }

    public boolean sameFirstLast(String[] a)
    {
        boolean b=false;
        if(a[0]==a[a.length-1])
        {
            b=true;
        }
        return b;
    }

    /*
     * sameFirstOrLastElement()
    given 2 int arrays ,  return true if they have the same first element
    or they have the same last element. 
     */

    public boolean sameFirstorLast(String[] a,String[] c)
    {
        boolean b=false;
        if(a[0]==c[0] || a[a.length-1]==c[c.length-1])
        {
            b=true;
        }
        return b;
    }

    /*
     * sameFirstAndLastElement()
    given 2 int arrays ,  return true if they have the same
    first element and they have the same last element. 
     */

    public boolean sameFirstandLast(int[] a,int[] c)
    {
        boolean b=false;
        if(a[0]==c[0] && a[a.length-1]==c[c.length-1])
        {
            b=true;
        }
        return b;
    }
    
     public boolean sameArray(int[] a,int[] c)
    {
        boolean b=false;
        if(a.length==c.length)
        {
            for(int k=0;k<a.length;k++)
            {
                if(a[k]==c[k])
                {
                    b=true;
                }
                else
                {
                    b=false;
                    break;
                }
            }
        }
        return b;
    }
    
     public boolean sameArray(String[] a,String[] c)
    {
        boolean b=false;
        if(a.length==c.length)
        {
            for(int k=0;k<a.length;k++)
            {
                if(a[k].equals(c[k]))
                {
                    b=true;
                }
                else
                {
                    b=false;
                    break;
                }
            }
        }
        return b;
    }
    
    public void vowelWords(String[] sa)
    {
        for(int k=0;k<sa.length;k++)
        {
            String first=(""+sa[k].charAt(0)).toLowerCase();
           String last=(""+sa[k].charAt(sa[k].length()-1)).toLowerCase();
           if(first.startsWith("a") ||first.startsWith("e") ||first.startsWith("i") ||first.startsWith("o") ||first.startsWith("u") )
           {
               if(last.startsWith("a") ||last.startsWith("e") ||last.startsWith("i") ||last.startsWith("o") ||last.startsWith("u") )
               {
                   System.out.println(sa[k]);
                }
            }
        }
    }
    
}
