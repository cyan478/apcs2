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
	if (_main.isEmpty()) _main.enqueue(val);
	else{
	    while (!_main.isEmpty()){
		_temp.enqueue(_main.dequeue());
	    }
	    _main.enqueue(val);
	    while (!_temp.isEmpty())
		main.enqueue(_temp.dequeue());
	}
    }

    public String toString(){
	String ans = _main.toString();
	return ans;
    }




} //end
