//Create the class Stackq that uses 2 queues to implement a stack.

public class StackQ implements Stack{

    private Queue<E> _main, _temp;
    
    public Stack(){
	_main = new NodeQueue<E>();
	_temp = new NodeQueue<E>();
	_size = 0;
    }

    public int size(){
	return _main.size();
    }
    
    public boolean isEmpty(){
	return size() == 0;
    }

    public E top() throws EmptyStackException{
	if (isEmpty()) throw new EmptyStackException("Empty.");
	return _main.front();
    }

    public E pop() throws EmptyStackException{
	E ans = top();
	_main.dequeue();
	return ans;
    }

    public void push(E val){
        _temp.enqueue(val);
	while (_main.isEmpty())
	    _temp.enqueue(_main.dequeue);
	Queue<E> holder = _main;
	_main = _temp;
	_temp = _holder;
    }

    public String toString(){
	String ans = _main.toString();
	return ans;
    }




} //end
