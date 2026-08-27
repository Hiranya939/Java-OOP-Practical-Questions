interface Printable { void print(); }
interface Showable { void show(); }
class Demo implements Printable,Showable {
    public void print(){System.out.println("Print method");}
    public void show(){System.out.println("Show method");}
}
public class Question37 {
    public static void main(String[] args) {
        Demo d=new Demo(); d.print(); d.show();
    }
}
