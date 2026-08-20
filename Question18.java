import java.util.Scanner;
public class Question18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: "); int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Search element: "); int x=sc.nextInt(), pos=-1;
        for(int i=0;i<n;i++) if(a[i]==x){pos=i;break;}
        System.out.println(pos>=0 ? "Found at index "+pos : "Not found");
    }
}
