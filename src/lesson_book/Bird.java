package lesson_book;

public class Bird extends Animal {

    String beak;

    public Bird(String name, String type, String beak) {
        super(name, type);
        this.beak = beak;
        this.type = "птица";
        this.name = name;

    }


    public void move() {

        System.out.println("Я летаю");
    }

}
