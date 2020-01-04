package lesson_book;

public class Fish extends Animal {

    String fins;

    public Fish(String name) {
        super(name, "рыба");
        this.fins = "плавники";
    }
    public void move() {
        System.out.println("Я плаваю.");
    }
}
