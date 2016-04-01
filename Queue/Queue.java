public interface Queue<E>{

    public void enqueue(E element);

    public E dequeue();

    public int size();

    public boolean isEmpty();

    public E front();

} //end
