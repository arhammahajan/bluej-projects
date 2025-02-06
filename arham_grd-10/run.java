import java.util.*;
public class run
{
    static Scanner sc=new Scanner(System.in);
    static void userChoice()
    {
        
        System.out.println("Which program u want to run");
        System.out.println("Digits or Pattern");
        String ch=sc.nextLine();
        ch=ch.toLowerCase();
        if(ch.equals("digits"))
        {
            System.out.println("Enter a number of choice");
            int n=sc.nextInt();
            digits(n);
        }
        else if(ch.equals("pattern"))
        {
            System.out.println("Enter a letter of choice");
            String c=sc.nextLine();
            c=c.toLowerCase().trim();
            char b=c.charAt(0);
            pattern(b);
        }
    }
    static void digits(int a )
    {
        System.out.println("Digits are :");
        while(a>0)
        {
            System.out.println(a%10);
            a=a/10;
        }
    }
    
    static void pattern(char a)
    {
        for(char i='a';i<=a;i++)
        {
            for(char b='a';b<=i;b++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}


