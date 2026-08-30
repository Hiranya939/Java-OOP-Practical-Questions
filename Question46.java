class MyThread extends Thread {
    public void run(){for(int i=1;i<=5;i++)System.out.println("Thread: "+i);}
}
public class Question46 {
    public static void main(String[] args) {
        new MyThread().start();
    }
}
