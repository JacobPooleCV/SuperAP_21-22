public class ListNode
{
  private Object value;
  private ListNode next;
  private ListNode previous;

  public ListNode(Object initValue, ListNode initPrev, ListNode initNext)
  {
    value = initValue;
    next = initNext;
    previous = initPrev;
  }

  public ListNode(Object initValue, ListNode initNext)
  {
    value = initValue;
    next = initNext;
  }

  public ListNode(Object initValue)
  {
    this(initValue, null);
  }

  public void setValue(Object theNewValue)
  {
    value = theNewValue;
  }

  public void setNext(ListNode theNewNext)
  {
    next = theNewNext;
  }

  public void setPrevious(ListNode theNewPrev)
  {
    previous = theNewPrev;
  }

  public Object getValue()
  {
    return value;
  }

  public ListNode getNext()
  {
    return next;
  }

  public ListNode getPrevious()
  {
    return previous;
  }
}
