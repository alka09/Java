package lesson_book;

public class Fish extends Animal {

    String scales;
    String fins;

    public Fish(String size, String color, String species, String scales, String fins){
        super(size, color, species);
        this.scales = scales;
        this.fins = fins;
    }
}
