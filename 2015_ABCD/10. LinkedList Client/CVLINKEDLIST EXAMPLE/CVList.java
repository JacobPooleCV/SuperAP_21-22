public interface CVList
{
	int size();
	boolean add(Object o);
	void add(int index, Object o);
	Object get(int index);
	Object remove(int index);
	Object set(int index, Object element);
}