class Counter {
    private int count=0;
    synchronized void increment(){count++;}
    int getCount(){return count;}
}
public class Question48 {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable r=()->{for(int i=0;i<1000;i++)c.increment();};
        Thread t1=new Thread(r),t2=new Thread(r); t1.start();t2.start();t1.join();t2.join();
        System.out.println("Count = "+c.getCount());
    }
}
