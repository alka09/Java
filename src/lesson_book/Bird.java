package lesson_book;

public class Bird extends Animal{

    String feathers;
    String beak;

    static int birdCount = 17;

    public Bird(String size, String color, String species, String feathers, String beak){
        super(size, color, species);
        this.feathers = feathers;
        this.beak = beak;

        System.out.println("Конструктор класса Птицы");
        System.out.println("Сколько птиц у нас всего" + birdCount);
    }
}
