public class NodeQueue<E> implements Queue<E>{

    private int _size;
    private Node<E> _front, _rear;
    
    public NodeQueue(){
        _size = 0;
	_front =  _rear = null;
    }

    public void enqueue(E element){
	Node<E> newNode = new Node<E>(element, _rear);
	if (isEmpty()) 
	    _front = newNode;
	_rear = newNode;
	_size++;
    }

    public E dequeue() throws EmptyQueueException{
        E ans = front();
	Node<E> temp = _front;
	_front = _front.getNext();
	_size--;
	if(isEmpty()) _rear = null;
	temp.setNext(null);
	return ans;
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public E front() throws EmptyQueueException{
	if (isEmpty()) throw new EmptyQueueException("Empty");
	return _front.getValue();
    }

    public String toString(){
	String ans = "[";
	Node<E> cursor = _front;
	for (int i = 0; i < size(); i++){
	    ans += cursor.getValue();
	    cursor = cursor.getNext();
	}
	ans += "]";
	return ans;
    }

    public static void main(String[] args){
	NodeQueue<Integer> test = new NodeQueue<Integer>();
	test.enqueue(1);
	test.enqueue(2);
	test.enqueue(3);
	test.dequeue();
	test.enqueue(4);
	test.enqueue(5);
	test.dequeue();
	System.out.println(test);
    }

    
} //end
