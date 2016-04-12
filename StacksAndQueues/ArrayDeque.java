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
	    throw new EmptyDequeException("Empty");
	return _array[_capacity-1];
    }
    
    public void addFirst(E element) throws FullDequeException{
        if (size() == _capacity-1)
	    throw new FulldequeException("Full");
	for (int i = size; i > 0; i--)
	    _array[i+1] = _array[i];
	_array[0] = element;
    }

    public void addlast(E element){
	if (size() == _capacity-1)
	    throw new FullDequeException("Full");
	_array[size+1] = element;
    }

    public E removeFirst() throws EmptyDequeException{
	E ans = getFirst(); //takes care of exception
	for (int i = 0; i < size; i++){
	    _array[i] = _array[i+1];
	}
	return ans;
    }

    public E removeLast() throws EmptyDequeException{
	E ans = getLast();
	_array[size] = null;
	return ans;
    }

    public boolean offerFirst(E element){
	
    }

    public boolean offerLast(E element);

    public E pollFirst();

    public E pollLast();

    public E peekFirst();

    public E peekLast();








} //end
