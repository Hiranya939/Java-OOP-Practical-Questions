import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(), original = n, sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        while (n != 0) {
            int d = n % 10;
            sum += (int)Math.pow(d, digits);
            n /= 10;
        }
        System.out.println(sum == original ? "Armstrong Number" : "Not Armstrong Number");
    }
}
