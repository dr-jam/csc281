
public class ScopeKid extends ScopeParent {
  //belongs to the class
  public static int publicStaticKid = 11; 
  protected static int protectedStaticKid = 12; 
  private static int privateStaticKid = 13;
  
  public int publicInstanceKid = 14; 
  protected int protectedInstanceKid = 15; 
  private int privateInstanceKid = 16;
  
  public ScopeKid() {
    super();
  }

  public void scopeExperiment() {
    System.out.println("Testing static members of ScopeParent in ScopeKid");
    //this class can see all static members of ScopeParent
    System.out.println(ScopeParent.publicStaticParent);
    System.out.println(ScopeParent.protectedStaticParent);
    //Private is only accessible to the class they are declared in.
    //System.out.println(ScopeParent.privateStaticParent);
    
    System.out.println("Testing static members of ScopeKid in ScopeKid");
    //this class can only see the public static members of ScopeKid 
    System.out.println(ScopeKid.publicStaticKid);
    //Protected members are accessible as both classes are in the same package.
    System.out.println(ScopeKid.protectedStaticKid);
    System.out.println(ScopeKid.privateStaticKid);
    
    System.out.println("Testing instance members of ScopeKid in Scope Parent");
    System.out.println(this.publicInstanceKid);
    System.out.println(this.protectedInstanceKid);
    // Instance member variables follow the same rules as static member variables; private is disallowed.
    System.out.println(this.privateInstanceKid);
    
    System.out.println("Testing instance members of ScopeParent in ScopeKid");
    System.out.println(this.publicInstanceParent);
    System.out.println(this.protectedInstanceParent);
    // Another interesting case! Private member variables of the parent are not accessible in the child even though they exist. 
    //System.out.println(this.privateInstanceParent);
    System.out.println(this.getPriviateParent());
  }
  
}
