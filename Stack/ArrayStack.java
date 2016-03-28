public class ArrayStack<E> implements Stack<E>{

    private E[] _stack;
    private int _capacity; //not size, capacity = array.length
    private int _top; //index position of top of stack
    
    public final int CAPACITY = 1000;

    public ArrayStack(int capacity){
	_stack = (E[]) new Object[capacity];
	_capacity = capacity;
	_top = -1;
    }

    public int size(){
	return _top + 1;
    }
    
    public boolean isEmpty(){
	return size() == 0;
    }
    
    public void push (E element) throws FullStackException{
	if (size() == capacity) throw new FullStackException("Stack is full");
	_stack[++_top] = element; //add 1 to top FIRST
    }

    public E top() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Stack is empty");
	return _stack[_top];
    }

    public E pop() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Stack is empty");
	return _stack[_top--]; //subtract 1 to top LAST
    }
    
    

} //end
