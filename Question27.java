import java.util.*;
public class Question27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of strings: "); int n=sc.nextInt(); sc.nextLine();
        String[] a=new String[n]; for(int i=0;i<n;i++)a[i]=sc.nextLine();
        Arrays.sort(a,String.CASE_INSENSITIVE_ORDER);
        for(String s:a)System.out.println(s);
    }
}
