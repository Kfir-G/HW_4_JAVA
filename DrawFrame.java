import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class DrawFrame extends JFrame
{
    private final JButton undoBTN; 

    public buttonFrame()
    {
        undoBTN = new JButton("Undo");
        add(undoBTN);
        ButtonHandler handler = new ButtonHandler();
        undoBTN.addActionListener(handler);

        private class ButtonHandler implements ActionListener
        {
            @Override
            public void actionPerfomed(ActionEvent event){
                JOptionPane.showMessageDialog(ButtonFrame.this,String.Format("asa"),event.getActionCommand());
            }
        }
    }

}
