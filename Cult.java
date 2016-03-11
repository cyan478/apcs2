public class Cult{
    
    private CircleList _circle;
    private int _size;

    public Cult(int M, int K){
	_circle = new CircleList();
	_size = M;
	for (int i = M; i >= 1; i--){
	    Node number = new Node(i+"", null);
	    _circle.add(number);
	}
    }
    
    public int size(){
	return _size;
    }

    public void play(int K){
	if (size() == 1){
	    System.out.println("survivor: " + _circle.getCursor());
	    return;
	}
	for (int i = 0; i < K-1; i++)
	    _circle.advance();
        Node p = _circle.remove();
	System.out.println("poisoned: " + p);
	_size--;
	play(K);
    }

    public String toString(){
	return _circle.toString();
    }

    public static void main(String[] args){
	int M = Integer.parseInt(args[0]);
	int K = Integer.parseInt(args[1]);
	Cult L = new Cult(M,K);
	System.out.println(L);
	L.play(K);
    }





} //end
