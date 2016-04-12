public class NodeDeque<E> implements Deque<E>{

    private DNode<E> _head, _tail;
    private int _size;
    
    public NodeDeque(){
	_head = new DNode<E>(null,null,null);
	_tail = new DNode<E>(null,_head,null);
	_head.setNext(_tail);
	_size = 0;
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public E getFirst() throws EmptyDequeException{
	if (isEmpty()) throw new EmptyDequeException("Empty");
	return _head.getNext().getValue();
    }

    public E getLast() throws EmptyDequeException{
	if (isEmpty()) throw new EmptyDequeException("Empty");
	return _tail.getPrevious().getValue();
    }


    public void addFirst(E val){
	DNode<E> n = new DNode(val, _head, _head.getNext());
	n.getNext().setPrevious(n);
	head.setNext(n);
	_size++;
    }

    public void addlast(E element){
	DNode<E> n = new DNode(val, _tail.getPrevious, _tail);
	n.getPrevious().setNext(n);
        tail.setPrevious(n);
	_size++;
    }

    public E removeFirst() throws EmptyDequeException{
        E ans = getFirst();
	DNode<E> temp = _head.getNext();
	_head.setNext(temp.getNext());
	temp.getNext().setPrevious(_head);
	temp.setPrevious(null);
	temp.setNext(null);
	_size--;
	return ans;
    }

    public E removeLast() throws EmptyDequeException{
	
    }

    public boolean offerFirst(E element){
	addFirst(e);
	return true;
    }

    public boolean offerLast(E element){
	addLast(e);
	return true;
    }

    public E pollFirst(){
	if (isEmpty()) return null;
	return removeFirst();
    }

    public E pollLast(){
	if (isEmpty()) return null;
	return removeLast();
    }

    public E peekFirst(){
	if (isEmpty()) return null;
	return getFirst();
    }

    public E peekLast(){
       	if (isEmpty()) return null;
	return getLast();
    }

} //end
