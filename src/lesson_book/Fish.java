package lesson_book;

public class Fish extends Animal {

    String scales;
    String fins;

    public Fish(String name, String scales, String fins) {
        super("карп", "рыба");
        this.scales = scales;
        this.fins = fins;
    }

    public void move() {
        System.out.println("Я плаваю!!!!!!!");
    }
}
