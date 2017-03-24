/**
 * Homework 2 - PolyWhirl
 * 
 * Due: Monday, April 3rd at 11:59pm. Follow the standard homework submission guidelines.
 * 
 * Grading: 70 points for correct completion of all tasks and 30 points for style, creativity, and
 * following instructions. Up to 10 points can be recovered if you successfully complete the bonus.
 * 
 * Tasks:
 * 
 * -Read in shape specifications that consist of 3 numbers: number of sides of the shape, the left
 * coordinate of the center in pixels, and the right coordinate of the center in pixels. There will
 * be one shape per line of input text via standard input.
 * 
 * -Make a list per shape to store instances of that shape.
 * 
 * -Read through each shape specification from the input and add a new instance of that shape to the
 * appropriate shape list. For example, the input of 3 100 100 would result on code like the
 * following in the readAndGenerateShapes method of the Surface class: this.tris.add(new Tri(100,
 * 100));
 * 
 * -Create a set of classes that extend BasicShape with the following number of sides: Tri - 3
 * sided, Quad - 4 sided, Pent - 5 sided, and Hex - 6 sided. Note that these shapes do not need to
 * be regular; each shape can have sides of non-uniform length (e.g. both squares and rectangles are
 * valid Quads.
 * 
 * -Pick a fill and stroke color for each class. Let your inner graphic designer or color theorist
 * shine through!
 * 
 * -Each shape should be ~50 pixels wide (i.e. all of the points should be roughly 25 pixels from
 * the center of the shape).
 * 
 * -Document the classes and methods you create.
 * 
 * -Document the functions that are declared after comments that contain TODO: document.
 * 
 * Bonus: Create an additional class that inherits BasicShape that can draw a regular shape with any
 * number of sides.
 */

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import shapes.*;

/**
 * The entry point for the PolyWhirl program. This class inherits JFrame and acts as a window in the
 * graphical user interface.
 * 
 * You do not need to edit this class for the assignment.
 */
public class PolyWhirl extends JFrame {

  public static final int WINDOW_WIDTH = 720;
  public static final int WINDOW_HEIGHT = 640;

  private Surface surface;

  public PolyWhirl() {
    initUI();
  }

  /**
   * Initializes the graphics window (a JFrame) and adds the drawing surface (a JPanel).
   */
  private void initUI() {
    this.surface = new Surface();
    setTitle("PolyWhirl");
    // set the resolution of the window to be glorious 720p
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(this.surface);
  }

  public static void main(String[] args) {

    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        PolyWhirl polyWhirl = new PolyWhirl();
        // polyWhirl.drawShapes();
        polyWhirl.surface.readAndGenerateShapes();
        polyWhirl.setVisible(true);
      }
    });
  }

  /**
   * The Surface class inherits JPanel and acts as a drawing surface. It is the core of this program
   * and does the following:
   * 
   * -Reads input, creates appropriate instances of shapes, and adds them to the correct list via
   * the readAndGenerateShapes method.
   * 
   * -Manages the lists of shapes and is responsible for rendering them via the drawShapes method.
   * 
   * You are responsible for editing and adding capabilities to this class for the assignment.
   */
  class Surface extends JPanel {

    List<Crystal> crystals;
    // Add the lists for your shapes below.

    public Surface() {
      crystals = new ArrayList<Crystal>();
      // initialize your shape lists here.
    }

    @Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.drawShapes(g);
      // this.readAndGenerateShapes();
    }

    /**
     * This is where most of your work in this class will be done.
     */
    // TODO: document
    public void readAndGenerateShapes() {
      /*
       * Iterate through reading lines of input. Stop when there is no input left. (You can simulate
       * end of input on the keyboard with ctrl-d).
       */

      /*
       * Create a shape for that line.
       */

      /*
       * Add the shape to a list to be drawn.
       */

      /*
       * Here are some test shapes to show that the system works. Remove them before you turn in
       * your homework. Use the power of the crystals wisely!
       */
      this.crystals.add(new Crystal(100, 125));
      this.crystals.add(new Crystal(100, 225));
      this.crystals.add(new Crystal(200, 125));
      // You can stop removing now.
    }

    // TODO: document
    public void drawShapes(Graphics g) {
      // draw background
      // GradientPaint gradient;
      ((Graphics2D) g).setColor(java.awt.Color.WHITE);
      ((Graphics2D) g).fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);

      for (Crystal c : this.crystals) {
        c.draw(g);
      }
      // Add the loops to draw your shapes below.
    }

  }
}

