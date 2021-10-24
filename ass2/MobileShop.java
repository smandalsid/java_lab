import java.util.Scanner;

public class MobileShop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); // create object of Scanner class
        int i;
        int n1; // to store the number of objects of Telephone class
        System.out.println("Enter number of objects of Telephone class:");
        n1=sc.nextInt();
        
        Telephone arr1[] = new Telephone[n1]; // n1 objects of Telephone class

        
        System.out.println("Enter input of "+n1+" objects of Telephone class:");
        
        for (i=0;i<n1;i++) // take input of the objects of Telephone class
        {
            System.out.println((i+1)+")");
            arr1[i] = new Telephone(); // allocating memory to each obejct of the array
            arr1[i].get();
        }
        
        System.out.println("Enter number of objects of Smart_Phone class:");
        int n2; // to store number of ojjects of Smart_Phone class
        n2=sc.nextInt();

        Smart_Phone arr2[] = new Smart_Phone[n2]; // n2 objects of Smart_Phone class

        System.out.println("Enter input of "+n2+" objects of Smart_Phone class:");
        
        for (i=0;i<n2;i++) // take input of the objects of Smart_Phoene class
        {
            System.out.println((i+1)+")");
            arr2[i] = new Smart_Phone(); // allocating memory to each object of the array
            arr2[i].get();
        }
        
        System.out.println("\nDetails of Telephones:");
        
        for (i=0;i<n1;i++) // calling display function for every object of Telephone class
        {
            System.out.println("\n"+(i+1)+")");
            arr1[i].display();
        }
        
        System.out.println("\nDetails of Smart phones:");
        
        for (i=0;i<n2;i++) // calling display function for every object of Smart_Phone class
        {
            System.out.println("\n"+(i+1)+")");
            arr2[i].display();
        }

    }
}

class Telephone {
    long mobile_id;
    String model_name;
    int available_quantity;

    void get() // function to take the input of the data members of the class
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile id:");
        mobile_id=sc.nextLong();
        System.out.println("Enter model name:");
        model_name=sc.next();
        System.out.println("Enter available quantity:");
        available_quantity=sc.nextInt();
    }

    void display() // function to display the data members of the class
    {
        System.out.println("Mobile id: "+mobile_id);
        System.out.println("Model name: "+model_name);
        System.out.println("Available quantity: "+available_quantity);
    }

}

class Smart_Phone {
    long mobile_id;
    boolean enabled_5G;
    boolean foldable;
    boolean dual_screen;

    void get() // function to get data of the data members of the class
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile id:");
        mobile_id = sc.nextLong();
        System.out.println("Is the mobile 5G enabled? (true/false)");
        enabled_5G = sc.nextBoolean();
        System.out.println("Is the mobile foldable? (true/false)");
        foldable=sc.nextBoolean();
        System.out.println("Is the mobile dual screen? (true/false)");
        dual_screen=sc.nextBoolean();
    }

    void display() // function to print the data of the data members of the class
    {
        System.out.println("Mobile id: "+mobile_id);
        System.out.println("Enabled 5G: "+enabled_5G);
        System.out.println("Foldable: "+foldable);
        System.out.println("Dual screen: "+dual_screen);
    }

}