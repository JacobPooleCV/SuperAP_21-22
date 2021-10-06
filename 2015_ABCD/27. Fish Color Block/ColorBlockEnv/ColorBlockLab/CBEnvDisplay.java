
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class CBEnvDisplay extends JPanel
{
  private JButton[][] cellGrid;
  private static final int MAXDIM = 50;
  private int myNumRows;
  private int myNumCols;

  private Environment myEnv;

  public CBEnvDisplay(Environment env)
  {
    myEnv = env;

    setBackground(Color.white);

    myNumRows = env.numRows();
    myNumCols = env.numCols();
    int cellSize = cellDim();

    setSize(numRows() * cellSize, numCols() * cellSize);
    setLayout(new GridLayout(numRows(), numCols()));

    cellGrid = new JButton[numRows()][numCols()];
    for(int row = 0; row < numRows(); row++){
      for(int col = 0; col < numCols(); col++){
        cellGrid[row][col] = new JButton();
        cellGrid[row][col].setBackground(Color.white);
        cellGrid[row][col].setBorder(BorderFactory.createLineBorder(Color.black));
        cellGrid[row][col].setPreferredSize(new Dimension(cellSize, cellSize));
        add(cellGrid[row][col]);
      }
    }
  }

  private int numRows()
  { return myNumRows;
  }

  private int numCols()
  { return myNumCols;
  }

  private Environment environment()
  { return myEnv;
  }

  private int cellDim()
  {
    int numCells;
    if(numRows() < numCols())
      numCells = numCols();
    else
      numCells = numRows();

    if(numCells > MAXDIM)
      throw new IllegalArgumentException("grid too large");

    return 2 * (250/numCells);
  }

  public void showEnv()
  {
    clearAll();

    Locatable[] CBList = environment().allObjects();
    for(int k = 0; k < CBList.length; k++)
    { ColorBlock cb = (ColorBlock)CBList[k];
      setCellColor(cb.location(), cb.color());
    }
  }

  private void setCellColor(Location loc, Color color)
  {
    cellGrid[loc.row()][loc.col()].setBackground(color);
  }

  private void clearAll()
  {
    for(int row = 0; row < numRows(); row++)
      for(int col = 0; col < numCols(); col++)
        cellGrid[row][col].setBackground(Color.white);
  }

}