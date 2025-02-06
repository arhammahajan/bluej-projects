import java.util.Scanner;
public class rtx3090
{

    public static void DuaLipa()
    {
        System.out.println("enter a");
        System.out.println("enter b");
        System.out.println("enter c");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double r1=0,r2=0;
        r1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        r2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        System.out.println(r1+"\n"+r2);
    }
}
