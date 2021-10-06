/**
 *  Implements a falling letter cube for the Ramblecs game
 */
import java.awt.*;

public class FallingCube
{
  private final int xLeft;      // Left margin for cubes
  private final int cubeSize;
  private int cubeX, cubeY;     // Cube coordinates (upper left corner)
  private int yStep;            // Distance (in pixels) to move down
                                //   in one timer cycle
  private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private char randomLetter;    // Cube letter

  public FallingCube(int size,int horpos)
  {
    cubeSize = size;
    xLeft = horpos;
    yStep = cubeSize / 8;
    cubeX = -cubeSize;          // off the board --
    cubeY = -cubeSize;          //   not displayed
  }

  public void start()
  {
    int i = (int)(Math.random() * letters.length());
    randomLetter = letters.charAt(i);
    cubeX = 0;
    cubeY = -cubeSize;         // above the board for smooth entry
  }

  public boolean moveDown()
  {
    if (cubeY < 6 * cubeSize)  // board's height is 7 * cubesize
    {
      cubeY += yStep;
      return true;
    }
    else  // land this cube:
    {
      return false;
    }
  }

  public void draw(Graphics g)
  {
    int x = xLeft + cubeX;
    int y = cubeY;

    g.setColor(Color.red);
    g.fill3DRect(x, y, cubeSize-1, cubeSize-1, true);
    g.setColor(Color. white);
    g.fillRoundRect(x + 5, y + 5, cubeSize - 10, cubeSize - 10,
                                  cubeSize/2 - 5, cubeSize/2 - 5);
    g.setColor(Color.darkGray);
    String s = String.valueOf(randomLetter);
    g.drawString(s, x + cubeSize/2 - 6, y + cubeSize/2 + 5);
  }
}

