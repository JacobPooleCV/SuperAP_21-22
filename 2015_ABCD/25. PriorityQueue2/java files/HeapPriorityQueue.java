import java.util.*;

public class HeapPriorityQueue
     implements PriorityQueue
{
  private static final int DFLT_CAPACITY = 1024;
  private Object items[];
  private int numItems;
  private Comparator comparator;

  public HeapPriorityQueue()
  {
    this(DFLT_CAPACITY, null);
  }

  public HeapPriorityQueue(Comparator c)
  {
    this(DFLT_CAPACITY, c);
  }

  public HeapPriorityQueue(int initialCapacity)
  {
    this(initialCapacity, null);
  }

  public HeapPriorityQueue(int initialCapacity, Comparator c)
  {
    items = new Object[initialCapacity + 1];
    comparator = c;
  }

  public boolean isEmpty()
  {
    return numItems == 0;
  }

  public Object peekMin()
  {
    if (numItems == 0)
    {
      throw new NoSuchElementException();
    }

    return items[1];
  }

  public Object removeMin()
  {
    if (numItems == 0)
    {
      throw new NoSuchElementException();
    }

    Object min = items[1];
    items[1] = items[numItems];
    numItems--;
    reheapDown();
    return min;
  }

  public void add(Object obj)
  {
    numItems++;
    if (numItems >= items.length)
      doubleCapacity();
    items[numItems] = obj;
    reheapUp();
  }

  private boolean lessThan(Object obj1, Object obj2)
  {
    if (comparator != null)
      return comparator.compare(obj1, obj2) < 0;
    else
      return ((Comparable)obj1).compareTo(obj2) < 0;
  }

  private void reheapDown()
  {
    // You write this
  }

  private void reheapUp()
  {
	// You write this   
  }

  private void doubleCapacity()
  {
    Object tempItems[] = new Object[2 * items.length - 1];
    for (int i = 0; i <= numItems; i++)
      tempItems[i] = items[i];
    items = tempItems;
  }
}

