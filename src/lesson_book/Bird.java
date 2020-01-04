package lesson_book;

public class Bird extends Animal {

    String beak;

    public Bird(String name) {
        super(name, "птица");
        this.beak = "клюв";
    }

    public void move() {
        System.out.println("Я летаю");
    }
}
