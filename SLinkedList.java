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
	Node last = _tail;
	Node penUlt = _head;
	for (int i = 0; i < _size-2; i++)
	    penUlt = penUlt.getNext();
	penUlt.setNext(null);
	_tail = penUlt;
	_size--;
	return last.getValue();
    }

    //LAB #1 DUR THURS 2/25

    //O(1)
    public String getFirst(){
	if (size() == 0) throw new IllegalStateException();
	return _head.getValue();
    }

    //O(1)
    public String getLast(){
	if (size() == 0) throw new IllegalStateException();
	return _tail.getValue();
    }

    public String get(int i){
	if (i < 0 || i >= size()) throw new IllegalStateException();
	Node now = _head;
	for (int x = 0; x < i; x++)
	    now = now.getNext();
	return now.getValue();
    }

    /*
    //O(n^2) APPEND
    public SLinkedList append(SLinkedList L){
	SLinkedList ans = new SLinkedList();
	for (int i = 0; i < this.size(); i++) //makes a copy of this
	    ans.addLast(this.get(i));
	for (int j = 0; j < L.size(); j++) //copy of L
	    ans.addLast(L.get(j));
	return ans;
    }
    */

    //O(1) APPEND
    public SLinkedList append(SLinkedList L){
	SLinkedList ans = new SLinkedList();
	Node n = this._head;
	for (int i = 0; i < this.size(); i++){
	    ans.addLast(n.getValue()); //O(1)
	    n = n.getNext();
	}
	n = L._head; //start of second list
	for (int j = 0; j < L.size(); j++){
	    ans.addLast(n.getValue()); //O(1)
	    n = n.getNext();
	}
	return ans;
    }

    /* REVERSE W HELPER FUNCTION
    private void reverseR(int pos, String last){
	if (pos < size()){
	    addLast(_head.getValue());
	    removeFirst();
	    reverseR(pos++,last);
	}
    }
    public void reverse(){
	if (size <= 1) return;
        reverseR(0,_tail.getValue());
    }
    */
    
    /*
    //REVERSE W NORMAL RECURSION
    public void reverse(){
	reverseR(0,_tail.getValue());
    }

    public void reverse2(){
	if(size() <= 1) return;
	String t = removeFirst();
	reverse2(); //when this terminates, addLast(t) happens
	addLast(t);
    }
    */

    public Node search(String key){
	Node current = _head;
	for (int i = 0; i < size(); i++){
	    if (current.getValue().equals(key))
		return current;
	    current = current.getNext();
	}
	return null;
    }

    /*
    public void swap(Node x, Node y){
	if (x == y) return;
        String strX = x.getValue();
	Node nextX  = x.getNext();
	String strY = y.getValue();
	Node nextY = y.getNext();
	x.setValue(strY);
	x.setNext(nextY);
	y.setValue(strX);
	y.setNext(nextX);
	Node current = _head; //the Nodes before x/y
	for (int i = 0; i < size(); i++){
	    if (current.getNext() == x)
		current.setNext(y);
	    else if (current.getNext() == y)
		current.setNext(x);
	}
    }
    */

    public void swap(Node x, Node y){
	if (x == y) return;
	Node prevX = new Node(null,_head);
	while (prevX.getNext() != x && prevX.getNext() != y)
	    prevX = prevX.getNext();
	if ( prevX.getNext() == y){ //if getNext() hits y first, swap x and y ref
	    Node t = x;
	    x = y;
	    y = t;
	}
	// x precedes y
	Node prevY = prevX.getNext();
	while ( prevY.getNext() != y)
	    prevY = prevY.getNext();
	if (_head == x) _head = y;
	if (_tail == y) _tail = x;
	prevX.setNext(y);
	prevY.setNext(x);
	Node afterY = y.getNext();
	y.setNext(x.getNext());
	x.setNext(afterY);
    }


    //O(n)
    public String toString(){
	String ans = "";
	Node current = _head;
	for (int i = 0; i < _size; i++){
	    ans += current.getValue()+" ";
	    current = current.getNext();
	}    
	return "";
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
	L.addLast("Nick");
	//L.swap(L.search("Mary"),L.search("Bill"));
	//System.out.println(L);
    }


} //end
