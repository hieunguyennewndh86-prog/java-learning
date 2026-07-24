 interface InnerTest {

  String run(String str);
  
}

public class Test {
  public static void main(String[] args) {
    InnerTest exclaim = s -> s + "!";
    InnerTest ask = s -> s + "?";

    printFormat("I am fine", exclaim);
    printFormat("How are you", ask);
  }
  
  public static void printFormat(String str, InnerTest format) {
    String result = format.run(str);
    System.out.println("result: " + result);
  }
}
