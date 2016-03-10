import java.util.ArrayList;

public class DuckDuckGoose{

    private CircleList _circle;
    //private boolean _first;


    // *** Question 4 ****
    // Transfer the names from the ArrayList into a CircleList.
    public DuckDuckGoose(ArrayList<String> names){
	_circle = new CircleList();
	//_first = true;
	for (int i = 0; i < names.size(); i++){
	    Node NAME = new Node(names.get(i),null);
	    _circle.add(NAME);
	}
    }


    // *** Question 5 ****
    // Returns a randomly selected child to be it.
    // The child is removed from the circle and its node is returned.
    public Node chooseIt(){
	int r = (int)(Math.random() * _circle.size());
	for (int i = 0; i < r-1; i++)
	    _circle.advance();
	return _circle.remove();
    }

    public String toString(){
        return _circle.toString();
    }

    public void play(int n){
	if (n == 0) return;
	else{
	    Node it = chooseIt();
	    for (int i = 0; i < n; i++){
		/*
		System.out.println("kids: " + _circle); //prints out first line of all kids
		if (_first){
		    Node it = chooseIt();
		    _first = false;
		}
		*/
		System.out.println("It: " + it);
		System.out.println("kids: " + _circle);
	        while (Math.random() < 0.75){
		    _circle.advance();
		    System.out.println("Duck: " + _circle.getCursor());
		}
		Node picked = _circle.getCursor();
		System.out.println("Goose: " + picked);
		System.out.println("Race between: " + it + " and " + picked);
		int r = (int)(Math.random() * 2);
		if (r == 0){ //if r is winner for it
		    System.out.println(
		    _circle.remove();
		    _circle.add(it);
		    it = picked;
		}
		System.out.println(_circle);
	    }
	}
    }

    public static void main(String [] args){
	String [] n = {"Abe","Cal","Jen","Eve","Pam","Vern", "Joe", "Quin", "Yuki"};
	// *** Question 1 *** 
	// Declare and instanciate an ArrayList of strings.
	ArrayList<String> kids = new ArrayList<String>();
	// *** Question 2 ***
	// Copy the items of the String [] into an ArrayList of Strings.
	for (int i = 0; i < n.length; i++)
	    kids.add(n[i]);
	// *** Question 3 ****
	// Declare and instantiate a DuckDuckGoose object.
	DuckDuckGoose ddg = new DuckDuckGoose(kids);
	// The constructor's argument will be an ArrayList of Strings.    
	System.out.println(ddg);
	ddg.play(3);
    }



} //end
