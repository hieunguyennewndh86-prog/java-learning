import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    File file = new File("./src/text.txt");
    
    // System.out.println(file.canRead());

    file.delete();
    
    // try {
      
    //   Scanner scanner = new Scanner(file);
    //   while (scanner.hasNextLine()) {
    //     String data = scanner.nextLine();
    //     System.out.println(data);
    //   }
    //   scanner.close();
    // } catch (Exception e) {
    //   // TODO: handle exception
    // }

    // try {
    //   // boolean f1 = file.createNewFile();

    //   if (f1) {
    //     System.out.println("created");
    //     FileWriter file1 = new FileWriter("./src/text.txt");
    //     file1.write("write file in java");
    //     file1.close();
    //   } else {
    //     System.out.println("not created");
    //   }
    // } catch (IOException e) {
    //   // TODO: handle exception
    //   System.out.println(e);
    // }
  }
}
