
public class proto
{
    void loopcount()
    {
        int co=0;
        int c=5;
        do
        {
            co++;
            if(c%5==0 && c%3==0)break;
            System.out.println(c);
            c=c+5;
        }while(c>=0);
        System.out.println("runs "+co);
       
    }
    
}
