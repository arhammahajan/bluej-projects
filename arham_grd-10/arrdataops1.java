
public class arrdataops1
{
    String firstnames[]={"Claire" ,"bhola","raju","binod", "Caroline"," Steven" , "Molly" , "James" , "James" , "Jennifer" , "Sophie" , "Lillian" , "Tracey" , "Donna" , "Ian" , "Richard" , "Christopher" , "Leonard" , "Amy" , "Kimberly" , "Luke" , "Brandon" , "Leonard" , "Amanda" , "Oliver" , "Julian" , "Alan" , "Victoria" , "Christopher" , "Bernadette" , "Nathan" , "Carol" , "Frank" , "Cameron" , "Jason" , "Victor" , "Joshua" , "Christian" , "Blake" , "Mary" , "Karen" , "Mary" , "Mary" , "Amanda" , "Thomas" , "Zoe" , "Jane" };
    int[] age ={5,8,13,78,45,32,76,56,14,55,22,15,17,80,33,23,16,18,95,43,37,55,16,17,43,12,62,16,4,2,51,43,42,26,17,26,14,16,32,53,42,16,53,2,42,66,75};

    char[] gender={'f', 'f', 'm', 'f', 'm', 'm', 'f', 'f', 'f', 'f', 'f', 'm', 'm', 'm', 'm', 'f', 'f', 'm', 'm', 'm', 'f', 'm', 'm', 'm', 'f', 'm', 'f', 'm', 'f', 'm', 'f', 'm', 'm', 'm', 'm', 'm', 'f', 'f', 'f', 'f', 'f', 'm', 'f', 'f', 'f', 'm', 'f'};
    public boolean checkArrayLength()
    {
        boolean b=false;
        if(firstnames.length==age.length && age.length==gender.length)
        {
            b=true;
        }
        System.out.println(firstnames.length);
        System.out.println(age.length);
        System.out.println(gender.length);
        return b;
    }

    public void displayAsPerGender(char gv)
    {
        int count =0;
        if(gv=='m' || gv=='f')
        {
            for(int i =0;i<gender.length;i++)
            {
                if(gender[i]==gv)
                {

                    System.out.println(firstnames[i]);
                    count++;
                }

            }
            System.out.println(count);
        }
        else
        {
            System.out.println("enter a valid letter");
        }
    }

    public void displaySeniorCitizenNames()
    {
        int count=0;
        for(int i=0;i<age.length;i++)
        {
            if(age[i]>=65)

            {
                System.out.println(firstnames[i]);
                count ++;
            }
        }
        System.out.println(count);
    }

    public void displaySeniorCitizenNames(char gv)
    {
        int count=0;
        if(gv=='m' || gv=='f')
        {
            for(int i=0;i<age.length;i++)
            {
                if(age[i]>=65  && gender[i]==gv)

                {
                    System.out.println(firstnames[i]+" "+age[i]);

                    count ++;
                }
            }
            System.out.println(count);
        }
        else
        {
            System.out.println("enter m or f");
        }
    }
    
    void displayAllDetails(char startalpha)
    {
        for(int i=0;i<age.length;i++)
        {
            if(startalpha==(firstnames[i].charAt(0)))
            {
                System.out.println(firstnames[i]+age[i]+gender[i]);
            }
        }
    }

}