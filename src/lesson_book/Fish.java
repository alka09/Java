package lesson_book;

public class Fish extends Animal {

    String fins;

    public Fish(String name, String type, String fins) {
        super(name, "рыба");
        this.fins = fins;
    }
    public void move() {
        System.out.println("Я плаваю.");
    }
}
