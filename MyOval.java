import java.awt.Color;
import java.awt.Graphics;
/**
 * This Class implements the state and behaviour of MyBoundedShape infrastructure.
 * It inherits from MyBoundedShape class.
 */
public class MyOval extends MyBoundedShape
{
    //------constructors-------
    /**
     * MyOval no-argument constructor, initializes vales data to 0 and color to black
     * Call to super(MyBoundedShape) constructor
     */
    public MyOval()
    {
        super(); 
    }
    /**
     * MyOval constructor with parameters
     * @param x1 the value of X of the first dot
     * @param y1 the value of y of the first dot
     * @param x2 the value of X of the second dot
     * @param y2 the value of y of the second dot
     * @param myColor the value of the shape's color
     * @param filled boolean value if the shape is filled with color
     */
    public MyOval(int x1, int y1, int x2, int y2, Color myColor, boolean filled)
    {
        super(x1,y1,x2,y2,myColor,filled);
    }

    //------methods---------
    /**
     * draw method which draws the outline an oval
     */
    public void draw(Graphics g)
    {
      g.setColor(getColor());
      
      if (isFilled())
        g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      else
        g.drawOval(getUpperLeftX(), getUpperLeftY(),getWidth(), getHeight());
    }
}