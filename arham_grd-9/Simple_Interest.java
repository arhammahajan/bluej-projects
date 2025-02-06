
public class Simple_Interest
{
    int principle;
    int rate;
    int time;

    //1a)
    public void getData(int p, int r, int t)
    {
        principle=p;
        rate=r;
        time=t;
        display();
        
    }
    //b)
    private void display()
    {
       
        System.out.println("Simple interest = "+calculate()+"\n"+"Ampunt = "+amount());
    }
    private double calculate()
    {
        
        return (principle*rate*time)/100;
        
    }
    //c)
   

    private double amount()
    {
        return principle+calculate();
    }

}
