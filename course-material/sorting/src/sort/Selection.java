package sort; 

public class Selection { 
  public static int[] ascending(int a[]) {
    int n = a.length;
    for (int i = 0; i < n-1; i++) {
      int q = i;  
      for (int j = i+1; j < n; j++) {
        if (a[j] < a[q]) {
          q = j; 
        } 
      }
    int temp = a[i]; 
    a[i] = a[q]; 
    a[q] = temp;  
    } 
   return a; 
 } 
  
  public static int[] descending(int a[]) {
	    int n = a.length;
	    for (int i = 0; i < n-1; i++) {
	      int q = i;  
	      for (int j = i+1; j < n; j++) {
	        if (a[j] > a[q]) {
	          q = j; 
	        } 
	      }
	    int temp = a[i]; 
	    a[i] = a[q]; 
	    a[q] = temp;  
	    } 
	   return a; 
	 } 
  
} 

//Group 1: Rebecca, Alex, Anna, Layla

