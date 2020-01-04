package lesson_book;

public class Main {

   public static void main(String[] args) {

       Eagle eagle = new Eagle("птица", "большой", "орел");
       Sparrow sparrow = new Sparrow("птица", "маленький", "воробей");
       Carp carp = new Carp("рыба", "семь плавников", "карп");
       Pike pike = new Pike("рыба", "пять плавников", "щука");


       System.out.println("Орел: ");
       eagle.speak();
       eagle.move();

       System.out.println("Воробей: ");
       sparrow.speak();
       sparrow.move();

       System.out.println("Щука: ");
       pike.speak();
       pike.move();

       System.out.println("Карп: ");
       carp.speak();
       carp.move();
    }  //   Конец  метода  main
}  // Конец класса