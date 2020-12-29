import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
/**
 * This Class implements the state and behaviour of DrawPanel infrastructure.
 * It inherits from JPanel class.
 */
public class DrawPanel extends JPanel
{
    /* shapes values:
    0 = MyLine
    1 = MyOval
    2 = MyRectangle
    */

    private String statusText; //String containing shape statistic information

    private Random randomNumbers = new Random();

    //-------data fields------
    private MyShape [] shapes; //array containing all shapes
    private int [] shapeCount; //statistic on the number of each shape

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
     * create of each shape in the shapes array a shape by random values
     * @param numberShapes int value of user's input of number of shapes
     */
    public void initShapes(int numberShapes)
    {
        shapes = new MyShape[numberShapes]; //create the array of shape by user's input
        shapeCount = new int[3];
        
        for(int i=0; i<numberShapes; i++)
        {
            //generate values for the shape:
            int randomShapeType =  randomNumbers.nextInt(3);  // generate shape type
            Color randomColor =  new Color(randomNumbers.nextInt(256),randomNumbers.nextInt(256), randomNumbers.nextInt(256));// generate a random color
            boolean randomFilled = randomNumbers.nextBoolean(); //generate if the shape is filled
            int x1 = randomNumbers.nextInt(450); // generate random coordinates-
            int y1 = randomNumbers.nextInt(450);
            int x2 = randomNumbers.nextInt(450);
            int y2 = randomNumbers.nextInt(450);

            shapes[i] = createShape(randomShapeType, randomColor,randomFilled, x1,y1,x2,y2); //x1,x2,y1,y2 -> coordinates
            ++shapeCount[randomShapeType];
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
    private MyShape createShape(int shapeType, Color color, boolean filled, int... coordinates)
    {
        if(coordinates.length != 4)
            return null;

        int x1 = coordinates[0];
        int y1 = coordinates[1];
        int x2 = coordinates[2];
        int y2 = coordinates[3];

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
    {
       super.paintComponent(g);

        for(MyShape myShape : shapes)
            myShape.draw(g);
    }
}