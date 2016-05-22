public class DNode<E>{

    private E _value;
    private DNode _previous, _next;

    //constructor
    public DNode(E value, DNode previous, DNode next){
	_value = value;
	_previous = previous;
	_next = next;
    }

    //accessors
    public E getValue(){
	return _value;
    }

    public DNode getPrevious(){
	return _previous;
    }

    public DNode getNext(){
	return _next;
    }

    //modifiers
    public E setValue(E value){
        E ans = getValue();
	_value = value;
	return ans;
    }

    public DNode setPrevious(DNode previous){
        DNode ans = getPrevious();
	_previous = previous;
	return ans;
    }

    public DNode setNext(DNode next){
        DNode ans = getNext();
	_next = next;
	return ans;
    }

} //end
