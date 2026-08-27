public class Question26 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" Java").insert(0,"Core ");
        System.out.println("StringBuilder: "+sb);
        StringBuffer sf=new StringBuffer("Hello");
        sf.append(" World").reverse();
        System.out.println("StringBuffer: "+sf);
    }
}
