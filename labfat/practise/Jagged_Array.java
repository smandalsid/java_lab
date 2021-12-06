import java.util.Scanner;

public class Jagged_Array {
    public static void main(String[] args) {
        int n, i, x, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        n=sc.nextInt();
        String str[][]=new String[n][];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number of strings in row "+i+":");
            x=sc.nextInt();
            str[i]=new String[x];
        }
        System.out.println("Enter the strings:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<str[i].length;j++)
            {
                str[i][j]=sc.next();
            }
        }
        sc.close();


        for(i=0;i<n;i++)
        {
            for(j=0;j<str[i].length;j++)
            {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();
        }
    }
}