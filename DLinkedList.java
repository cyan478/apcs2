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
    
    //***************************************** add Last
    public void addLast(DNode x){
	addBefore(_trailer,x);
    }

    public void addLast(String value){
	addLast(new DNode(value,null,null));
    }

    // inserts node b after node a
    // throw exception if a is the trailer node
    public void addAfter(DNode a, DNode b){
	DNode next = getNext(a); //getNext(x) method
        b.setNext(next);
	next.setPrevious(b);
	b.setPrevious(a);
	a.setNext(b);	    
    }

    //***************************************** add First
    public void addFirst(DNode current){
	addAfter(_header,current);
    }

    public void addFirst(String value){
	addFirst(new DNode(value,null,null));
    }

    // postcondition: returns the ith String in the list.
    //                get(0) is the first string
    //                get(size() - 1) is the last string
    //                Throw an exception if index < 0 || index >= size()
    public String get(int i){
	if (i < 0 || i >= size()) throw new IllegalArgumentException();
	Node current = getFirst();
	for (int j = 0; j <= i; j++)
	    if (j != i)
		current = current.getNext();
	    else
		return current.getValue();
    }

    //precondition: v != null and v refers to a node in the list
    //postconditon: removes the node v refers to. v is completely unlinked
    //              from the list.
    //              Throws exception if v is header or trailer.
    public void remove(DNode v){
	if (v == _header || v == _trailer) throw new IllegalArgumentException();
	Node afterV = v.getNext();
	Node beforeV = v.getPrevious();
	beforeV.setNext(afterV);
	afterV.setPrevious(beforeV); 
    }

    // postcondition: removes the first Node and returns its string.
    //                Throws an exception if the list is empty.   
    public String removeFirst(){
	if (isEmpty()) throw new IllegalArgumentException();
	String first = getFirst.getValue();
	Node afterFirst = getFirst.getNext();
	_header.setNext(afterFirst);
	afterFirst.setPrevious(_header);
	return first;
    }

    // postcondition: removes the last node and returns its string.
    // 		      Throws an exception if the list is empty.
    public String removeLast(){
	if (isEmpty()) throw new IllegalArgumentException();
	String last = getLast.getValue();
	Node beforeLast = getLast.getPrevious();
	_trailer.setPrevious(beforeLast);
        beforeLast.setNext(_trailer);
	return last;
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
