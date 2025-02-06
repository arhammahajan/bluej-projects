
public class exam
{
    public static void q1c()
    {
        String s="cats".indexOf('s')+"rats".indexOf('s')+"cats"+"rats"+"cat".length()+"rat".length();                                                                                                               
        System.out.println(s);
        System.out.println("projector".indexOf("length".charAt(1)));
        String w="timtom"; 
        System.out.println(w.toUpperCase() + w);
    }

    public static void q2()
    {
        String pw="time25out";
        int x=Integer.parseInt(pw.substring(4,6))+pw.length(); 
        String  y = pw+pw.substring(4,6).startsWith(pw); 
        System.out.println(x +"\n"+y);
    }

    public static void vowelAsciitot(String word)
    {
        int tot=0;
        word=word.trim();
        String s=word.toLowerCase();
        for(int k=0;k<s.length();k++)
        {
            char a =s.charAt(k);
            if(a=='a' || a=='e' || a=='o' || a=='u'||a=='i')
            {
                int av=(int)a;
                tot=tot+av;
            }
            
        }
        System.out.println(tot);
        
    }
    
    public static String reverse(String s,String sampleword)
    {
        s=s.trim();
        String r="";
        for(int k=s.length()-1;k>=0;k--)
        {
            char a =s.charAt(k);
            r=r+a;
            
        }
        return r;
        System.out.println(sampleword.charAt(sampleword.length()-1));
    }
    
}