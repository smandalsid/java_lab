
class Market {
    int product1=0;
    int product2=0;
    synchronized void producer()
    {
        product1++;
        product2++;
        System.out.println("Producing items");
        notifyAll();
    }
    synchronized void consumer(int type) throws InterruptedException
    {
        if(type==1)
        {
            if(product1<=0)
            {
                System.out.println("Product 1 is not available");
                wait();
            }
            System.out.println("Consuming product 1");
            product1--;
        }
        else if(type==2)
        {
            if(product2<=0)
            {
                System.out.println("Product 2 is not available");
                wait();
            }
            System.out.println("Consuming product 2");
            product2--;
        }
        else if(type==12)
        {
            if(product1<=0 || product2<=0)
            {
                System.out.println("Some product is not available");
                wait();
            }
            product1--;
            product2--;
            System.out.println("Product 1 and 2 consumed");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Market obj = new Market();
        Thread t1=new Thread(){
            public void run()
            {
                try
                {
                    obj.consumer(1);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t2=new Thread(){
            public void run()
            {
                try
                {
                    obj.consumer(2);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t3=new Thread(){
            public void run()
            {
                try
                {
                    obj.producer();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t4=new Thread(){
            public void run()
            {
                try
                {
                    obj.consumer(12);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t5=new Thread(){
            public void run()
            {
                try
                {
                    obj.producer();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
