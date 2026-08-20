import java.util.Scanner;
public class Question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sorted array size: "); int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Search element: "); int x=sc.nextInt(), l=0,r=n-1,pos=-1;
        while(l<=r){int m=(l+r)/2; if(a[m]==x){pos=m;break;} if(a[m]<x)l=m+1;else r=m-1;}
        System.out.println(pos>=0 ? "Found at index "+pos : "Not found");
    }
}
