import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class CBTest
{
  public static void main(String[] args)
  {
    Environment env = new BoundedEnv(20, 20);
    CBEnvDisplay display = new CBEnvDisplay(env);

    createFrame(display, 20, 20);

  ////////////////////// Remove the sample code and put your code here //////

    env.add(new ColorBlock(new Location(4,4), Color.blue));
    ColorBlock cb = new ColorBlock(new Location(9,9), Color.red);
    env.add(cb);
    env.add(new ColorBlock(new Location(14,14), Color.green));

    display.showEnv();
    System.out.println(env);

    try
    { Thread.sleep(2000);
    }
    catch(InterruptedException ex){}

    env.remove(cb);
    display.showEnv();
    System.out.println(env);
  }


  private static void createFrame(JPanel display, int xCoord, int yCoord)
  {
    int width = (int)Math.round((display).getSize().getWidth());
    int height = (int)Math.round((display).getSize().getHeight());

    JFrame frame = new JFrame();
    frame.show();

    width = width + frame.getInsets().right + frame.getInsets().left;
    height = width + frame.getInsets().top + frame.getInsets().bottom;

    frame.setSize(width,height);
    frame.setLocation(xCoord, yCoord);

    frame.getContentPane().add(display);
    frame.show();
  }

}