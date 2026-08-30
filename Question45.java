public class Question45 {
    static void level3() { int x=10/0; }
    static void level2() { level3(); }
    static void level1() { level2(); }
    public static void main(String[] args) {
        try { level1(); } catch(ArithmeticException e){System.out.println("Exception propagated to main");}
    }
}
