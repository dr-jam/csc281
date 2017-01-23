import java.util.Random;

class HelloMaze {

  // The program starts here.
  public static void main(String[] args) {
    int rows = 40;
    int columns = 80;

    //create a new random number generator
    Random randGen = new Random();

    for(int r = 0; r < rows; r++) {
      for(int c = 0; c < columns; c++) {
        if(0.5 < randGen.nextDouble()) {
          System.out.print('-');
        } else {
          System.out.print('|');
        }
      }
      //print a line break
      System.out.println();
    }
  }

}
