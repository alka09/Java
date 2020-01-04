package lesson_book;

public class Main {

   public static void main(String[] args) {

       Eagle eagle = new Eagle();
       Sparrow sparrow = new Sparrow();
       Carp carp = new Carp();
       Pike pike = new Pike();

//       System.out.println(eagle);
//       System.out.println(sparrow);
//       System.out.println(carp);
//       System.out.println(pike);

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