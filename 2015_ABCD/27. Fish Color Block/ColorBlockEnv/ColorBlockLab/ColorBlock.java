import java.awt.Color;

public class ColorBlock implements Locatable
{
  private Location myLoc;
  private Color myColor;

  public ColorBlock(Location loc, Color col)
  { myLoc = loc;
    myColor = col;
  }

  public Location location()
  { return myLoc;
  }

  public Color color()
  { return myColor;
  }

  public String toString()
  {
    return "CB " + color() + " " + location();
  }
}


