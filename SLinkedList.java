public class SLinkedList{

    private Node _head, _tail;
    private int _size;

    public SLinkedList(){
	_head = _tail = null;
	_size = 0;
    }

    public void addFirst(String value){
	if (_size ==0)
	    _head = _tail = new Node(value, null);
	else
	    _head = new Node(value, _head); //precedence levels, don't need temp
	_size++;
    }
    
    public String toString(){

    }

    public static void main(Stirng[] args){
	SLinkedList L = new SLinkedList();
	System.out.println(L); //""
	L.addFirst("Sue");
	System.out.println(L); //Sue
	L.addFirst("Mary");
	System.out.println(L); //Mary Sue
	L.addFirst("Bill");
	System.out.println(L); //Bill Mary Sue
    }


} //end
