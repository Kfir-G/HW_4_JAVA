import java.awt.BorderLayout;
import java.util.*;
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
        Scanner scanner = new Scanner(System.in); 
        JFrame application = new JFrame();
        String input = null; //default
        int inputUser = -1; //default

        try {
            input = (JOptionPane.showInputDialog(null, "Enter Number of shapes:"));
            if(input == null)
                System.exit(1); //EXIT
            inputUser = Integer.parseInt(input);
        }
        catch(NumberFormatException e2){
            JOptionPane optionPane =new JOptionPane( String.format("Invalid number: "+input), JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Error");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            System.exit(1);
        }
        DrawPanel panel = new DrawPanel(inputUser);

        JLabel statusLabel = new JLabel(panel.getLabelText()); // create a JLabel containing the shape information

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); // add drawing to CENTER by default
        application.add(statusLabel, BorderLayout.SOUTH); // add the status label to the SOUTH (bottom) of the frame
        application.setSize(500, 500);
        application.setVisible(true);
    }
}