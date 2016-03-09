//uses nodes
//no tail/head; uses a cursor

public class CircleList{

    private int _size;
    private Node _cursor;

    public CircleList(){
	_size = 0;
	_cursor = null;
    }

    public CircleList(String value){
	_size = 1;
	//_cursor = new Node(value, _cursor);
    }

    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }

    public Node getCursor(){
	return _cursor;
    }

    public void advance(){
	_cursor = _cursor.getNext();
    }

    public void add(Node newNode){
	if (isEmpty()){
	    _cursor = newNode;
	    newNode.setNext(newNode);
	}
	else{
	    newNode.setNext(_cursor.getNext());
	    _cursor.setNext(newNode);
	}
	_size++;
    }

    public Node remove(){
	if (isEmpty()) throw new IllegalStateException();
	Node temp = _cursor.getNext();
	if (size() == 1)
	    _cursor = null;
	else
	    _cursor.setNext(temp.getNext());
	_size--;
	temp.setNext(null); //no association/access point anymore
	return temp;
    }

    public String toString(){
	String ans = "[";
	Node current = _cursor;
	for (int i = 0; i < size(); i++){
	    if (i == size() - 1)
		ans += current;
	    else 
		ans += current +", ";
	    current = current.getNext();
	}
	ans += "]";
	return ans;
    }

    public static void main(String[] args){
	CircleList L = new CircleList();
	L.add(new Node("Abe", null));
	L.add(new Node("Betty",null));
	L.advance();
	L.add(new Node("Ada",null));
	System.out.println(L);
	L.advance();
	L.advance();
	System.out.println(L);
	System.out.println(L.remove());
	System.out.println(L);
	
    }

} //end
