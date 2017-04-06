import static java.lang.Math.PI;

public class ScopeParent {

  //belongs to the class
  public static int publicStaticParent = 1; 
  protected static int protectedStaticParent = 2; 
  private static int privateStaticParent = 3; 
  
  //instance member variables
  public int publicInstanceParent = 4; 
  protected int protectedInstanceParent = 5; 
  private int privateInstanceParent = 6;
  
  public static void main(String[] args) {

    System.out.println("Testing static members of ScopeParent");
    //this class can see all static members of ScopeParent
    System.out.println(ScopeParent.publicStaticParent);
    System.out.println(ScopeParent.protectedStaticParent);
    System.out.println(ScopeParent.privateStaticParent);
    
    System.out.println("Testing static members of ScopeKid in ScopeParent");
    //this class can only see the public static members of ScopeKid 
    System.out.println(ScopeKid.publicStaticKid);
    //Protected members are accessible as both classes are in the same package.
    System.out.println(ScopeKid.protectedStaticKid);
    //Private is only accessible to the class they are declared in.
    //System.out.println(ScopeKid.privateStaticKid);
    
    
    System.out.println("Testing instance members of ScopeKid in ScopeParent");
    ScopeKid kid = new ScopeKid();
    
    System.out.println(kid.publicInstanceKid);
    System.out.println(kid.protectedInstanceKid);
    // Instance member variables follow the same rules as static member variables; private is disallowed.
    //System.out.println(kid.privateInstanceKid);
    
    System.out.println("Testing inhereited instance members of ScopeKid from ScopeParent in ScopeParent");
    System.out.println(kid.publicInstanceParent);
    System.out.println(kid.protectedInstanceParent);
    // Interesting case! Private member variables declared in ScopeParent cannot be accessed after they are inherited by ScopeKid. 
    //System.out.println(kid.privateInstanceParent);
    
    kid.scopeExperiment();
    
    ScopeParent parent = new ScopeParent();
    parent.blockScopeExperiment("foo");
  }

  public String s = "bar";
  
  public void blockScopeExperiment(String s) {
    System.out.println("block scope experiments");
    //which will it be? The incoming parameter value!
    System.out.println(s);
    //Instance member variables can be accessed with the this keyword
    System.out.println(this.s);
    
    String localVariable = "localVariable";
    
    //This is a block. if, else, for, while, switch, etc. all have similar blocks. 
    {
      System.out.println(localVariable);
      
      String blockLocalVariable = "blockLocal";
      System.out.println(blockLocalVariable);
    }
    //Invalid outside of block!
    //System.out.println(blockLocalVariable);
    
    
    System.out.println("Block scope in for loops");
    for(int loopIterator=0; loopIterator < 3; ++loopIterator) {
      String loopLocal = "loopLocal";
      System.out.println(loopIterator);
      System.out.println(loopLocal);
    }
    
    //conditional and iteration local block variables are only accessible in their block
    //System.out.println(loopIterator);
    //System.out.println(loopLocal);
    
    System.out.println("Public static variables");
    //public static variables work everywhere!
    System.out.println(PI);
    
  }
  
  
  public int getPriviateParent() {
    return this.privateInstanceParent;
  }
}
