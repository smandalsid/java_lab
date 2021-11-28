import java.io.*;
import java.util.Scanner;

public class WriteObject {
    public static void main(String[] args) {
        int ar1[];
        int ar2[];
        int n1;
        int n2;
        System.out.println("Enter size and elements for two arrays:");
        System.out.println("Size of first array:");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        ar1=new int[n1];
        System.out.println("Enter elements of first array:");
        for(int i=0;i<n1;i++)
        {
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array:");
        n2=sc.nextInt();
        ar2=new int[n2];
        System.out.println("Enter elements of second array:");
        for(int i=0;i<n2;i++)
        {
            ar2[i]=sc.nextInt();
        }
        Test_Sorting obj = new Test_Sorting(n1, ar1, n2, ar2);
        try
        {
            FileOutputStream fos = new FileOutputStream("Activity_6.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            obj.ascending();
            obj.descending();
            oos.writeObject(obj);
            // fos.close();
            oos.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}