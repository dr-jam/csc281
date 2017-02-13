import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFileExample {

  public static void main(String[] args) {
    File inputFile;
    for(String arg : args) {
      System.out.println(arg);
    }

    if(args.length >= 1) {
      System.out.println(args[0]);
      inputFile = new File(args[0]);
    }else{
      inputFile = new File("input1");
    }

    Scanner fileScanner;
    try {
      fileScanner = new Scanner(inputFile);

      while(fileScanner.hasNextLine()) {
        System.out.println("echo: " + fileScanner.nextLine());
      }
      fileScanner.close();
    } catch(FileNotFoundException e) {
      System.out.println(e);
    }
  }

}
