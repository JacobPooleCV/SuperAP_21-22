/**
 *  This is the applet class for the Ramblecs game.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ramblecs extends JApplet
     implements ActionListener
{
  private LetterPanel whiteboard;
  private JButton go;

  public void init()
  {
    whiteboard = new LetterPanel();
    whiteboard.setBackground(Color.white);
    go = new JButton("Go");
    go.addActionListener(this);
    Container c = getContentPane();
    c.add(whiteboard, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }

  /**
   *  Processes Go button events.
   */
  public void actionPerformed(ActionEvent e)
  {
    whiteboard.dropCube();
  }
}

