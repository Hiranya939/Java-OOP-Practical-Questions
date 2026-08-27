class Parent {
    void show(){System.out.println("Parent");}
    void add(int a,int b){System.out.println("Compile-time: "+(a+b));}
}
class Child extends Parent {
    @Override void show(){System.out.println("Child");}
}
public class Question40 {
    public static void main(String[] args) {
        Parent p=new Child(); p.show();
        p.add(10,20);
    }
}
