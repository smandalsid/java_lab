import Ascending.A_sort;
import Descending.D_sort;
import java.util.Scanner;

public class Test_Sorting implements A_sort, D_sort {
    @Override
    public void ascending(int n, int ar[]) {
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Array in ascending order:");
        for (int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
    @Override
    public void descending(int n, int ar[]) {
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("Array in descending order:");
        for (int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        Test_Sorting obj = new Test_Sorting();
        obj.ascending(n, ar);
        obj.descending(n, ar);
    }
}
