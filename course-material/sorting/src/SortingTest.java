import sort.*;

public class SortingTest {

  private enum SortDirection {
    ASCENDING,
    DESCENDING
  }
  
  public static void main(String[] args) {
    SortingTest tester = new SortingTest();
    
    int[] test1 = {1, 2, 3, 4, 5};
    int[] test2 = {5, 4, 3, 2, 1};
    int[] test3 = {1, 3, 2, 5, 4};
    int[] test4 = {5, 1, 2, 3, 4};
    int[] test5 = {3, 2, 1, 5, 4};
    
    System.out.println("Let the tests begin!");
    System.out.println("Test1:");
    tester.testAllSorters(test1);
    
    System.out.println("Test2:");
    tester.testAllSorters(test2);
    
    System.out.println("Test3:");
    tester.testAllSorters(test3);
    
    System.out.println("Test4:");
    tester.testAllSorters(test4);
    
    System.out.println("Test5:");
    tester.testAllSorters(test5);
 
    System.out.println("Tests complete.");
  }
  
  private void testAllSorters(int[] data) {
   
    System.out.print("Bubble Ascending: ");
    System.out.println(testBubbleAscending(data.clone()));
    
    System.out.print("Bubble Descending: ");
    System.out.println(testBubbleDescending(data.clone()));
    
    System.out.print("Selection Ascending: ");
    System.out.println(testSelectionAscending(data.clone()));
    
    System.out.print("Selection Descending: ");
    System.out.println(testSelectionDescending(data.clone()));
    
    System.out.print("Insertion Ascending: ");
    System.out.println(testInsertionAscending(data.clone()));
    
    System.out.print("Insertion Descending: ");
    System.out.println(testInsertionDescending(data.clone()));

  }
  

  private boolean testBubbleAscending(int[] data) {
    return false;
  }
  
  private boolean testBubbleDescending(int[] data) {
    return false;
  }
  
  private boolean testSelectionAscending(int[] data) {
    return false;
  }
  
  private boolean testSelectionDescending(int[] data) {
    return false;
  }

  private boolean testInsertionAscending(int[] data) {
    return false;
  }
  
  private boolean testInsertionDescending(int[] data) {
    return false;
  }
  
  private boolean isSorted(int[] data, SortDirection direction) {
    return false;
  }
}
