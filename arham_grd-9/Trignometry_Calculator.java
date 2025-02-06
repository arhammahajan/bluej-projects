
public class Trignometry_Calculator
{
    void calculator(float p,float h,float b,char angle)
    {
        float sin;
        float cosec;
        float cos;
        float sec;
        float tan;
        float cot;
        
        sin=p/h;
        System.out.println("sine "+angle+" = "+sin);
        
        cosec=h/p;
        System.out.println("cosecant "+angle+" = "+cosec);
        
        cos=b/h;
        System.out.println("cosine "+angle+" = "+cos);
        
        sec=h/b;
        System.out.println("secant "+angle+" = "+sec);
        
        tan=p/b;
        System.out.println("tangent "+angle+" = "+sec);
        
        cot=b/h;
        System.out.println("cotangent" +angle+" = "+cot);
    }
}
