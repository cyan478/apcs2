public class ArrayStack<E> implements Stack<E>{

    private E[] _stack;
    private int _capacity; //not size, capacity = array.length
    private int _top; //index position of top of stack
    
    public static final int CAPACITY = 1000;

    public ArrayStack(int capacity){
	_stack = (E[]) new Object[capacity];
	_capacity = capacity;
	_top = -1;
    }

    public ArrayStack(){
	this(CAPACITY);
    }

    //O(1)
    public int size(){
	return _top + 1;
    }

    //O(1)
    public boolean isEmpty(){
	return size() == 0;
    }

    //O(1)
    public void push (E element) throws FullStackException{
	if (size() == CAPACITY) throw new FullStackException("Stack is full");
	_stack[++_top] = element; //add 1 to top FIRST
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

    public void transferTo(ArrayStack<E> rhs){
	while (!this.isEmpty() && (rhs.size() < rhs._capacity))
	    rhs.push(this.pop());
    }

    public static void main(String[] args){

    }


} //end
