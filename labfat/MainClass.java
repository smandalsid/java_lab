import java.nio.file.DirectoryStream.Filter;
import java.util.Scanner;
import java.io.*;

interface Filtering { // WILL HELP TO IMPLEMENT MULTIPLE INTERFACE
    abstract void filterarray();
}

interface Findinglength { // WILL HELP TO IMPLEMENT MULTIPLE INTERFACE
    abstract void getlength();
}

public class MainClass implements Filtering, Findinglength{ // IMPLEMENTING MULTIPLPE INHERITANCE USING INTERFACES

    static int Filtered_Array_Len[]; // STATIC MEMBER FUNCTION
    static int inputarraysize=10; // STATIC MEMBER FUNCTION
    static int filteredarraysize; // STATIC MEMBER FUNCTION
    static String Input_Array[]=new String[inputarraysize]; // STATIC MEMBER FUNCTION
    static String Filtered_Array[]; // static member function
    
    void display()
    {
        System.out.println("\nThe strings and their lengths are:\n");
        for(int i=0;i<filteredarraysize;i++)
        {
            System.out.println(Filtered_Array[i] +"  "+Filtered_Array_Len[i]);
        }
        System.out.println();
    }

    void initialise() // OVERLOADED METHOD
    {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Enter 10 Strings:");
        for(int i=0;i<10;i++)
        {
            str=sc.next();
            int flag=0;
            for(int j=0;j<str.length();j++)
            {
                if(!Character.isLetter(str.charAt(j)) && !Character.isDigit(str.charAt(j)) && !Character.isWhitespace(str.charAt(j)))
                {
                    System.out.println("This string has special character, please enter this string again");
                    i--;
                    flag=1;
                    break;
                }
            }
            if(flag==0)        
            {
                Input_Array[i]=str;
            }
        }
        inputarraysize=10;
    }

    void initialise(int a) // OVERLOADED METHOD
    {
        filteredarraysize=a;
        Filtered_Array=new String[filteredarraysize];
        Filtered_Array_Len= new int[filteredarraysize];
    }

    public void filterarray() // filter the input strings
    {
        int count=0;
        for (int i=0;i<inputarraysize;i++)
        {
            if(Input_Array[i].contains("A") || Input_Array[i].contains("E") || Input_Array[i].contains("I") || Input_Array[i].contains("O") || Input_Array[i].contains("U") || Input_Array[i].contains("a") || Input_Array[i].contains("e") || Input_Array[i].contains("i") || Input_Array[i].contains("o") || Input_Array[i].contains("u"))
            {
                count++;
            }
        }
        initialise(count);
        count=-1;
        for (int i=0;i<inputarraysize;i++)
        {
            if(Input_Array[i].contains("A") || Input_Array[i].contains("E") || Input_Array[i].contains("I") || Input_Array[i].contains("O") || Input_Array[i].contains("U") || Input_Array[i].contains("a") || Input_Array[i].contains("e") || Input_Array[i].contains("i") || Input_Array[i].contains("o") || Input_Array[i].contains("u"))
            {
                Filtered_Array[++count]=Input_Array[i];
            }
        }
    }

    public void getlength() // get the lengths of the filtered strings
    {
        for(int i=0;i<filteredarraysize;i++)
        {
            Filtered_Array_Len[i]=Filtered_Array[i].length();
        }
    }

    public static void main(String[] args) {
        int i;
        Scanner sc= new Scanner(System.in);
        MainClass obj = new MainClass();
        obj.initialise(); // take the inputs
        obj.filterarray(); // filter the array
        obj.getlength(); // store the lengths
        obj.display(); // display the ouput

        try
        {
            for(i=0;i<filteredarraysize;i++) // WRITING THE LENGHTS IN Filtered_Array_Len.txt file
            {
                BufferedWriter out = new BufferedWriter(new FileWriter("Filtered_Array_Len.txt"));
                out.write(Filtered_Array_Len[i]);
                out.close();
            }
            System.out.println("wrote the lengths in Filtered_Array_Len.txt file");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            BufferedReader in = new BufferedReader(new FileReader("Filtered_Array_Len.txt"));
            String mystring;
            while ((mystring = in.readLine()) != null) {
                System.out.println(mystring);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
