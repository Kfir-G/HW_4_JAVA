import java.awt.Color;
import java.awt.Graphics;
/**
 * This abstract Class implements the state and behaviour of Myshape infrastructure.
 * It inherits from MyShape class.
 */
public abstract class MyBoundedShape extends MyShape
{
    //------data fields------
    private boolean filled; // whether this shape is filled

    //------constructors-------
    /**
     * MyBoundedShape no-argument constructor, initializes vales data to 0 ,color to black and filled to flase
     */
    public MyBoundedShape() //default 
    {
      this.filled = false;
    }
    /**
     * MyBoundedShape constructor with parameters
     * @param x1 the value of X of the first dot
     * @param y1 the value of y of the first dot
     * @param x2 the value of X of the second dot
     * @param y2 the value of y of the second dot
     * @param myColor the value of the shape's color
     * @param filled boolean value if the shape is filled with color
     */
    public MyBoundedShape(int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
      super(x1,y1,x2,y2,myColor);
      this.filled = filled;
    }

    //------methods---------
    //sets:
    /**
     * set method of if the Bounded Shape is filled with color
     * @param filled boolean value if the shape is filled with color
     */
    public void setFilled(boolean filled)
    {
      this.filled = filled;
    }
      //
    //gets:
    /**
     * get method of if the Bounded Shape is filled with color
     * @return boolean value if the shape is filled with color
     */
    public boolean isFilled()
    {
      return filled;
    } 
      //
    /**
     * get method of the Bounded Shape upper left X coordinate
     * @return int value of the minimun between X1 to X2
     */
    public int getUpperLeftX()
    {
      return Math.min(getX1(), getX2());
    }
    /**
     * get method of a Bounded Shape upper left y coordinate
     * @return int value of the minimum between y1 to y2
     */
    public int getUpperLeftY()
    {
      return Math.min(getY1(), getY2());
    }
    /**
     * get method a Bounded Shape width 
     * @return int value of the width of the shape
     */ 
    public int getWidth()
    {
      return Math.abs(getX2() - getX1());
    }
    /**
     * get method a Bounded Shape height 
     * @return int value of the height of the shape
     */
    public int getHeight()
    {
      return Math.abs(getY2() - getY1());
    } 
    /**
     * draw method which draws the outline a Bounded Shape
     */
    public abstract void draw(Graphics g);
}