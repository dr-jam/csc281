package BasicThings;

public class ThingWithWhistles extends BasicThing {

  public String whistle = "fweeeet";

  public ThingWithWhistles() {
    //super();
  }

  //public ThingWithWhistles(Double size) {}

  public void use() {
	System.out.println("I have a whistle so I can " + this.whistle);    
  }
}
