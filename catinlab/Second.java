import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Chennai obj1=new Chennai();
        Bangalore obj2=new Bangalore();
        System.out.println(obj1.getStrength().strength);
        System.out.println(obj2.getStrength().strength);
    }
}

class MNC {
    int strength,workers,managers;
    MNC getStrength() {
        return this;
    }
}

class Chennai extends MNC {
    Chennai()
    {
        this(20,30);
    }
    Chennai(int workers, int managers)
    {
        this.workers=workers;
        this.managers=managers;
        this.strength=this.workers+this.managers;
    }
    Chennai getStrength()
    {
        return this;
    }
}

class Bangalore extends MNC {
    Bangalore()
    {
        this(10,20);
    }
    Bangalore(int workers,int managers)
    {
        this.workers=workers;
        this.managers=managers;
        this.strength=this.workers+this.managers;
    }
    Bangalore getStrength()
    {
        return this;
    }
}