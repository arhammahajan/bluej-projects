
public class pg103
{
    void question1(double price)
    {
        double discount;
        double totalamount;

        if(price>1000)
        {
            discount=0.35*price;
            totalamount=price-discount;
        }

        else
        {
            discount=0.1*price;
            totalamount=price-discount;
        }

        System.out.println("Discount = "+discount+"\n"+"Total amount paid = "+totalamount);
    }

    void question2(double tabla,double guitar,double camera)
    {
        double loss;
        double profit;
        double profitpercentage;
        double losspercentage;
        double cc=tabla+guitar;

        if(cc>camera)
        {
            loss=cc-camera;
            losspercentage=loss/(cc)*100;
            System.out.println("Loss percent= "+losspercentage+"%");
        }
        else
        {
            profit=camera-cc;
            profitpercentage=profit/(camera)*100;
            System.out.println("Profit  percent= "+profitpercentage+"%");
        }

    }

    void  question3(int  dayoftheweek)
    {
        switch(dayoftheweek)
        {
            case 0:
            {
                System.out.println("Sunday"+"\n"+"special coach will not come");
                break;
            }
            case 1:
            {
                System.out.println("Monday"+"\n"+"special coach will come");
                break;
            }
            case 2 :
            {
                System.out.println("Teusday "+"\n"+"special coach will not come");
                break;
            }
            case 3 :
            {
                System.out.println("Wednesday "+"\n"+"special coach will not come");
                break;
            }
            case 4 :
            {
                System.out.println("Thursday "+"\n"+"special coach will come");
                break;
            }
            case 5 :
            {
                System.out.println("Friday "+"\n"+"special coach will not come");
                break;
            }
            case 6 :
            {
                System.out.println("saturday "+"\n"+"special coach will not come");
                break;
            }
            
            default :
            {
                System.out.println("Enter your options properly");
            }
        }

    }

    void question4(int L,int M)
    {
        if(L%M==0)
        {
            if(M%2==0)
            {
                System.out.println("M is an even factor");
            }
            else
            {
                System.out.println("M is an odd factor");
            }
        }
        else
        {
            System.out.println("Not a factor");
        }
    }

    void question5()
    {
        
        
    }
}
