class MyRunnable implements Runnable {
    public void run(){for(int i=1;i<=5;i++)System.out.println("Runnable: "+i);}
}
public class Question47 {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}
