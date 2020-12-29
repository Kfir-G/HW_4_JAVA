import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import javax.swing.*;
/**
 * This abstract Class implements the state and behaviour of Shape infrastructure.
 */
public abstract class MyShape 
{
    //------data fields------
    private int x1; // x coordinate of first endpoint
    private int y1; // y coordinate of first endpoint
    private int x2; // x coordinate of second endpoint
    private int y2; // y coordinate of second endpoint
    private Color myColor; // color of this shape

    //------constructors-------
    /**
     * MyShape no-argument constructor, initializes coordinates to 0 and color to black
     */
    public MyShape()
    {
      this(0, 0, 0, 0, Color.BLACK); // call constructor to set values
    }
    /**
     * MyShape constructors with parameters
     * @param x1 the value of X of the first dot
     * @param y1 the value of y of the first dot
     * @param x2 the value of X of the second dot
     * @param y2 the value of y of the second dot
     * @param myColor the value of the shape's color
     */
    public MyShape(int x1, int y1, int x2, int y2, Color myColor)
    {
      this.x1 = (x1 >= 0 ? x1 : 0);
      this.y1 = (y1 >= 0 ? y1 : 0);
      this.x2 = (x2 >= 0 ? x2 : 0);
      this.y2 = (y2 >= 0 ? y2 : 0);
      this.myColor = myColor; 
    }  

    //------methods---------
    //gets:
    /**
     * get method of the x1 value of the shape
     * @return the X1 value of the first dot
     */
    public int getX1()
    {
      return x1;
    }
    /**
     * get method of the x2 value of the shape
     * @return the X2 value of the second dot
     */ 
    public int getX2()
    {
      return x2;
    }
    /**
     * get method of the y1 value of the shape
     * @return the y1 value of the first dot
     */
    public int getY1()
    {
      return y1;
    }
    /**
     * get method of the y2 value of the shape
     * @return the y2 value of the second dot
     */
    public int getY2()
    {
      return y2;
    }
    /**
     * get method of the shape's color
     * @return the color of the shape
     */
    public Color getColor()
    {
      return myColor;
    } 
        //
    //sets:
    /**
     * set method for x1 coordinate
     * @param x1 the value of the first X coordinate 
     */
    public void setX1(int x1)
    {
      this.x1 = (x1 >= 0 ? x1 : 0);
    } 
    /**
     * set method for x2 coordinate
     * @param x2 the value of the second X coordinate
     */
    public void setX2(int x2)
    { 
      this.x2 = (x2 >= 0 ? x2 : 0);
    }
    /**
     * set method for y1 coordinate
     * @param y1 the value of the first X coordinate
     */ 
    public void setY1(int y1)
    {
      this.y1 = (y1 >= 0 ? y1 : 0);
    } 
    /**
     * set method for y2 coordinate
     * @param y2 the value of the second Y coordinate
     */
    public void setY2(int y2)
    {
      this.y2 = (y2 >= 0 ? y2 : 0);
    } 
    /**
     * set method of the shape's color
     * @param myColor the color of the shape
     */
    public void setColor(Color myColor)
    {
      this.myColor = myColor;
    } 
      //
    //abstract methods:
    public abstract void draw(Graphics g);
}