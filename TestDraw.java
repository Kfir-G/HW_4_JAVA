import javax.swing.*;
/**
 * This class implements the state and behaviour of the TestDraw.
 *  This class include a Main.
 */
public class TestDraw
{
    /**
	 * static main method which handle user's input and handle the draw pannel
	 */
    public static void main(String[] args)
    {
        //Initializes the DrawFrame window
        DrawFrame drawFrame = new DrawFrame();
        drawFrame.setTitle("Shapes Drawings");
        drawFrame.setSize(500, 500);
        drawFrame.setVisible(true);
        drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}