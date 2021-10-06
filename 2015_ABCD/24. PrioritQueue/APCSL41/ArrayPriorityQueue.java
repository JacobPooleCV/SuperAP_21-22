import java.util.*;

public class ArrayPriorityQueue implements PriorityQueue
{
  public ArrayPriorityQueue()
  {
    items = new ArrayList();
  }

  public void add(Object obj)
  {
    items.add(obj);
  }

  public Object removeMin()
  {
    Object min = peekMin();
    items.remove(min);
    return min;
  }

  public Object peekMin()
  {
    int minIndex = 0;
    for (int i = 1; i < items.size(); i++)
    {
      if (((Comparable)items.get(i)).compareTo(items.get(minIndex)) < 0)
      {
         minIndex = i;
      }
    }
    return items.get(minIndex);
  }

  public boolean isEmpty()
  {
    return items.size() == 0;
  }

  private List items;
}
