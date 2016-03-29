public class Node<E>{

    private E _value;
    private Node<E> _next;

   
    public Node (E val, Node<E> next){
	_value = val;
	_next = next;
    }

    public E getValue(){
	return _value;
    }

    public Node<E> getNext(){
	return _next;
    }

    public Node<E> setNext(Node t){
	Node ans = _next;
	_next = t;
	return ans;
    }


    public String toString(){
	return _value;
    }

}
