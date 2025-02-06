
public class arrayops3
{
    String[] students={"Brandon" , "Leonard" , "Amanda" , "Oliver" , "Julian" , "Alan" , "Victoria" , "Christopher" , "Bernadette" , "Nathan" ,"Carol" , "Frank" , "Cameron" , "Jason" , "Victor" };
    int[] languages     =   {44,67,55,89,98,90,99,66,45,43,65,76,44,65,55};
    int[] humanities    =   {98,90,99,66,55,89,94,74,65,55,66,45,43,55,89};
    int[] scimath       =   {77,45,98,90,67,45,67,77,33,89,98,43,65,54,66};

    //create a new array which holds the total marks of all students
    //create a new array andfill it up with  the total marks of all students
    int[] totalMarks=new int[15];
    public void fillArray()
    {
        for(int l=0;l<students.length;l++)

        {
            totalMarks[l]=languages[l]+humanities[l]+scimath[l];

        }
        displayArray(totalMarks);
    }

    public void displayArray(int [] array)
    {
        for(int k=0;k<totalMarks.length;k++)
        {
            System.out.print(array[k]+" ");

        }
        System.out.println();
    }

    //write a method to display contents of all arrays

    public void displayAllArrays()
    {
        System.out.print("languages ");
        displayArray(languages);
        System.out.print("humanities ");
        displayArray(humanities);
        System.out.print("Science and maths ");
        displayArray(scimath);
    }

    //display the name of the student who has the highest marks in languages

    public void displayLanguageHighest()
    {
        int h=0;
        for(int k=0;k<languages.length;k++)
        {
            h=languages[k];
            if(k<languages.length-(1))
            {
                if(languages[k+1]>h)
                {
                    h=languages[k+1];
                }
                else
                {
                }
            }
            else
            {
            }
        }
        System.out.println(h);
    }
    
    public void arrayMethod(int[] array)
    {
        double sum=0;
        double av=0;
        int sv=array[0];
        int lv=array[0];
        int slsum=0;
        double slav=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
            
            if(array[i]>lv)
            {
                lv=array[i];
            }
            else if(array[i]<lv)
            {
                sv=array[i];
            }
        }
        slsum=lv+sv;
        slav=slsum/2.0;
        av=sum/array.length;
        System.out.println("Largest "+lv);
        System.out.println("Smallest "+sv);
        System.out.println("Average "+av);
        System.out.println("Sum of largest and smallest "+slsum);
        System.out.println("Average of largest and smallest "+slav);
    }
}
