public class NodeStack<E> implements Stack<E>{

    private Node<E> _ top;
    private int _size;
   

    public NodeStack(){
        _top = null;
	_size = 0;
    }

    //O(1)
    public int size(){
	return _size;
    }

    //O(1)
    public boolean isEmpty(){
	return size() == 0;
    }

    //O(1)
    public void push (E value) throws FullStackException{
	    _top = new Node<E>(value, _top);
	_size++;
	
    }

    //O(1)
    public E top() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Stack is empty");
	return _stack[_top];
    }

    //O(1)
    public E pop() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Stack is empty");
	E ans = top();
	_stack[_top--] = null; //sets _stack[top] to null, decrements by 1
	return ans;
    }

} //end
