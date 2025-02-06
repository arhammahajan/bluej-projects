
public class cbyR
{
    int a,b;;
    public cbyR()
    {
        a=10;
        b=15;
    }
    public void cal(cbyR obj)
    {
        int temp=obj.a;
        obj.a=obj.b;
        obj.b=temp;
    }
    public void print()
    {
        System.out.println("a= "+a+" b= "+b);
    }
    void main()
    {
        cbyR obj=new cbyR();
        obj.print();
        cal(obj);
        obj.print();
    }
}
