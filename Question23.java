import java.util.Scanner;
public class Question23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: "); String s=sc.nextLine();
        System.out.println("Reversed = "+new StringBuilder(s).reverse());
    }
}
