import java.util.ArrayList;

public class ArrayListStack implements Stack<E>{

    private ArrayList<E> _stack;
    private int _top;

    public ArrayListStack(){
	_stack = new ArrayList<E>();
	_top = -1;
    }

    public int size(){
	return _top + 1;
    }

    public boolean isEmpty(){
	return size() == 0;
    }
    
    public void push(E value){
	_top++;
	_stack.add(value); //O(1)
    }

    //O(1)
    public E top() throws EmptyStackException{
	if (isEmpty()) 
	    throw new EmptyStackException("Empty stack");
	return _stack.get(_top);
    }

    public E pop() throws EmptyStackException{
	if (isEmpty()) 
	    throw new EmptyStackException("Empty stack");
	return _stack.remove(_top--, null);
    }
    

    public String toString(){
	return _stack.toString();
    }

    public static void main(String [] args){
	Stack<Integer> s = new ArrayListStack<Integer>();
    }




} //end
