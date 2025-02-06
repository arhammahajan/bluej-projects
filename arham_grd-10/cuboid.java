

public class cuboid
{
    int r=0,h=0;
    double l=0;
    double v=0,tsa=0,csa=0;
    double pi=3.14;
    cuboid(int r,int h,double l)
    {
        this.r=r;
        this.h=h;
        this.l=l;
    }
    protected void show()
    {
        System.out.println("Tsa = "+tsa());
        System.out.println("Volume = "+v());
        System.out.println("Csa = "+csa());
    }
    private double tsa()
    {
        tsa=(pi*r*r)+(pi*r*l);
        return tsa;
    }
    private double csa()
    {
        csa=(pi*r*l);
        return csa;
    }
    private double v()
    {
        v=(pi*r*r*h)/3;
        return v;
    }
}
