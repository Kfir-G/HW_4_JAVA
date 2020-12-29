import java.awt.Color;
import java.awt.Graphics;
/**
 * This Class implements the state and behaviour of Line infrastructure.
 * It inherits from MyShape class.
 */
public class MyLine extends MyShape
{
    //------constructors-------
    /**
     * MyLine no-argument constructor, initializes vales data to 0 and color to black
     * Call to super(MyShape) constructor
     */
    public MyLine()
    {
        super(); 
    }
    /**
     * MyLine constructor with parameters
     * @param x1 the value of X of the first dot
     * @param y1 the value of y of the first dot
     * @param x2 the value of X of the second dot
     * @param y2 the value of y of the second dot
     * @param myColor the value of the shape's colo
     */
    public MyLine(int x1, int y1, int x2, int y2, Color myColor)
    {
        super(x1,y1,x2,y2,myColor);
    }

    //------methods---------
    /**
     * draw method which draws the outline a line
     */
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}