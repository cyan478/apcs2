public class Node{

    private String _value;
    private Node _next;

    public Node(String value, Node next){
	_value = value;
	_next = next;
    }

    //accessor methods
    public String getValue(){
	return _value;
    }

    public Node getNext(){
	return _next;
    }

    //modifier methods
    public String setValue(String str){
	String ans = getValue();
	_value = str;
	return ans;
    }

    public Node  setNode(Node t){
	Node ans = getNext();
	_next = t;
	return ans;
    }
    
    public String toString(){
	return getValue();
    }

    public static void main(String[] args){
	Node a = new Node("Bill",new Node("Mary", new Node("Sue",null)));
	System.out.println(a); //Bill
	System.out.println(a.getNext()); //Mary
	System.out.println(a.getNext().getNext()); //Sue
	System.out.println(a.getNext().getNext().getNext()); //null
	//System.out.println(a.getNext().getNext().getNext().getNext()); //NullPointer Exception (runtime error)
    }


    





} //end
