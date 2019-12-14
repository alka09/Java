package lesson_book;

public class Animal {
    String size;
    String color;
    String species;

    public static int animalCount = 15;

    public Animal(String size, String color, String species) {
        this.size = size;
       this.color = color;
       this.species = species;
       System.out.println("Конструктор базового класса Animal");
       System.out.println("Текущее значение animalCount" + animalCount);
    }

}
