import java.io.Console;

public class ConsoleExample {

  public static void main(String[] args) {
    readInput();
  }

  public static void readInput() {
    Console consoleInput = System.console();
    String lineOfInput = consoleInput.readLine();
    
    while(!lineOfInput.toLowerCase().equals("end")) {
      System.out.println(lineOfInput);
      
      lineOfInput = consoleInput.readLine();
    }

  }
}
