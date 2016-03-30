public class NodeStack<E> implements Stack<E>{

    private int _size;
    private Node<E> _stackHead;
    private Node<E> _stackTail;

    public NodeStack(){
	_size = 0;
	_stackHead = null;
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public void push(E value){
	_stackHead = new Node<E>(value, _stackHead);
	if (isEmpty())
	    _stackTail = _stackHead;
	_size++;
    }
    
    public E top() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Stack is empty");
	return _stackHead.getValue();
    }

    public E pop() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Stack is empty");
	Node<E> curr = _stackTail;
	for (int i = 0; i < size()-1; i++)
	    curr = curr.getNext();
	curr = _stackHead;
	Node<E> originalHead = curr.getNext();
        originalHead = null;
	return curr.getValue();
    }

  public String toString(){
        String ans ="[";
        if (size() > 0) ans += _stackHead.getValue();
        if (size() > 1) {
	    Node<E> curr = _stackHead.getNext();
            for (int i = 1; i < size(); i++){
                ans += ", " + curr.getValue();
		curr = curr.getNext();
	    }

	}
        ans += "]";
        return ans;
    }

}
