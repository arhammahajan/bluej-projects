

import java.lang.Math;
public class practicecodes
{
    void q1(int e )
    {
        for(int lv=1;lv<=10;lv++)
        {
            System.out.println(lv*e);
        }
    }

    void q2(int n)
    {
        switch(n)
        {
            case 1:
            {
                System.out.println("January");
                break;
            }
            case 2:
            {
                System.out.println("February");
                break;
            }
            case 3:
            {
                System.out.println("March");
                break;
            }
            case 4:
            {
                System.out.println("April");
                break;
            }
            case 5:
            {
                System.out.println("May");
                break;
            }
            case 6:
            {
                System.out.println("June");
                break;
            }
            case 7:
            {
                System.out.println("July");
                break;
            }
            case 8:
            {
                System.out.println("August");
                break;
            }
            case 9:
            {
                System.out.println("September");
                break;
            }
            case 10:
            {
                System.out.println("October");
                break;
            }
            case 11:
            {
                System.out.println("November");
                break;
            }
            case 12:
            {
                System.out.println("December");
                break;
            }
            default :
            {
                System.out.println("Please  enter a number between  1 and  12");
            }

        }

    }

    void  q3(double cp,double sp)
    {
        double gain;
        double  loss;
        double  gainpercentage;
        double  losspercentage;
        if(cp>sp)
        {

            loss=cp-sp;
            losspercentage=(loss*100)/cp;
            System.out.println("Loss% = "+losspercentage);
        }
        else if(sp>cp)
        {
            System.out.println(" profit");
            gain=sp-cp;
            gainpercentage=(gain*100)/cp;
            System.out.println("Gain% = "+gainpercentage);
        }
        else
        {
            System.out.println("No profit ,no loss");
        }
    }

    void  q4(int n1,int n2,int n3)
    {
        if(n1>n2&&n2>n3)
        {
            System.out.println("The largest no.= "+n1);
            System.out.println("The smallest  no.= "+n3);
        }
        if(n2>n3&&n3>n1)
        {
            System.out.println("The  largest no.= "+n2);
            System.out.println("The smallest  no.= "+n1);
        }
        else 
        {
            System.out.println("The largest no.="+n3);
            System.out.println("Smallest no.= "+n2);
        }

    }

    void  q5(char colour)
    {
        switch(colour)
        {
            case 'v':
            {
                System.out.println("violet");
                break;
            }
            case 'i':
            {
                System.out.println("idigo");
                break;
            }
            case 'b':
            {
                System.out.println("blue");
                break;
            }
            case 'g':
            {
                System.out.println("green");
                break;
            }
            case 'y':
            {
                System.out.println("yellow");
                break;
            }
            case 'o':
            {
                System.out.println("orange");
                break;
            }
            case 'r':
            {
                System.out.println("red");
                break;
            }
            default:
            {
                System.out.println("error");
            }
        }
    }

    void series(int n )
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }

    void Sqseries(int n )
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i*i;
        }
        System.out.println(sum);
    }

    void digcheck(int x )
    {
        int n=0;
        while(x>0)
        {
            n++;
            x=x/10;
        }
        System.out.println("the no. of  digits = "+n);
    }

    void evenOdd(int x)
    {
        if(x%2==0)
        {
            System.out.println("Even no.");
        }
        else
        {
            System.out.println("odd no.");
        }
    }

    void loopinloop(int n)
    {
        int sum=0,tsum=0,i,j;
        for(i=1;i<=n;i++)
        {
            tsum=0;
         
            for(j=1;j<=i;j++)
            {
                tsum=tsum+j;
            }
            sum=sum+tsum;
        }
        System.out.println("sum = "+sum);
    }
     void example()
    {
        System.out.println(Math.sqrt(Math.pow(4,2)+Math.pow(3,2)));
    }
     void example1()
    {
        int f=1;
        int k=5;
        do{
            f*=k;
            k--;
        }while(k>=1);
        System.out.println(f);
    }
         void example2()
    {
        int i=5;
     
        do{
            System.out.println(i);
            i++;
        }while(i<5);
        
    }
    
    void increment(double sal,int noy)
    {
        double rs=0;
        if(noy<5)
        {
            rs=rs+rs*0.05;
            System.out.println("increased salary= "+rs);
        }
        else if(noy<10&&noy>=5)
        {
            rs=rs+rs*0.1;
            System.out.println("increased salary= "+rs);
        }
        if(noy<20&&noy>=10)
        {
            rs=rs+rs*0.15;
            System.out.println("increased salary= "+rs);
        }
        if(noy>20)
        {
            rs=rs+rs*0.2;
            System.out.println("increased salary= "+rs);
        }
    }
}
