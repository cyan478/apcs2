import java.util.List;

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
	return _stack[_top--]; //subtract 1 to top LAST
    }

    public static void reverse(List<Integer> L){
	int N = L.size();
	for (int i = 0; i < N; i++)
	    this.push(L.get(i));
	for (int i = 0; i < N; i++)
	    L.set(i, this.pop());
    }


    public static void main(String[] args){
	ArrayStack<Integer> s = new ArrayStack(1000);
	List<Integer> l = {1,2,3,4,5,6};
	s.reverse(l);
	System.out.println(l);
    }
    

} //end
