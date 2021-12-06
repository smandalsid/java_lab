import java.util.Scanner;

class Ascending {
    void sort(int ar[])
    {
        int i,j, temp;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nInteger array in ascending order:");
        for (i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");

    }
    void sort(String ar[])
    {
        int i,j;
        String temp;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length-1-i;j++)
            {
                if(ar[j].compareTo(ar[j+1])>0)
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nInteger array in ascending order:");
        for (i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
    void sort(Double ar[])
    {
        int i,j;
        Double temp;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nInteger array in ascending order:");
        for (i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
}

class Descending {
    void sort(int ar[])
    {
        int i,j, temp;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nInteger array in descending order:");
        for (i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");

    }
    void sort(String ar[])
    {
        int i,j;
        String temp;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length-1-i;j++)
            {
                if(ar[j].compareTo(ar[j+1])<0)
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nInteger array in descending order:");
        for (i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
    void sort(Double ar[])
    {
        int i,j;
        Double temp;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar.length-1-i;j++)
            {
                if(ar[j]<ar[j+1])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println("\nInteger array in descending order:");
        for (i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println("");
    }
}

class Test_Ascending_Sort extends Ascending {

}

class Test_Descending_Sort extends Descending {

}

public class Sorting {
    public static void main(String[] args) {
        Test_Ascending_Sort obj1 = new Test_Ascending_Sort();
        Test_Descending_Sort obj2 = new Test_Descending_Sort();
        int ar1[]={2,4,1,3,5};
        String ar2[]={"Apple", "cat", "ball"};
        Double ar3[]={234.23,123.123,567.567};
        obj1.sort(ar1);
        obj1.sort(ar2);
        obj1.sort(ar3);
        obj2.sort(ar1);
        obj2.sort(ar2);
        obj2.sort(ar3);
    }
}
