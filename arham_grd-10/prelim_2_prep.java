import java.util.*;
public class prelim_2_prep
{
    public static void checkSpy(int n)
    {
        int p=1,s=0;
        String w="It is not a spy number";
        do
        {
            p=p*n%10;
            s=s+n%10;
            n=n/10;
        }while(n>0);
        if(s==p)
        {
            w="It is a spy number";
        }
        System.out.println(w);
    }

    static Scanner sc=new Scanner(System.in);

    public static void menu()
    {
        System.out.println("Which option do you choose \n1 or 2");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
            {
                pattern1();
                break;
            }
            case 2:
            {
                pattern2();
                break;
            }
            default:
            {
                System.out.println("Invalid choice");
            }
        }
    }

    private static void pattern1()
    {
        double x=2,s=0;
        for(int i=1;i<=19;i=i+2)
        {
            s=s+Math.pow(x,i);

        }
        for(int k=2;k<=20;k=k+2)
        {
            s=s-Math.pow(x,k);
        }
        System.out.println(s);
    }

    private static void pattern2()
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("1");
            }
            System.out.print(" ");
        }
    }

    public static void check(String str,char ch)
    {
        str=str.trim().toLowerCase();
        int cc=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                cc++; 
            }
        }
        System.out.println(cc);
    }

    public static void check(String s1)
    {
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' ||s1.charAt(i)=='e' ||s1.charAt(i)=='i' ||s1.charAt(i)=='o' ||s1.charAt(i)=='u')
            {
                System.out.println(s1.charAt(i)+" ");
            }
        }
    }

    public static void menu2()
    {
        System.out.println("Which option do you choose \n1 or 2");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:
            {
                triangle1();
                break;
            }
            case 2:
            {
                triangle2();
                break;
            }
            default:
            {
                System.out.println("Invalid choice");
            }
        }
    }

    private static void triangle1()
    {
        int cc=1;
        for(int i=1;i<=15;i++)
        {
            cc=cc+i;
            for(int k=i;k<cc;k++)
            {
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }

    private static void triangle2()
    {
        String s="ICSE";
        for(int i=0;i<s.length();i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(s.charAt(k));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void wordStats()
    {
        System.out.println("Please enter a word");
        String s=sc.nextLine(),ans="Invalid word",rw="";
        s=s.trim().toLowerCase();
        
        if(s.charAt(0)==s.charAt(s.length()-1))
        {
            ans="It is a special word";
            for(int i=s.length()-1;i>=0;i--)
            {
                rw=rw+s.charAt(i);
            }
            if(s.equals(rw))
            {
                ans="Its a palindrome";
            }
        }
        System.out.println(ans);
    }
    
    public static void sevenWonders()
    {
        System.out.println("Enter a country name");
        String s=sc.nextLine(),p="Sorry not found!";
        s=s.toUpperCase();
        String[] sevenw={"CHICKEN ITZA","CHRIST THE REDEEMER","TAJ MAHAL","GREAT WALL OF CHINA","MACHU PICHU","PETRA","COLOSSEUM"};
        String[] loc={"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
        for(int i=0;i<loc.length;i++)
        {
            if(s.equals(loc[i]))
            {
                p=sevenw[i];
                System.out.println(p);
                break;
            }
        }
        System.out.println(p);
        
    }
}
