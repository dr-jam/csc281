import BasicThings.*;

public class UseSomeThingsApp {
  public static void main(String[] args) {
    BasicThing bt1 = new BasicThing();
    System.out.println("The size of the first basic thing " + bt1.size);
    bt1.use();

    ThingWithWhistles whistler = new ThingWithWhistles();
    whistler.use();

  }
}
