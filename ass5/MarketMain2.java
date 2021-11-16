class Market2 {
    int product1 = 0; // number of products of type 1 
    int product2 = 0; // number of products of type 2

    public synchronized void producer() throws InterruptedException {
        // producer that produces two products 1 and 2
        System.out.println("Producing product 1");
        product1++;
        System.out.println("Producing product 2");
        product2++;
        notifyAll();
        Thread.sleep(1000);
    }

    public synchronized void consumer(int type) throws InterruptedException {
        // consumer to consume products based on type
        if (type == 1) {
            if (product1 <= 0) {
                System.out.println("Product 1 not available\nWaiting");
                wait();
            }
            System.out.println("Consuming product 1");
            product1 -= 1;
        } else if (type == 2) {
            if (product2 <= 0) {
                System.out.println("Product 2 not available\nWaiting");
                wait();
            }
            System.out.println("Consuming product 2");
            product2 -= 1;
            Thread.sleep(1000);
        } else if (type == 12) {
            if (product1 <= 0 || product2 <= 0) {
                System.out.println("Products 1 or 2 not available\n");
                wait();
            }
            System.out.println("Consuming product 1 and 2");
            product1 -= 1;
            product2 -= 1;
            Thread.sleep(1000);
        }

    }
}

public class MarketMain2 {
    public static void main(String[] args) throws InterruptedException {
        Market2 m = new Market2();
        Thread t1 = new Thread() {
            public void run() {
                try {
                    m.producer();
                } catch (InterruptedException e) {
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                try {
                    m.producer();
                } catch (InterruptedException e) {
                }
            }
        };
        Thread t3 = new Thread() {
            public void run() {
                try {
                    m.consumer(1);
                } catch (InterruptedException e) {
                }
            }
        };
        Thread t4 = new Thread() {
            public void run() {
                try {
                    m.consumer(2);
                }
                catch(InterruptedException e) {
                    
                }
            }
        };
        Thread t5 = new Thread() {
            public void run() {
                try {
                    m.consumer(12);
                }
                catch(InterruptedException e) {

                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
