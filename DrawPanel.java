import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * This Class implements the state and behaviour of DrawPanel infrastructure.
 * It inherits from JPanel class.
 */
public class DrawPanel extends DrawFrame
{
    final static int numberOfShapes = 100; //100 is a default number of maxium shapes

    private String statusText; //String containing shape statistic information

    //-------data fields------
    private MyShape [] shapes = new MyShape[numberOfShapes];
    private int shapesCount = 0; //statistic on the number of each shape

    private int x1,y1,currentX1,currentY1 = 0; //coordinates
    private int shapeType = 0; // 0=Line,1=Oval,2=Rectangle
    private MyShape currentShape; // array containing all the shapes
    private Color currentColor; // the color of the shape
    private boolean filled;

    private final JLabel statusBar;
    private String statusTxt;
    private JFrame erorFrame; //PopUP frame when the number of shapes reach to max shapes

    //------constructors-------
    /**
     * constructor of DrawPanel with the user's input of number of shapes
     * @param numberShapes int value of user's input of number of shapes
     */
    public DrawPanel(int numberShapes)
    {
        setBackground(Color.WHITE);
        initShapes(numberShapes);
    }

    //-------methods--------
    /**
     * 
     * @param shapeType the value of shape's type
     * @param color the value of shape's color
     * @param isFilled the value of shape if it is filled
     * @param x1 the values of shape's coordinate
     * @param y1 the values of shape's coordinate
     * @param x2 the values of shape's coordinate
     * @param y2 the values of shape's coordinate
     */
    public void initShapes(int shapeType, Color color, boolean isFilled, int x1, int y1, int x2, int y2)
    {

        shapes[shapesCount] = createShape(shapeType, color,isFilled, x1,y1,x2,y2); 
        shapesCount++;
            
    }

        statusText = String.format("%s: %d, %s: %d, %s: %d", "Lines", shapeCount[0], "Ovals", shapeCount[1],"Rectangles", shapeCount[2]);
    }
    /**
     * create shape by getting the values
     * @param shapeType the value of shape's type
     * @param color the value of shape's color
     * @param filled the value of shape if it is filled
     * @param coordinates the values of shape's coordinates
     * @return MyShape shape 
     */
    private MyShape createShape(int shapeType, Color color, boolean filled, int x1, int y1, int x2, int y2)
    {
        switch (shapeType) {
            case 0: //MyLine
                return (new MyLine(x1, y1, x2, y2, color));

            case 1: //MyOval
                return (new MyOval(x1, y1, x2, y2, color,filled));

            case 2: //MyRectangle
                return (new MyRectangle(x1, y1, x2, y2, color,filled));

            default:
                return null;
        }
    }
    /**
     * get method of the status text
     * @return String values of the status text
     */
    public String getLabelText() // returns a String containing shape statistics on this panel
    {
      return statusText;
    }
    /**
     * draw every shape in shapes array
     */   
    public void paintComponent(Graphics g)
    {   //1-22:00
       super.paintComponent(g);

        for(MyShape myShape : shapes)
            myShape.draw(g);
    }

    public void clearDraw()
    {
        repaint();
    }
    public void BtnUndo()
    {

    }

    /*public class MouseHandler extends MouseAdapter implements MouseMotionListener 
    {
        public void MouseMotionListener()
        {

        }
    }*/
}