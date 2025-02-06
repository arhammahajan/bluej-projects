
public class at3
{
    public void createArrays(int n)
    {
        int[] nos={27,33,55,94,56,43,90,12,54,76};
        String[] words={"apple","orange","binod","yemen","raju","pinku","ramesh","jojo","ganesh gaitonde","ursola"};
        searchInArray(nos,words,n);
    }

    private void searchInArray(int[] na,String[] sa, int n)
    {
        for(int p=0;p<na.length;p++)
        {
            if(na[p]==n)
            {
                System.out.println(na[p]+" Was found at position "+(p+1)+" and the corresponding string is "+sa[p]);
            }
        }
    }

}
