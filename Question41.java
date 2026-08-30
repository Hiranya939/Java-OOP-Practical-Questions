public class Question41 {
    public static void main(String[] args) {
        try {
            int x=10/0;
            System.out.println(x);
        } catch(ArithmeticException e) {
            System.out.println("Caught: "+e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
