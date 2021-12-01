class T implements Runnable {
    static int val=1;
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            // x="JAVA";
            // y="QUIZ2";
            System.out.println(val++);
        }
    }
    public static void main(String[] args) {
        T run = new T();
        Thread obj1 = new Thread(run);
        Thread obj2 = new Thread(run);
        obj1.start();
        // obj2.start();;
        // System.out.println(obj1.getName());
        try
        {
            obj1.join();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        obj2.start();
    }
}