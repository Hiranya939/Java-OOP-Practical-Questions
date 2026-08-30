public class Question44 {
    static void checked() throws Exception { throw new Exception("Checked exception"); }
    public static void main(String[] args) {
        try { checked(); } catch(Exception e){System.out.println(e.getMessage());}
        try { int x=10/0; } catch(ArithmeticException e){System.out.println("Unchecked exception");}
    }
}
