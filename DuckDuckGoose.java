import java.util.ArrayList;

public class DuckDuckGoose{

    private CircleList _circle;


    // *** Question 4 ****
    // Transfer the names from the ArrayList into a CircleList.
    public DuckDuckGoose(ArrayList<String> names){
	_circle = new CircleList();
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
	for (int i = 0; i < r; i++)
	    _circle.advance();
	return _circle.remove();
    }

    public String toString(){
        return _circle.toString();
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
    }



} //end
