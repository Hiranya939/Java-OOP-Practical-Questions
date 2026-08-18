import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equalsIgnoreCase(rev) ? "Palindrome" : "Not Palindrome");
    }
}
