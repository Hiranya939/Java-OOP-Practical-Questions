import java.util.*;
public class Question50 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>(); a.add("A");a.add("B");a.remove("A");
        LinkedList<String> l=new LinkedList<>(); l.add("X");l.addFirst("Y");
        System.out.println("ArrayList: "+a);
        System.out.println("LinkedList: "+l);
    }
}
