class Animal { void eat(){System.out.println("Eating");} }
class Dog extends Animal { void bark(){System.out.println("Barking");} }
class Cat extends Animal { void meow(){System.out.println("Meowing");} }
public class Question34 {
    public static void main(String[] args) {
        new Dog().bark(); new Cat().meow();
    }
}
