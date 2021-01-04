import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class DrawFrame extends JFrame
{
    //----------data fields-------
    //buttons:
    private final  DrawPanel DP;

    private final JButton undoButton;
    private final JButton clearButton;
    private final JComboBox<String> colorChoicesComboBox;
    private final JComboBox<String> shapeChoicesComboBox;
    private final JCheckBox filledCheckBox;

    private final String colors [] = {"Black","Blue","Cyan","Dark Gray","Gray","Green", "Light Green", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] ActualColors = {Color.BLACK, Color.BLUE,Color.CYAN, Color.DARK_GRAY,Color.GRAY, Color.LIGHT_GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,Color.YELLOW};
    
    private static final String[] comboShapes = {"Line","Oval","Rectangle"};
  
    private final JLabel statusLabel; //coordinate labal info

    //----------constructors---------
    /**
    * Initializes "Shape Drawings" window ({@link JFrame}).
    * Initializes also a {@link DrawPanel} and his controlPanel ({@link JPanel}) events.
    */
    public DrawFrame()
    {
        //create the panel with the buttons:
        JPanel panel = new JPanel();
        statusLabel = new JLabel("[0,0]");
        DP = new DrawPanel(statusLabel);
        undoButton = new JButton("Undo");
        clearButton = new JButton("Clear");

        //fill the buttons:
        colorChoicesComboBox = new JComboBox<String>(colors);
        shapeChoicesComboBox = new JComboBox<String>(comboShapes);
        filledCheckBox = new JCheckBox("Filled");

        undoButton.addActionListener(this);
        clearButton.addActionListener(this);
        filledCheckBox.addItemListener(this);
        colorChoicesComboBox.addItemListener(this);
        shapeChoicesComboBox.addItemListener(this);

        panel.add(undoButton);
        panel.add(clearButton);
        panel.add(colorChoicesComboBox);
        panel.add(shapeChoicesComboBox);
        panel.add(filledCheckBox);

        add(DP);
        add(statusLabel, BorderLayout.SOUTH);
        add(panel, BorderLayout.NORTH);
   }//end of DrawFram constructor

}
