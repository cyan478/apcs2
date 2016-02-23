public class SLinkedList{

    private Node _head, _tail;
    private int _size;

    public SLinkedList(){
	_head = _tail = null;
	_size = 0;
    }
    
    public int size(){
	return _size;
    }

    public void addFirst(String value){
	if (_size ==0)
	    _head = _tail = new Node(value, null);
	else
	    _head = new Node(value, _head); //precedence levels, don't need temp
	_size++;
    }
    
    public void addLast(String value){
	if (_size == 0) 
	    addFirst(value);
	else{
	    Node last = new Node(value, null); //creates the new node
	    _tail.setNext(last); //_tail gets ^ that address
	    _tail = last; //_tail refers to last node
	    _size++;
	}
    }

    public String removeFirst(){
	if (size() == 0) throw new IllegalStateException();
	Node first = _head; //create copy/temp of _head
        if (size() == 1) 
	    _head = _tail = null; //release it, set to null
	if (_head != null)
	    _head = _head.getNext(); //set _head to the next Node
	_size--;
	return first.getValue(); //returns the string of the temp
    }

    public String removeLast(){
	if (_size <= 1) return removeFirst();
	
    }

    //O(n)
    public String toString(){
	String ans = "";
	Node current = _head;
	for (int i = 0; i < _size; i++){
	    ans += current.getValue()+" ";
	    current = current.getNext();
	}
    
    }

    public static void main(String[] args){
	SLinkedList L = new SLinkedList();
	System.out.println(L); //""
	L.addLast("Sue");
	System.out.println(L); //Sue //flipped
	L.addLast("Mary");
	System.out.println(L); //Mary Sue //flipped
	L.addLast("Bill");
	System.out.println(L); //Bill Mary Sue //flipped
    }


} //end
