public class ArrayQueue<E>{

    private E[] _queue;
    private int _front;
    private int _rear;
    private int _capacity;
    private int _size;

    private final static int CAPACITY = 4;
    
    public ArrayQueue(int capacity){
	_queue = (E[]) new Object[capacity];
	_front = 0;
	_rear = 0;
	_size = 0;
	_capacity = capacity;
    }

    public ArrayQueue(){
        this(CAPACITY);
    }
    
    public void enqueue(E element) throws FullQueueException{
	if (size() == _capacity) throw new FullQueueException("Full");
	_queue[_rear] == element;
	_rear = (1+_rear)%_capacity;
	size++;
    }

    public E dequeue() throws EmptyQueueException{
	E ans = front();
	queue[_front] = null; //release it
	_front = (1+_rear)%_capacity; //readjust _front
	_size++;
	return ans;
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty();{
	return size() == 0;
    }

    public E front() throws EmptyQueueException{
	if (isEmpty()) throw new EmptyQueueException("Empty");
	return _queue[_front];
    }


} //end
