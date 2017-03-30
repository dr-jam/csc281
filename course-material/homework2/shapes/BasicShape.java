package shapes;

import java.awt.Graphics;

/**
 * BacisShape acts as a base class for all shapes in the assignment. Each of your shapes should
 * inherit this class.
 */
public class BasicShape {

  // the x and y position of the center of the shapes.
  public int x;
  public int y;

  public BasicShape(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // You will need to @Override this function for your own shapes that inherit this class.
  public void draw(Graphics g) {}

}
