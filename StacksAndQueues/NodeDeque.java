public class NodeDeque <E> implements Deque<E>{

    private NodeDeque<E> _deque;
    private int _size;
    
    public NodeDeque(){
	_size = 0;
      
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public void addFirst(E element){
	if (isEmpty())
	    _deque = 
    }

    public void addlast(E element);

    public E removeFirst() throws EmptyDequeException;

    public E removeLast() throws EmptyDequeException;

    public E getFirst() throws EmptyDequeException;

    public E getLast() throws EmptyDequeException;


} //end
