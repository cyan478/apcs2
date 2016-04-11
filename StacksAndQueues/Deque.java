public interface Deque<E>{

    public void addFirst(E element);

    public void addlast(E element);

    public E removeFirst() throws EmptyDequeException;

    public E removeLast() throws EmptyDequeException;

    public E getFirst() throws EmptyDequeException;

    public E getLast() throws EmptyDequeException;

    public int size();

    public boolean isEmpty();


} //end
