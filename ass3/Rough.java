import java.util.Scanner;
class Ascending {

    void sorting(int ia[])
    {
    int i,j,t;
    for (i=0;i<ia.length;i++)
    {
    for (j=0;j<ia.length-i-1;j++)
    {
    if (ia[j]>ia[j+1])
    {
    t=ia[j];
    ia[j]=ia[j+1];
    ia[j+1]=t;
    }
    }
    }
    System.out.println("\nInteger array in ascending order is: ");
    for (i=0;i<ia.length;i++)
    {
    System.out.print(ia[i]+"\t");
    }
    System.out.println("\n");
    }


    void sorting(String sa[])
    {
    int i,j,m;
    String t;
    m=sa.length;
    for (i=0;i<m;i++)
    {
    for (j=0;j<m-1-i;j++)
    {
    if (sa[j].compareTo(sa[j+1])>0)
    {
    t=sa[j];
    sa[j]=sa[j+1];
    sa[j+1]=t;
    }
    }
    }
    System.out.println("\nString array in ascending order is: ");
    for (i=0;i<m;i++)
    {
    System.out.print(sa[i]+"\t");
    }
    System.out.println("\n");
    }


    void sorting(double da[])
    {
    for (int i = 1; i < da.length; i++) 
    { 
    double nti = da[i]; 
    int ci = i; 
    while (ci > 0 && da[ci - 1] > nti) 
    { 
    da[ci] = da[ci - 1];
    ci--;
    }
    da[ci] = nti;
    }
    System.out.println("\nDouble array in ascending order:");
    for (int i=0;i<da.length;i++)
    {
    System.out.print(da[i]+"\t");
    }
    System.out.println("\n");
    }
}
class Teest_Ascending_Sort extends Ascending{
    int a,b,c,i, array1[];
    String array2[];
    double array3[];
    void getinp1(){
        Scanner get =new Scanner(System.in);
        System.out.println("Enter no. of elements in integer array: ");
        a=get.nextInt();
        array1 = new int[a];
        System.out.println("Enter integer array elements:");
        for (i=0;i<a;i++)
        {
        array1[i]=get.nextInt();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter number of elements in String array: ");
        b=get.nextInt();
        array2 = new String[b];
        System.out.println("Enter String array elements:");
        for (i=0;i<b;i++)
        {
        array2[i]=get.next();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter number of elements in double array:");
        c=get.nextInt();
        array3 = new double[c];
        System.out.println("Enter double array elements:");
        for (i=0;i<c;i++)
        {
        array3[i]=get.nextDouble();
        }
    }
}

class Descending {

    void sorting(int ia[])
    {
    int i,j;
    int t;
    for (i=0;i<ia.length;i++)
    {
    for (j=0;j<ia.length-i-1;j++)
    {
    if (ia[j]<ia[j+1])
    {
    t=ia[j];
    ia[j]=ia[j+1];
    ia[j+1]=t;
    }
    }
    }
    System.out.println("\nInteger array in descending order is: ");
    for (i=0;i<ia.length;i++)
    {
    System.out.print(ia[i]+"\t");
    }
    System.out.println("\n");
    }


    void sorting(String sa[])
    {
    int i,j;
    String t;
    for(i=0;i<sa.length;i++)
    {
    for(j=0;j<sa.length-1-i;j++)
    {
    if(sa[j].compareTo(sa[j+1])<0)
    {
    t=sa[j];
    sa[j]=sa[j+1];
    sa[j+1]=t;
    }
    }
    }
    System.out.println("\nString array in descending order is: ");
    for (i=0;i<sa.length;i++)
    {
    System.out.print(sa[i]+"\t");
    }
    System.out.println("\n");
    }


    void sorting(double da[])
    {
    int i,j;
    int n = da.length;
    for(i = 1; i < n; i++) 
    {
    double k = da[i];
    j = i - 1;
    while(j >= 0 && da[j] < k) 
    {
    da[j+1] = da[j];
    j--;
    }
    da[j+1] = k;
    }
    System.out.println("\nDouble array in descending order is: ");
    for (i=0;i<da.length;i++)
    {
    System.out.print(da[i]+"\t");
    }
    System.out.println("\n");
    }
}
class Teest_Descending_Sort extends Descending{
    int a,b,c,i, array1[];
    String array2[];
    double array3[];
    void getinp1(){
        Scanner get =new Scanner(System.in);
        System.out.println("Enter no. of elements in integer array: ");
        a=get.nextInt();
        array1 = new int[a];
        System.out.println("Enter integer array elements:");
        for (i=0;i<a;i++)
        {
        array1[i]=get.nextInt();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter number of elements in String array: ");
        b=get.nextInt();
        array2 = new String[b];
        System.out.println("Enter String array elements:");
        for (i=0;i<b;i++)
        {
        array2[i]=get.next();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter number of elements in double array:");
        c=get.nextInt();
        array3 = new double[c];
        System.out.println("Enter double array elements:");
        for (i=0;i<c;i++)
        {
        array3[i]=get.nextDouble();
        }
    }
}

public class a3b {
public static void main(String[] args) 
{
int a,b,c,i;
Ascending x = new Ascending();
Descending y = new Descending();
Scanner get =new Scanner(System.in);
System.out.println("Enter no. of elements in integer array: ");
a=get.nextInt();
int array1[] = new int[a];
System.out.println("Enter integer array elements:");
for (i=0;i<a;i++)
{
array1[i]=get.nextInt();
}
x.sorting(array1);
y.sorting(array1);
System.out.println("--------------------------------------------------------------------------------------------------------------");
System.out.println("Enter number of elements in String array: ");
b=get.nextInt();
String array2[] = new String[b];
System.out.println("Enter String array elements:");
for (i=0;i<b;i++)
{
array2[i]=get.next();
}
x.sorting(array2);
y.sorting(array2);
System.out.println("--------------------------------------------------------------------------------------------------------------");
System.out.println("Enter number of elements in double array:");
c=get.nextInt();
double array3[] = new double[c];
System.out.println("Enter double array elements:");
for (i=0;i<c;i++)
{
array3[i]=get.nextDouble();
}
x.sorting(array3);
y.sorting(array3);

// for 3b
Teest_Ascending_Sort x1 = new Teest_Ascending_Sort();
x1.getinp1();
x1.sorting(x1.array1);
x1.sorting(x1.array2);
x1.sorting(x1.array3);
Teest_Descending_Sort y1 = new Teest_Descending_Sort();
y1.getinp1();
y1.sorting(y1.array1);
y1.sorting(y1.array2);
y1.sorting(y1.array3);
}
}