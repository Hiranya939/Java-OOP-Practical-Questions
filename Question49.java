public class Question49 {
    public static void main(String[] args) throws InterruptedException {
        Thread low=new Thread(()->System.out.println("Low priority thread"));
        Thread high=new Thread(()->System.out.println("High priority thread"));
        low.setPriority(Thread.MIN_PRIORITY); high.setPriority(Thread.MAX_PRIORITY);
        low.start(); high.start(); low.join(); high.join();
        System.out.println("Low priority = "+low.getPriority());
        System.out.println("High priority = "+high.getPriority());
    }
}
