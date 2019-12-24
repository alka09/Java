package lesson_book;

public class Bird extends Animal {

    String feathers;
    String beak;

    static int birdCount = 17;

    public Bird(String name, String feathers, String beak) {
        super("Орел", "птица");
        this.feathers = feathers;
        this.beak = beak;
    }

    public void move() {

        System.out.println("Я летаю!!!!!!!");
    }

    public void speak() {
        
    }
}
