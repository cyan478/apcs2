public class ArrayDeque<E> implements Deque<E>{

    private E [] _array;
    private int _size, _capacity;

    private final static int CAPACITY = 1000;

    public ArrayDeque(int capacity){
	_capacity = capacity;
	_array = (E[]) new Object[_capacity];
	_size = 0;
    }
    
    public ArrayDeque(){
	this(CAPACITY);
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public E getFirst() throws EmptyDequeException{
	if (isEmpty()) 
	    throw new EmptyDequeException("Empty");
	return _array[0];
    }

    public E getLast() throws EmptyDequeException{
	if (isEmpty())
	    throw new 
    }
    
    public void addFirst(E element);

    public void addlast(E element);

    public E removeFirst() throws EmptyDequeException;

    public E removeLast() throws EmptyDequeException;

    public boolean offerFirst(E element);

    public boolean offerLast(E element);

    public E pollFirst();

    public E pollLast();

    public E peekFirst();

    public E peekLast();








} //end
