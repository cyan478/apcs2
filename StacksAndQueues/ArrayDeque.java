public class ArrayDeque<E> implements Deque<E>{

    private E [] _array;
    private int _head, _tail;
    private int _size, _capacity;

    private final static int CAPACITY = 1000;

    public ArrayDeque(int capacity){
	_capacity = capacity;
	_array = (E[]) new Object[_capacity];
	_size = 0;
	_head = 0;
	_tail = 1;
    }
    
    public ArrayDeque(){
	this(CAPACITY);
    }

    private static int floorMod(double n, double d){
	return (int)(n - d*Math.floor(n/d));
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
	return _array[floorMod(_head,_capacity)]; //mod?
    }

    public E getLast() throws EmptyDequeException{
	if (isEmpty())
	    throw new EmptyDequeException("Empty");
	return _array[floorMod(_tail,_capacity)];
    }
    
    public void addFirst(E element) throws FullDequeException{
        if (_head == _tail)
	    throw new FullDequeException("Full");
	int modded = floorMod(_head,_capacity);
	_array[modded] = element;
	_head--;
	_size++;
    }

    public void addLast(E element) throws FullDequeException{
	if (_head == _tail)
	    throw new FullDequeException("Full");
	int modded = floorMod(_tail, _capacity);
	_array[modded] = element;
	_tail++;
	_size++;
    }

    public E removeFirst() throws EmptyDequeException{
	E ans = getFirst(); //takes care of exception
	_head++;
	_size--;
	return ans;
    }

    public E removeLast() throws EmptyDequeException{
	E ans = getLast();
	_tail--;
	_size--;
	return ans;
    }

    public boolean offerFirst(E element){
	if (_head == _tail)
	    return false;
	addFirst(element);
	return true;
    }

    public boolean offerLast(E element){
	if (_head == _tail)
	    return false;
	addLast(element);
	return true;
    }

    public E pollFirst(){
	if (isEmpty())
	    return null;
	return removeFirst();
    }

    public E pollLast(){
	if (isEmpty())
	    return null;
	return removeLast();
    }

    public E peekFirst(){
	if (isEmpty()) 
	    return null;
	return getFirst();
    }

    public E peekLast(){
	if (isEmpty())
	    return null;
	return getLast();
    }








} //end
