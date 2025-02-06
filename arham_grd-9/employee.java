

public class employee
{
    int Basic_sal;
    double tax;
    double gross;
    public void storeValues(int bs, double tx)
    {
        Basic_sal=bs;
        tax=tx;
        
        
    }
    public void Calculate()
    {
        gross=Basic_sal-tax;
    }
    public void Display()
    {
        System.out.println("gross= "+gross);
    }
}
