
public class Bill
{
    double discount;
    double finalprice;
    void makeBill(double MP)
    {
        if(MP<1000)
        {

            discount =(0.1*MP);
            finalprice=MP-discount;
            System.out.print("Discount "+"    "+"Final Price"+"\n"+" "+"10%"+"          "+finalprice);

        }
        else if(MP>1000&&MP<5000)
        {
            discount =(0.2*MP);
            finalprice=MP-discount;

            System.out.print("Discount "+"    "+"Final Price"+"\n"+" "+"20%"+"          "+finalprice);

        }
        else if(MP>5000)
        {
            discount=(0.3*MP);
            finalprice=(MP-discount);
            System.out.print("Discount "+"    "+"Final Price"+"\n"+" "+"30%"+"          "+finalprice);
        }
        else
        {
            System.out.println("Error");
        }
    }
}
