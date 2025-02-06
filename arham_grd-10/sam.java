import java.lang.*;
public class sam
{
    static void sam()
    {
        int p=43,q=36;
        p=2*p+2*q;
        q=2*p- --(q++);
        p=++ ++p -2*(-1)-q++;

        System.out.println(p+" "+q);

    }

    static void asciiCon(int n)
    {
        System.out.println((char)n);
    }
}