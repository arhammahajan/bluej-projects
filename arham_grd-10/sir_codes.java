import java.util.*;
public class sir_codes
{
    Scanner sc= new Scanner(System.in);
    public void takeOnion()
    {
        float [] a=new float[8];
        float n;
        float sum=0;
        float l=a[0];
        float av=0;
        float s=a[0];
        Scanner sc= new Scanner(System.in);
        for(int i =0;i<8;i++)
        {
            System.out.println("Enter the weight");

            n=sc.nextFloat();
            a[i]=n;
            sum=sum+a[i];
            av=sum/8;
            if(a[i]>l )
            {
                l=a[i];

            }
            if(a[i]<s)
            {
                s=a[i];
            }
            else
            {
            }

        }
        System.out.println("Average ="+av);
        System.out.println("Highest ="+l);
        System.out.println("Smallest ="+s);

    }

    public void convertToString(char[] a)
    {
        String b="";
        for(int i=0;i<a.length;i++)
        {
            b=b+a[i];
        }
        System.out.println(b);
    }

    public boolean checkIfCollinear()
    {
        boolean b=false;
        Scanner xa= new Scanner(System.in);
        Scanner xb= new Scanner(System.in);
        Scanner xc= new Scanner(System.in);
        Scanner ya= new Scanner(System.in);
        Scanner yb= new Scanner(System.in);
        Scanner yc= new Scanner(System.in);
        int x1=0,x2=0,x3=0,y1=0,y2=0,y3=0;
        int a;
        int sum1=0,sum2=0,sum3=0,sum4=0;

        for(int i=0;i<1;i++)
        {
            System.out.println("enter x1");
            x1=xa.nextInt();
            System.out.println("enter x2");
            x2=xb.nextInt();
            System.out.println("enter x3");
            x3=xc.nextInt();
            System.out.println("enter y1");
            y1=ya.nextInt();
            System.out.println("enter y2");
            y2=yb.nextInt();
            System.out.println("enter y3");
            y3=yc.nextInt();

        }

        sum1=y2-y1;
        sum2=x2-x1;
        sum3=y3-y2;
        sum4=x3-x2;
        float slope1=sum1/sum2;
        float slope2=sum3/sum4;
        if(slope1==slope2)
        {
            b=true;
        }

        return b;
    }

    public boolean checkForWord(String s,String w)
    {
        boolean b=false;
        s=s.trim();
        w=w.trim();
        String word="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(word.equals(w))
                {
                    b=true;
                    break;
                }
                else
                {
                    continue;
                }

            }
            else
            {
                word=word+s.charAt(i);
            }
        }

        return b;
    }

    public int[] mergeArray(int[] a1, int[] a2)
    {
        int a=0;
        int []array=new int[a1.length+a2.length];
        a=a1.length+a2.length;
        for(int i=0;i<a1.length;i++)
        {
            array[i]=a1[i];
            if(i==a1.length-1)
            {

                for(int k=0;k<a2.length;k++)
                {
                    i=i+1;
                    array[i]=a2[k];
                }

            }

        }
        return array;
    }

    public int[] array1()
    {
        int h=0;
        int[] a={4,9,10,32,45,4};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    h=a[j];
                    a[j]=a[j+1];
                    a[j+1]=h;
                }

            }

        }
        return a;

    }

    public int[] array2(int[] a)
    {
        int[] b=new int[a.length];

        int h=0;
        b[0]=a[0];
        try{
            for(int i=0;i<a.length;i++)
            {

                for(int j=0;j<a.length-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        h=a[j];
                        a[j]=a[j+1];
                        a[j+1]=h;
                    }
                }

            }
            b[a.length-1]=a[a.length-1];
            int p=0;
            for(int k=0;k<a.length-1;k++)
            {
                if(a[k]==a[k+1])
                {

                }
                else
                {
                    b[p]=a[k];
                    p++;
                }
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            return a;
        }
    }

    public void mt(int n)
    {
        String a="9";
      
        int b=1;
        
        char x ='M';
        Character ch=new Character(x);
        
        System.out.println(ch);
        
        
    }
}
 