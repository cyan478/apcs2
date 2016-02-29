public class DNode{

    private String _value;
    private DNode _previous, _next;

    //constructor
    public DNode(String value, DNode previous, DNode next){
	_value = value;
	_previous = previous;
	_next = next;
    }

    //accessors
    public String getValue(){
	return _value;
    }

    public DNode getPrevious(){
	return _previous;
    }

    public DNode getNext(){
	return _next;
    }

    //modifiers
    public String setValue(String value){
	String ans = getValue();
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

    public String toString(){
	return _value;
    }

    public static void main(String[] args){
	DNode a = new DNode("Amy", null, null);
	DNode b = new DNode("Bill", a, null);
	DNode c = new DNode("Mary", b, null);
	a.setNext(b);
	b.setNext(c);
	//b.setPrevious(a); taken care of in the constructor
	//c.setPrevious(b);
	DNode current = a;
	while (current != null){
	    System.out.println(current);
	    current = current.getNext();
	}
	System.out.println("\nbackwards:");
	current = c;
	while (current != null){
	    System.out.println(current);
	    current = current.getPrevious();
	}
	//swap the values (not nodes) of Amy and Carol
	a.setValue(c.setValue(a.getValue())); //bc setValue() reports old value
    }






} //end
