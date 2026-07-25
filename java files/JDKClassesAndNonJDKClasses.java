import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {
  public static void main(String... args) {
    String wordsAndNumbers = """
      Longing rusted furnace
      daybreak 17 benign
      9 homecoming 1
      freight car
    """;
    try (Scanner scanner = new Scanner(wordsAndNumbers)) {
      scanner.findAll("benign").map(MatchResult::group).forEach(IO::println);
    }
  }
}

// import org.apache.commons.lang3.RandomUtils;

// public class ReferenceNonJDKClass {
//   public static void main(String[] args) {
//     IO.println(RandomUtils.nextInt());
//   }
// }