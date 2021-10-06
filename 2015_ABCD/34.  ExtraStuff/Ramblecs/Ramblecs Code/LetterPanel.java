/**
 *  Implements a panel on which "letter cubes" fall
 *  in the Ramblecs applet
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LetterPanel extends JPanel
      implements ActionListener
{
  private FallingCube cube;
  private final int CUBESIZE = 40;
  private final int delay = 30;
  private Timer t;

  public LetterPanel()
  {
    cube = new FallingCube(CUBESIZE,0);
    t = new Timer(delay, this);
  }

  public void dropCube()
  {
    cube.start();
    t.start();
  }

  /**
   *  Processes timer events
   */
  public void actionPerformed(ActionEvent e)
  {
    boolean moved = cube.moveDown();
    if (!moved)  // "If not moved... "
    {
      t.stop();
    }
    repaint();
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g); // call JPanel's paintComponent
    cube.draw(g);
  }
}
