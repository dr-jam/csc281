import java.util.Scanner;

public class ScannerStdinExample {
  public static void main(String[] args) {
    Scanner stdinScanner = new Scanner(System.in);
    while(stdinScanner.hasNextLine()) {
      System.out.println("echo: " + stdinScanner.nextLine());
    }
    stdinScanner.close();
  }
}
