import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: "); String s=sc.nextLine().trim();
        int words=s.isEmpty()?0:s.split("\\s+").length;
        System.out.println("Words = "+words);
        System.out.println("Characters = "+s.length());
    }
}
