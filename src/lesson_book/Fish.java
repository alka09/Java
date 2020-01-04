package lesson_book;

public class Fish extends Animal {

    String fins;

    public Fish(String name, String type, String fins) {
        super(name, type);
        this.fins = fins;
        this.name = name;
        this.type = "рыба";
    }

    public void move() {
        System.out.println("Я плаваю.");
    }

}
