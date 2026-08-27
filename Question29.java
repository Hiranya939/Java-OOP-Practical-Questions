class Person {
    String name;
    Person(String name){this.name=name;}
    void show(){System.out.println("Name: "+this.name);}
}
public class Question29 {
    public static void main(String[] args) {
        new Person("Hiranya").show();
    }
}
