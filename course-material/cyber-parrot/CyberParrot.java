/* Maps and file input lab. Use the io-examples and the Pokedex 
 * code in the course-material folder as samples for completing
 * this lab. More information about maps can be found here:
 * https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
 * 
 * Complete all of the sections marked as TODO.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class CyberParrot {

   private Map<String, Integer> wordFrequencies;
   private int wordCount = 0;
  
   public static final int MAX_WORDS = 150;
   
  /**
   * @param args The path to a text.
   */
  public static void main(String[] args) {
    //Open a file containing the text 
    //Create a new instance of CyberParrot
    CyberParrot pierre = new CyberParrot();
    
    File inputFile = null;

    if(args.length >= 1) {
      inputFile = new File(args[0]);
      System.out.println("On the menu: " + args[0]);
    }else{
      System.out.println("Requires a path to a text as the argument. A cyber parrot can't survive on nothin'!");
      System.exit(1); //exit the program
    }

    Scanner fileScanner;
    String word = "";
    try {
      fileScanner = new Scanner(inputFile);

      while(fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        
        //TODO: break the line up into words for pierre to eat
        pierre.feedWord(word);
      }
      fileScanner.close();
    } catch(FileNotFoundException e) {
      System.out.println(e);
    }
    
    for(int i = 0; i < MAX_WORDS; i++) {
      pierre.speak();
    }
  }
  
  /**
   * The constructor.
   */
  public CyberParrot() {
    //start with an empty stomach!
    this.wordFrequencies = new HashMap<String, Integer>();
  }
  
  /**
   * Takes a word to feed the CyberParrot. This results in one of two cases: 
   * 1. the word already exists in wordFrequencies map and the value of that map is incremented.
   * 2. the word does not exist in the map and is then added as a key with a value of 1
   * Be sure to increase this.wordCount every time the parrot is fed!
   * @param word A word to feed the CyberParrot.
   */
  public void feedWord(String word) {
    //TODO
  }
  
  
  
  /**
   * The CyberParrot should speak a word based on the word frequencies.
   */
  public void speak() {
    /*TODO:
    Generate a number between 0 and this.word count using:
      Random().nextInt(this.wordCount)
    Create an int counter with an initial value of 0.
    Loop through every word in this.wordFrequencies.
    For each word, use that word as a key in this.wordFrequencies and get its 
      value with code like: this.wordFrequencies.get(word)
    Add the word's value to the counter.
    If the counter is greater than or equal to the generated random 
      number, print the current word with System.out.print (not println!).  
     */
  }
  
  /**
   * Splits a string by spaces, line breaks, and tabs into an array of strings.
   * @param line A string to split.
   * @return An array of strings consisting of the line argument split by whitespace.
   */
  public String[] splitByWhitespace(String line){
    return line.split("\\s+");
  }
   
}
