import java.lang.Math;
public class Rectangle
{
    int length;
    int breadth;

    public void getData(int l,int b)
    {
        length=l;
        breadth=b;
    }

    public int area()
    {   
        return length*breadth;
    }

    public int perimeter()
    {
        return (2*length)+(2*breadth);
    }
    
    public double diagnol()
    {
        return Math.sqrt((breadth*breadth)+(length*length));
    }
    
    public void display()
    {
        System.out.println("Area = "+area()+"\n"+"Perimeter = "+perimeter()+"\n"+"Diagnol = "+diagnol());
    }
    

 
}
