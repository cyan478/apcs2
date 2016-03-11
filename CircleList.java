public class CircleList{

    private Node _cursor;
    private int _size;

    // constructor 
    public CircleList(){
	_cursor = null;
	_size = 0;
    }


    public Node getCursor(){
	return _cursor;
    }


    // Adds a node after the cursor
    // If the list is empty adds at the cursor
    public void add(Node newNode){
	Node t ;
	if (isEmpty()){
	    
	    _cursor = newNode;
	    t = _cursor;
	}
	else{
	    t = _cursor.getNext();
	    _cursor.setNext(newNode);
	}
	newNode.setNext(t);
	_size++;
    }


    public int size(){
	return _size;
    }

    public boolean isEmpty(){
	return size() == 0;
    }
    public void advance(){
	_cursor = _cursor.getNext();
    }

    public Node remove(){
	if (isEmpty()) throw new IllegalStateException("empty list");
	Node ans = _cursor.getNext();
	Node n = ans.getNext();
	ans.setNext(null);
	if (size() == 1) _cursor = null;
	else  _cursor.setNext(n);
	--_size;
	return ans;
    }


    public String toString(){
	String ans = "";
	Node t = _cursor;
	for (int i = 0; i < size(); i++){
	    ans += t + ", ";
	    t = t.getNext();
	} 
	int len = ans.length();
	if (len > 0) ans = ans.substring(0,len - 2);
	return "[" + ans + "]";
    }


    public static void main(String [] args){
	CircleList L = new CircleList();
	System.out.println(L);
	L.add(new Node("Abe",null));
	System.out.println(L);
	L.add(new Node("Betty", null));
	System.out.println(L);
	L.advance();
	L.add(new Node("Ada", null));
	L.advance();
	L.advance();
	System.out.println(L);
	
	while (!L.isEmpty()){
	    System.out.println(L.remove());
	    System.out.println(L);
	}

    }
}
