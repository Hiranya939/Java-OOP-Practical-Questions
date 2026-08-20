import java.util.*;
public class Question16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: "); int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){ int min=i; for(int j=i+1;j<n;j++) if(a[j]<a[min]) min=j;
            int t=a[i]; a[i]=a[min]; a[min]=t; }
        System.out.println(Arrays.toString(a));
    }
}
