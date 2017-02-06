package BasicThings;

public class BasicThing {
  public Double size;

  public BasicThing() {
    this.size = 12.5;
  }

  public BasicThing(Double size) {
    this.size = size;
  }

  public void use() {
    System.out.println("I'm a basic thing so I sit in the corner and whirrrrrrrr");
  }
}
