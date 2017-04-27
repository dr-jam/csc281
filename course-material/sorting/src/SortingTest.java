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
    System.out.println(testBubbleAscending(data));
    
    System.out.print("Bubble Descending: ");
    System.out.println(testBubbleDescending(data));
    
    System.out.print("Selection Ascending: ");
    System.out.println(testSelectionAscending(data));
    
    System.out.print("Selection Descending: ");
    System.out.println(testSelectionDescending(data));
    
    System.out.print("Insertion Ascending: ");
    System.out.println(testInsertionAscending(data));
    
    System.out.print("Insertion Descending: ");
    System.out.println(testInsertionDescending(data));

  }
  

  private boolean testBubbleAscending(int[] data) {
    Bubble.Ascending(data);
    int[] check = {1, 2, 3, 4, 5};
    for (int i = 0; i < data.length; i++) {
    	if (data[i] != check[i]) {
    		return false;
    	}
    }
    return true;
  }
  
  private boolean testBubbleDescending(int[] data) {
    Bubble.Descending(data);
    int[] check = {5, 4, 3, 2, 1};
    for (int i = 0; i < data.length; i++) {
    	if (data[i] != check[i]) {
    		return false;
    	}
    }
    return true;
    
  }
  
  private boolean testSelectionAscending(int[] data) {
    Selection.ascending(data);
    int[] check = {1, 2, 3, 4, 5};
    for (int i = 0; i < data.length; i++) {
      if (data[i] != check[i]) {
        return false;
      }
    }
    return true; 
  }
  
  private boolean testSelectionDescending(int[] data) {
    Selection.descending(data);
    int[] check = {5, 4, 3, 2, 1};
    for (int i = 0; i < data.length; i++) {
      if (data[i] != check[i]) {
        return false;
      }
    }
    return true; 
  }

  private boolean testInsertionAscending(int[] data) {
    int[] sortedData = Insertion.ascending(data); 
    int[] check = {1, 2, 3, 4, 5};
    for (int i = 0; i < sortedData.length; i++) {
      if (sortedData[i] != check[i]) {
        return false;
      }
    }
    return true;    
  } 
  
  private boolean testInsertionDescending(int[] data) {
    return false;
  }
  
  private boolean isSorted(int[] data, SortDirection direction) {
  return false;
  }
}


