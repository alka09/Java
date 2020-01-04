package lesson_book;

public class Bird extends Animal {

    String beak;

    public Bird(String name, String type, String beak) {
        super(name, "птица");
        this.beak = beak;
    }
    public void move() {
        System.out.println("Я летаю");
    }
}
