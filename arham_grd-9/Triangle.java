
public class Triangle
{
    public void triangle(int s1,int s2,int s3)
    {
        if((s1*s1)+(s2*s2)==(s3*s3) || (s2*s2)+(s3*s3)==(s1*s1) || (s3*s3)+(s1*s1)==(s2*s2))
        {
            System.out.println("Its a Right triangle");
        }
        
        
        else if(s1==s2 || s2==s3||s1==s3)
        {
            System.out.println("Its an Isosceles triangle");
            
        }
        
        else if(s2==s3&&s2==s1)
            {
                System.out.println("Its an equilateral");

            }
            else
            {

                System.out.println("Sacalene triangle");
            }
    }
}
