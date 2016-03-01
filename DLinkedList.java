public class DLinkedList{

    private int _size;
    private DNode _header, _trailer;

    public DLinkedList(){
	_size = 0;
	_header = new DNode(null,null,null);
	_trailer = new DNode(null,_header,null);
	_header.setNext(_trailer);
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public DNode getFirst(){
	if (isEmpty()) throw new IllegalStateException();
	return _header.getNext();
    }

    public DNode getLast(){
	if (isEmpty()) throw new IllegalStateException();
	return _trailer.getPrevious();
    }

    public DNode getPrevious(DNode current){
	if (current == _header) 
	    throw new IllegalArgumentException("cannot move back of header");
	return current.getPrevious();
    }

    public DNode getNext(DNode current){
	if (current == _trailer)
	    throw new IllegalArgumentException("cannot move forward of trailer");
	return current.getNext();
    }

    //precond: b refers to a node in the list
    //         throws an exception if b is the _header
    //postcond: inserts node a before node b
    public void addBefore(DNode b, DNode a){
        DNode prev = getPrevious(b); //uses getPrevious(x) method
	prev.setNext(a);
	a.setPrevious(prev);
	a.setNext(b);
	b.setPrevious(a);
	_size++;
    }

    public void addLast(DNode x){
	addBefore(_trailer,x);
    }

    public void addLast(String value){
	addLast(new DNode(value,null,null));
    }

    //postcond: [] if list is empty
    //          [a ] if one element
    //          [a, b, c ] 3 elements
    public String toString(){
	String ans = "[";
	DNode current = _header;
	for (int i = 0; i < size()-1; i++)
	    ans += current.getNext() + ", ";
	ans += _trailer.getPrevious().getValue() + " ";
	ans += "]";
	return ans;
    }



    public static void main(String[] args){
	DLinkedList L = new DLinkedList();
	System.out.println("size: " + L.size());
	L.addLast("Jane");
	L.addLast("Yay");
	System.out.println(L);
    }

    

} //end
