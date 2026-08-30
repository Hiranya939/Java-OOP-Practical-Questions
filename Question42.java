public class Question42 {
    public static void main(String[] args) {
        try {
            int[] a={1,2}; System.out.println(a[5]);
        } catch(ArithmeticException e) { System.out.println("Arithmetic error"); }
          catch(ArrayIndexOutOfBoundsException e) { System.out.println("Array index error"); }
          catch(Exception e) { System.out.println("Other error"); }
    }
}
