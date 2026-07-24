// class OuterClass {

//   int x = 10;
//   public static void main(String[] args) {
    
//   }
   
//   class InnerClass {

//     int y = 5;
    
//   }

// }

// public class Main {
//   public static void main(String[] args) {
//     OuterClass outerObj = new OuterClass();
//     OuterClass.InnerClass innerClass = outerObj.new InnerClass();
//     System.out.println(outerObj.x);
//     System.out.println(innerClass.y);
//     System.out.println(innerClass.y + outerObj.x);
//   }
// }

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    System.out.println("Type your name: ");
    // Scanner scanner = new Scanner(System.in);
    // String input = scanner.nextLine();
    // int age = scanner.nextInt();
    // double salary = scanner.nextDouble();

    // System.out.println("user name: " + input);
    // System.out.println("user age: " + age);
    // System.out.println("user salary: " + salary);

    // LocalDateTime date = LocalDateTime.now();
    // LocalTime time = LocalTime.now();
    // System.out.println("current date: " + date);
    // System.out.println("current time: " + time);
    // System.out.println("formatted time: " + date.format(DateTimeFormatter.ofPattern("hh:MM")));

    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("10");
    cars.add("Honda");

    cars.add(0, "zero");
    // cars.add(8, "Eight");
    System.out.println(cars.get(2));

    Collections.sort(cars, Collections.reverseOrder());

    cars.forEach(n -> System.out.println("cars: " + n));

    for (String car : cars) {
      System.out.println(car);
    }

  }
}