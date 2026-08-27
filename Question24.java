import java.util.*;
public class Question24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two strings: "); String a=sc.nextLine().replaceAll("\\s","").toLowerCase(), b=sc.nextLine().replaceAll("\\s","").toLowerCase();
        char[] x=a.toCharArray(), y=b.toCharArray(); Arrays.sort(x); Arrays.sort(y);
        System.out.println(Arrays.equals(x,y) ? "Anagrams" : "Not Anagrams");
    }
}
