package lesson_book;

abstract class Animal implements Movable, Speakable {

    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void speak() {
        System.out.print("Я " + name + "." + " ");
        System.out.println("Я " + type + ".");
    }
    public void move() {
    }
}
