import java.io.*;

public class Test {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("Activity_6.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Test_Sorting obj = new Test_Sorting();
            // obj.ascending();
            // obj.descending();
            obj=(Test_Sorting)ois.readObject();
            System.out.println("Array 1 in ascending order:");
            for(int i:obj.ar1)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
            System.out.println("Array 2 in descending order:");
            for(int i:obj.ar2)
            {
                System.out.print(i+" ");
            }
            System.out.println("");            

            ois.close();
            fis.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
