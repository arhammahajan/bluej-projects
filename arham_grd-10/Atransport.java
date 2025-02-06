import java.util.Scanner;
public class Atransport
{
    Scanner sc=new Scanner(System.in);
    String name="";
    int w=0;
    double charge=0;
    void accept()
    {
        System.out.println("Please enter your name");
        name=sc.nextLine();
        System.out.println("Please enter the weight(in Kg) of the package");
        w=sc.nextInt();
    }
    void calculate()
    {
        if(w<=10)
        {
            charge=w*25;
        }
        else if(w>10 && w<=30)
        {
            charge=w*20;
        }
        else if(w>30)
        {
            charge=w*10;
        }
        charge=charge-0.5*charge;
    }
    void print()
    {
        System.out.println("Name\tWeight\tBill Amount");
        System.out.println(name+"\t"+w+"\t"+charge);
    }
}
