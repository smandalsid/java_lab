import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class Armstrong {
    int checkarmstrong(int n)
    {
        int temp;
        temp=n;
        int flag=0, count=0, tot=0;
        while(temp>0)
        {
            count+=1;
            temp=temp/10;
        }
        temp=n;
        while(temp>0)
        {
            tot+=Math.pow(temp%10, count);
            temp=temp/10;
        }
        if(tot==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class Divisible {
    int checkdivisible(int n)
    {
        if(n%7==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

public class Numbers {
    public static void main(String[] args) {
        try
        {
            FileInputStream fis = new FileInputStream("numbers.txt");
            Scanner sc = new Scanner(fis);
            Divisible obj1 = new Divisible();
            Armstrong obj2 = new Armstrong();
            while(sc.hasNextInt())
            {
                
                // ****************** THREAD 1 ******************

                Thread t1 = new Thread() {
                    public void run()
                    {
                        int n;
                        n=sc.nextInt();
                        if(obj1.checkdivisible(n)==1)
                        {
                            System.out.println(n+" is divisible by 7");

                            // ****************** THREAD 2 ******************

                            Thread t2 = new Thread() {
                                public void run()
                                {
                                    if(obj2.checkarmstrong(n)==1)
                                    {
                                        System.out.println(n+" is an armstrong number");
                                    }
                                    else
                                    {
                                        System.out.println(n+" is not an armstrong number");
                                    }
                                }
                            };
                            t2.start();
                            try
                            {
                                t2.join();
                            }
                            catch(Exception e)
                            {
                                e.printStackTrace();
                            }
                        }
                        else
                        {
                            System.out.println(n+" is not divisible by 7");
                        }
                    }
                };
                t1.start();
                try
                {
                    t1.join();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            sc.close();
            fis.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
