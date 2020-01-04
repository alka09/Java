package lesson_book;

public class Main {

   public static void main(String[] args) {

       Eagle eagle = new Eagle("На крыльях - огромные маховые перья", "большой загнутый клюв", "орел");
       Pike pike = new Pike("Есть чешуя", "Есть плавники", "щука");

       System.out.println("Орел: ");
       eagle.speak();
       eagle.move();

       System.out.println("Щука: ");
       pike.speak();
       pike.move();
    }  //   Конец  метода  main
}  // Конец класса