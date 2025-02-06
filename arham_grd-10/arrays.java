import java.util.*;
public class arrays
{
    /*
     * 1. Write a program where user enter set of 10 integers number
    using Scanner class and program stores the information in an
    array.
     */
    Scanner is=new Scanner(System.in);
    Scanner ss=new Scanner(System.in);
    Scanner fs=new Scanner(System.in);
    Scanner ds=new Scanner(System.in);

    public void store()
    {
        double  sum=0;
        double median =0;
        double mean=0;
        int sv=0;
        int lv=0;
        int[] a=new int[10];
        for(int k=0;k<10;k++)
        {

            System.out.println("Enter 10 integers");
            a[k]=is.nextInt();

            sum=sum+a[k];
            if(k==9)
            {
                mean=sum/10;
                median =(a[4]+a[5])/2;
            }
            sv=a[0];
            lv=a[0];
            if(a[k]>lv)
            {
                lv=a[k];
            }
            else if(a[k]<lv)
            {

            }
            else
            {

            }
            if(sv>a[k])
            {
                sv=a[k];
            }
            else if (sv<a[k])
            {

            }
            else
            {

            }
        }

        System.out.println("Largest "+lv+" Smallest "+sv+" Mean "+mean+" Median "+median+"    "+sum);
    }

    /*3. Write a program where user enter set of 10 integers number
    using Scanner class and program find:
    (a) Largest value
    (b) 

    Smallest value
    (c) 

    Mean values
    (d) 

    Sorting values
    (e) Median value
     */

    /*
     * 4. Write a program where user enters 10 double numbers from
    the keyboard, program stores the information in an array. The
    program accepts a number from the user and search its index
    in the array.
     */

    public void take()
    {
        double[] a=new double[5];
        int n;

        for(int k=0;k<5;k++)
        {
            System.out.println("Enter 5 integers");
            a[k]=ds.nextDouble();

        }

        System.out.println("Enter number to be searched");
        n=is.nextInt();
        for(int k=0;k<5;k++)
        {
            if(n==a[k])
            {
                System.out.println("position is "+(k+1));
            }
        }
    }

    public void combineArray()
    {
        int n=0;
        double[] a=new double[5];
        double[] b=new double[5];
        double[] c=new double[10];
        for(int k=0;k<5;k++)
        {
            System.out.println("Enter 5 integers");
            a[k]=ds.nextDouble();

        }
        for(int k=0;k<5;k++)
        {
            System.out.println("Enter next 5 integers");
            b[k]=ds.nextDouble();

        }
        for(int k=0;k<5;k++)
        {
            c[k]=a[k];
        }
        for(int k=6;k<10;k++)
        {

            c[k]=b[k-5];

        }

        System.out.println("Enter number to be searched");
        n=is.nextInt();
        for(int k=0;k<10;k++)
        {

            if(n==c[k])
            {
                System.out.println(k+1);
            }
        }
    }

    /*
     * 6. Write a program where user enter marks and frequency of 10
    students, the program calculates:
    (a) Sum of frequency
    (b) Average marks.
     */
    public void average()
    {
        int []frequency=new int[5];
        double []marks=new double[5];
        int sum=0;
        double sum1=0;
        double average =0;
        for(int k=0;k<5;k++)
        {
            System.out.println("Enter the frequency");
            frequency[k]=is.nextInt();
            System.out.println("Enter the marks");
            marks[k]=ds.nextDouble();
            sum=sum+frequency[k];
            sum1=sum1+(marks[k]*frequency[k]);
            if(k==4)
            {
                average=sum1/sum;

            }

        }
        System.out.println("Sum = "+sum+"\n"+"Average = "+average);
    }

    /*
     * 8. Write a program where user enters 20 characters numbers,
    letters and special characters from the user and stores them in
    an array. Write program to
    (a) Convert these characters in upper case
    (b) Splits the array into character array, special elements
    (c) Numbers
     */
    void split(char[] a)
    {
        char[] sc=new char[5];
        char[] n=new char[5];
        char[] al=new char[5];
        if(a.length==5)
        {
            for(int k=0;k<5;k++)
            {
                for(char f='A';f<='Z';f++)
                {
                    for(int p=0;p<9;k++)
                    {

                        if(a[k]==p)
                        {
                            n[k]=a[k];
                        }
                        else if(a[k]==f)
                        {
                            al[k]=a[k];
                        }
                        else
                        {
                            sc[k]=a[k];
                        }
                    }

                }
            }
        }
    }
}
