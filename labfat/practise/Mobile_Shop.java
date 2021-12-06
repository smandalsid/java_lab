import java.util.Scanner;

class Telephone {
    long mobileid;
    String modelname;
    String available;
    void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mobile id:");
        mobileid=sc.nextLong();
        System.out.println("Enter mobile name:");
        modelname=sc.next();
        System.out.println("Enter availble quantity:");
        available=sc.next();
        sc.close();
    }
    void display()
    {
        System.out.println("Mobile id: "+mobileid);
        System.out.println("Model name: "+modelname);
        System.out.println("Available quantity "+available);
    }
}

class Smart_Phone {
    long mobileid;
    boolean enabled_5G;
    boolean foldable;
    boolean dual_screen;
    void get()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mobile id: ");
        mobileid=sc.nextLong();
        System.out.println("Is the phone 5g enabled:");
        enabled_5G=sc.nextBoolean();
        System.out.println("Is the phone foldable:");
        foldable=sc.nextBoolean();
        System.out.println("Does the phone have dual screen:");
        dual_screen=sc.nextBoolean();
        sc.close();
    }
    void display()
    {
        System.out.println("Mobile id: "+mobileid);
        System.out.println("Enabled 5g: "+enabled_5G);
        System.out.println("Foldable: "+foldable);
        System.out.println("Dual screen: "+dual_screen);
    }
}

public class Mobile_Shop {
    public static void main(String[] args) {
        Telephone ar1[]=new Telephone[2];
        Smart_Phone ar2[]=new Smart_Phone[2];

        int i;
        for(i=0;i<2;i++)
        {
            ar1[i]=new Telephone();
            ar1[i].get();
        }
        for(i=0;i<2;i++)
        {
            ar2[i]=new Smart_Phone();
            ar2[i].get();
        }

        for(i=0;i<2;i++)
        {
            ar1[i].display();
        }
        
        for(i=0;i<2;i++)
        {
            ar2[i].display();
        }
    }
}
