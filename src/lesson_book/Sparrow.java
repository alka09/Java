package lesson_book;

public class Sparrow extends Bird{
    static int sparrowCount = 5;

    public Sparrow(String size, String color, String species, String feathers, String beak){
        super(size, color, species, feathers, beak);

        System.out.println("Конструктор класса Воробьи");
        System.out.println("Сколько у нас всего воробьев" + sparrowCount);

    }
}
