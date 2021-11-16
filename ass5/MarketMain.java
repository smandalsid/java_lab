class Market {
    int product1=0;
    int product2=0;

    synchronized void producer(int type)
    {
        if (type==1)
        {
            System.out.println("Producing product 1");
            product1++;
            notify();
        }
        else
        {
            System.out.println("Producing product 2");
            product2++;
            notify();
        }
    }

    synchronized void consumer(int type)
    {
        if (type==1)
        {
            if (product1<=0)
            {
                try
                {
                    Thread.sleep(1000);
                    wait();
                }
                catch(Exception e)
                {}
            }
            else
            {
                System.out.println("Consuming product 1");
                product1-=1;
            }
        }
        else
        {
            if(product2<=0)
            {
                try
                {
                    Thread.sleep(1000);
                    wait();
                }
                catch(Exception e)
                {

                }
            }
            else
            {
                System.out.println("Consuming product 2");
                product2-=1;
            }
        }
    }
}

public class MarketMain {
    public static void main(String[] args) {
        Market m = new Market();
        Thread t1=new Thread() {
            public void run()
            {
                m.producer(1);
            }
        };
        Thread t2=new Thread(){
            public void run()
            {
                m.consumer(2);
            }
        };
        Thread t3=new Thread(){
            public void run()
            {
                m.consumer(1);
            }
        };
        Thread t4=new Thread(){
            public void run()
            {
                m.producer(2);
            }
        };
        t2.start();
        t3.start();
        t1.start();
        t4.start();
        try
        {
            t2.join();
            t3.join();
            t1.join();
            t4.join();
        }
        catch(Exception e)
        {

        }
    }
}