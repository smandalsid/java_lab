import java.util.Scanner;

public class AscDesc {
public static void main(String[] args) {

Test_Ascending_Sort obj3 = new Test_Ascending_Sort();
Test_Descending_Sort obj4 = new Test_Descending_Sort();

obj3.get();
obj4.get();

obj3.sort(obj3.ar1);
obj3.sort(obj3.ar2);
obj3.sort(obj3.ar3);
obj4.sort(obj4.ar1);
obj4.sort(obj4.ar2);
obj4.sort(obj4.ar3);
}
}

class Ascending {
void sort(int ar[])
{
int i,j;
int temp;
for (i=0;i<ar.length;i++)
{
for (j=0;j<ar.length-i-1;j++)
{
if (ar[j]>ar[j+1])
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
void sort(String s[])
{
int i,j;
String temp;
for (i=0;i<s.length;i++)
{
for (j=0;j<s.length-1-i;j++)
{
if (s[j].compareTo(s[j+1])>0)
{
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
System.out.println("\nString array in ascending order:");
for (i=0;i<s.length;i++)
{
System.out.print(s[i]+" ");
}
System.out.println("");
}
void sort(double dar[])
{
int i,j;
double temp;
for (i=0;i<dar.length;i++)
{
for (j=0;j<dar.length-i-1;j++)
{
if (dar[j]>dar[j+1])
{
temp=dar[j];
dar[j]=dar[j+1];
dar[j+1]=temp;
}
}
}
System.out.println("\nDouble array in ascending order:");
for (i=0;i<dar.length;i++)
{
System.out.print(dar[i]+" ");
}
System.out.println("");
}
}

class Descending {
void sort(int ar[])
{
int i,j;
int temp;
for (i=0;i<ar.length;i++)
{
for (j=0;j<ar.length-i-1;j++)
{
if (ar[j]<ar[j+1])
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
void sort(String s[])
{
int i,j;
String temp;
for (i=0;i<s.length;i++)
{
for (j=0;j<s.length-1-i;j++)
{
if (s[j].compareTo(s[j+1])<0)
{
temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
System.out.println("\nString array in descending order:");
for (i=0;i<s.length;i++)
{
System.out.print(s[i]+" ");
}
System.out.println("");
}
void sort(double dar[])
{
int i,j;
double temp;
for (i=0;i<dar.length;i++)
{
for (j=0;j<dar.length-i-1;j++)
{
if (dar[j]<dar[j+1])
{
temp=dar[j];
dar[j]=dar[j+1];
dar[j+1]=temp;
}
}
}
System.out.println("\nDouble array in descending order:");
for (i=0;i<dar.length;i++)
{
System.out.print(dar[i]+" ");
}
System.out.println("");
}
}

class Test_Ascending_Sort extends Ascending {
int n1,n2,n3;
Scanner sc = new Scanner(System.in);
int ar1[];
String ar2[];
double ar3[];

void get()
{
int i;
System.out.println("Enter number of elements in integer array:");
n1=sc.nextInt();
ar1 = new int[n1];
System.out.println("Enter elements of integer array:");
for (i=0;i<n1;i++)
{
ar1[i]=sc.nextInt();
}
System.out.println("Enter number of elements in String array:");
n2=sc.nextInt();
ar2 = new String[n2];
System.out.println("Enter elements of string array:");
for (i=0;i<n2;i++)
{
ar2[i]=sc.next();
}
System.out.println("Enter number of elements in double array:");
n3=sc.nextInt();
ar3 = new double[n3];
System.out.println("Enter elements of double array:");
for (i=0;i<n3;i++)
{
ar3[i]=sc.nextDouble();
}
}
}

class Test_Descending_Sort extends Descending {
int n1,n2,n3;
Scanner sc = new Scanner(System.in);
int ar1[];
String ar2[];
double ar3[];

void get()
{
int i;
System.out.println("Enter number of elements in integer array:");
n1=sc.nextInt();
ar1 = new int[n1];
System.out.println("Enter elements of integer array:");
for (i=0;i<n1;i++)
{
ar1[i]=sc.nextInt();
}
System.out.println("Enter number of elements in String array:");
n2=sc.nextInt();
ar2= new String[n2];
System.out.println("Enter elements of string array:");
for (i=0;i<n2;i++)
{
ar2[i]=sc.next();
}
System.out.println("Enter number of elements in double array:");
n3=sc.nextInt();
ar3 = new double[n3];
System.out.println("Enter elements of double array:");
for (i=0;i<n3;i++)
{
ar3[i]=sc.nextDouble();
}
}
}
