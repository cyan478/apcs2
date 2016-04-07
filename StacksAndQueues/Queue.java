public interface Queue<E>{

    public void enqueue(E element);

    public E dequeue() throws EmptyQueueException;

    public int size();

    public boolean isEmpty();

    public E front() throws EmptyQueueException;

} //end
