import java.util.Scanner;
import java.lang.*;

public class StringApp {

    void charat(String jagged_arr[][])
    {
        int pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position to get character:");
        pos=sc.nextInt();
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                if (pos>=q.length())
                {
                    System.out.println(q+": Index out of range");
                }
                else
                {
                    System.out.print(q+": ");
                    System.out.println(q.charAt(pos));
                }
            }
        }
    }

    void lengthofstr(String jagged_arr[][])
    {
        System.out.println("");
        for (String p[]:jagged_arr)
        {
            for ( String q: p)
            {
                System.out.println(q+": "+q.length());
            }
        }
    }

    void lastindexof(String jagged_arr[][])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter character or characters:");
        str=sc.next();
        
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                System.out.println(q+": "+q.lastIndexOf(str));
            }
        }
    }

    void indexof(String jagged_arr[][])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter character or character:");
        str=sc.next();
        
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                System.out.println(q+": "+q.indexOf(str));
            }
        }
    }

    void equalsto(String jagged_arr[][])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        str=sc.next();
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                if (q.equals(str))
                {
                    System.out.println(q+": "+q+" and "+str+" are equal");
                }
                else
                {
                    System.out.println(q+": "+q+" and "+str+" are not equal");
                }
            }
        }
    }
    
    void replacewith(String jagged_arr[][])
    {
        char a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to replace:");
        a=sc.next().charAt(0);
        System.out.println("Enter character to replace with:");
        b=sc.next().charAt(0);
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                System.out.println(q+": "+q.replace(a, b));
            }
        }
    }
    
    void endswith(String jagged_arr[][])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check:");
        str=sc.next();
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                System.out.println(q+": "+q.endsWith(str));
            }
        }
    }
    
    void startswith(String jagged_arr[][])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check:");
        str=sc.next();
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                System.out.println(q+": "+q.startsWith(str));
            }
        }
    }
   
    void hashcode(String jagged_arr[][])
    {
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                System.out.println(q+": "+q.hashCode());
            }
        }
    }
    
    void compareto(String jagged_arr[][])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to compare with:");
        str=sc.next();
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                if (q.compareTo(str)==0)
                {
                    System.out.println(q+": They are equal");
                }
                else if(q.compareTo(str)<0)
                {
                    System.out.println(q+": "+q+" is small");
                }
                else
                {
                    System.out.println(q+": "+str+" is small");
                }
            }
        }

    }

    void myreplace(String jagged_arr[][])
    {
        char a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to replace");
        a=sc.next().charAt(0);
        System.out.println("Enter character to replace with");
        b=sc.next().charAt(0);
        System.out.println("");
        for (String p[]:jagged_arr)
        {
            for (String q: p)
            {
                System.out.print(q+": ");
                for (int k=0;k<q.length();k++)
                {
                    if (q.charAt(k)!=a)
                    {
                        System.out.print(q.charAt(k));
                    }
                    else
                    {
                        System.out.print(b);
                    }
                }
                System.out.println("");
            }
        }

    }

    void myendswith(String jagged_arr[][])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check:");
        str=sc.next();
        int strsize=str.length();
        int temp=strsize;
        int flag;
        System.out.println("");
        for (String p[]:jagged_arr)
        {
            for (String q:p)
            {
                flag=1;
                temp=strsize;
                if (q.length()>strsize)
                {
                    for (int i=q.length()-1;i>q.length()-1-strsize;i--)
                    {
                        if (q.charAt(i)!=str.charAt(--temp))
                        {
                            flag=0;
                        }
                    }
                    if (flag==1)
                    {
                        System.out.println(q+": true");
                    }
                    else
                    {
                        System.out.println(q+": false");
                    }
                }
                else
                {
                    System.out.println(q+": false");
                }
            }
        }
    }

    void mystartswith(String jagged_arr[][])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check:");
        str=sc.next();
        int strsize=str.length();
        int temp=strsize;
        int flag;
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                flag=1;
                temp=0;
                if (q.length()>strsize)
                {
                    for (int i=0;i<strsize;i++)
                    {
                        if (q.charAt(i)!=str.charAt(temp++))
                        {
                            flag=0;
                        }
                    }
                    if (flag==1)
                    {
                        System.out.println(q+": true");
                    }
                    else
                    {
                        System.out.println(q+": false");
                    }
                }
                else
                {
                    System.out.println(q+": false");
                }
            }
        }
    }

    void myequals(String jagged_arr[][])
    {
        int flag=1;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to compare:");
        str=sc.next();
        int strsize=str.length();
        int pos;
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q:p)
            {
                flag=1;
                if (q.length()!=strsize)
                {
                    flag=0;
                }
                else
                {
                    pos=0;
                    while (pos<strsize && pos<q.length())
                    {
                        if (q.charAt(pos)!=str.charAt(pos))
                        {
                            flag=0;
                            break;
                        }
                        else
                        {
                            pos+=1;
                        }
                    }
                }
                if (flag==1)
                {
                    System.out.println(q+": "+q+" and "+str+" are equal");
                }
                else
                {
                    System.out.println(q+": "+q+" and "+str+" are not equal");
                }
            }
        }
    }

    void mylengthofstr(String jagged_arr[][])
    {
        int len=0;
        System.out.println("");
        for (String p[]: jagged_arr)
        {
            for (String q: p)
            {
                len=0;
                char strarr[]=q.toCharArray();
                for (char c: strarr)                
                {
                    len++;
                }
                System.out.println(q+": "+len);
            }
        }
    }

    void display(String jagged_arr[][])
    {
        System.out.println("\nJagged array: ");
        for (String p[]:jagged_arr)
        {
            for (String q:p)
            {
                System.out.print(q+" ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {

        int n,i,j,x;
        System.out.println("Enter the number of rows you want to enter:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt(); // to keep track how many columns every row of jagged array has

        String jagged_arr[][] = new String[n][]; // decide the number of rows the array will have
        int ar[] = new int[n];

        // e.g. of one jagged array
        // hi hello great -> first row with 3 columns
        // bye -> second row with 1 column
        // tata test -> with 2 columns

        for (i=0;i<n;i++)
        {
            System.out.println("How many strings/columns in row: "+(i+1));
            x=sc.nextInt(); // take the number of columns user wants in each row of jagged array
            jagged_arr[i] = new String[x]; // assign the number of columns each row will have
            ar[i]=x;
        }

        System.out.println("Enter the strings:");
        for (i=0;i<n;i++)
        {
            for (j=0;j<ar[i];j++)
            {
                jagged_arr[i][j]=sc.next(); // take input of the words
            }
        }

        
        StringApp obj = new StringApp();
        obj.display(jagged_arr);

        while(true)
        {
            System.out.println("");
            System.out.println("What operation do you want to perform?");
            System.out.println("1) Get character at specified index:");
            System.out.println("2) Get length of every string:");
            System.out.println("3) Get position of the last occurrence of specified character(s) in a string:");
            System.out.println("4) Get position of the first occurrence of specified character(s) in a string:");
            System.out.println("5) Check if two strings are equal:");
            System.out.println("6) Replace character of string with another:");
            System.out.println("7) Check if string ends with the character or characters:");
            System.out.println("8) Check if string starts with the character or characters:");
            System.out.println("9) Get the hashcode of string:");
            System.out.println("10) Compare two strings lexicographically:");
            System.out.println("11) Implementation of replace():");
            System.out.println("12) Implementation of endsWith():");
            System.out.println("13) Implementation of startsWith():");
            System.out.println("14) Implementation of equals():");
            System.out.println("15) Implementation of length():");
            System.out.println("16) Display the jagged array");
            System.out.println("17) Exit");
            x=sc.nextInt();
            switch(x) {
                case 1:
                    obj.charat(jagged_arr);
                    break;
                case 2:
                    obj.lengthofstr(jagged_arr);
                    break;
                case 3:
                    obj.lastindexof(jagged_arr);
                    break;
                case 4:
                    obj.indexof(jagged_arr);
                    break;
                case 5:
                    obj.equalsto(jagged_arr);
                    break;
                case 6:
                    obj.replacewith(jagged_arr);
                    break;
                case 7:
                    obj.endswith(jagged_arr);
                    break;
                case 8:
                    obj.startswith(jagged_arr);
                    break;
                case 9:
                    obj.hashcode(jagged_arr);
                    break;
                case 10:
                    obj.compareto(jagged_arr);
                    break;
                case 11:
                    obj.myreplace(jagged_arr);
                    break;
                case 12:
                    obj.myendswith(jagged_arr);
                    break;
                case 13:
                    obj.mystartswith(jagged_arr);
                    break;
                case 14:
                    obj.myequals(jagged_arr);
                    break;
                case 15:
                    obj.mylengthofstr(jagged_arr);
                    break;
                case 16:
                    obj.display(jagged_arr);
                    break;
                case 17:
                    System.out.println("Exiting the program, thank yoU!");
                    System.exit(0);
                default:
                    System.out.println("Wrong choice! Enter again:");
            }
        }
    }
}

// hello
// hi
// great
// bye
// tata
// test