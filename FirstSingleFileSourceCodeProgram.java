public class HelloWorld {
  public static void main(String[] args) {
    // IO.println("Hello World!");
    // IO.println("Hello " + args[0]);
    IO.println(GenerateMessage.generateMessage());
    IO.println(AnotherMessage.generateAnotherMessage());
  }
}

class GenerateMessage {
  static String generateMessage() {
    return "Here is one message";
  }
}

class AnotherMessage {
  static String generateAnotherMessage() {
    return "Here is another message";

  }
}
