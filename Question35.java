abstract class Shape {
    abstract void draw();
    void message(){System.out.println("This is an abstract class");}
}
class Circle extends Shape {
    void draw(){System.out.println("Drawing Circle");}
}
public class Question35 {
    public static void main(String[] args) {
        Shape s=new Circle(); s.message(); s.draw();
    }
}
