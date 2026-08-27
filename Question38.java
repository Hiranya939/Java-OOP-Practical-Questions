class Counter {
    static int count=0;
    int id;
    Counter(int id){this.id=id;count++;}
    void show(){System.out.println("Instance id="+id+", Static count="+count);}
}
public class Question38 {
    public static void main(String[] args) {
        Counter a=new Counter(1), b=new Counter(2);
        a.show(); b.show();
    }
}
