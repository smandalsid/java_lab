import Descending.D_sort;
import Ascending.A_sort;
import java.util.Scanner;

public class Test_Sorting implements A_sort, D_sort{
    @Override
    public void ascending()
    {
        int ar[]={2,4,1,3,5};
        int temp;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        System.out.print(ar[i]+" ");
        System.out.println("");
    }
    @Override
    public void descending()
    {
        int ar[]={2,4,1,3,5};
        int temp;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4-i;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        System.out.print(ar[i]+" ");
        System.out.println("");
    }
    public static void main(String[] args) {
        Test_Sorting obj = new Test_Sorting();
        obj.ascending();
        obj.descending();
    }
}
