public interface Stack<E>{

    //places element onto stack
    public void push(E element);

    //returns and removes top of stack
    public E pop() throws EmptyStackException;

    //returns top of stack
    public E top() throws EmptyStackException;

    //returns height of stack
    public int size();

    //true if empty, false otherwise
    public boolean isEmpty();

} //end
