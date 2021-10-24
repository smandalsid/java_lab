// import java.util.Scanner;
// public class First {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         int i,j;
//         int ar[] = new int[n];
//         for (i=0;i<n;i++)
//         {
//             ar[i]=sc.nextInt();
//         }
//         int temp;
//         int nar[]=new int[n];
//         int pos=0;
//         int flag=1;
//         for (i=0;i<n;i++)
//         {
//             temp=ar[i];
//             while (temp>0)
//             {
//                 if ((temp%10)%2!=0)
//                 {
//                     flag=0;
//                 }
//                 temp=temp/10;
//             }
//             if (flag==1)
//             {
//                 nar[pos++]=ar[i];
//             }
//             flag=1;
//         }
//         for (i=0;i<pos;i++)
//         {
//             for (j=0;j<pos-1-i;j++)
//             {
//                 if (nar[j]>nar[j+1])
//                 {
//                     temp=nar[j];
//                     nar[j]=nar[j+1];
//                     nar[j+1]=temp;
//                 }
//             }
//         }
//         for (i=0;i<pos;i++)
//         {
//             System.out.println(nar[i]);
//         }
//     }
// }

import java.util.Scanner;
public class First {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int i,j;
        int ar[] = new int[n];
        for (i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int temp;
        int nar[]=new int[n];
        int pos=0;
        int flag=1;
        for (i=0;i<n;i++)
        {
            temp=ar[i];
            while (temp>0)
            {
                if ((temp%10)==0)
                {
                    flag=0;
                }
                temp=temp/10;
            }
            if (flag==1)
            {
                nar[pos++]=ar[i];
            }
            flag=1;
        }
        for (i=0;i<pos;i++)
        {
            for (j=0;j<pos-1-i;j++)
            {
                if (nar[j]<nar[j+1])
                {
                    temp=nar[j];
                    nar[j]=nar[j+1];
                    nar[j+1]=temp;
                }
            }
        }
        for (i=0;i<pos;i++)
        {
            System.out.println(nar[i]);
        }
    }
}