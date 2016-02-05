import java.util.ArrayList;

public class RomanApp{

    

    //precond: size > 0, lower < upper
    //postcond: returns a list with size elements.
    //each element is a random roman object whose value is in [lower,upper)
    public static ArrayList<Roman> populate(int size, int lower, int upper){
	ArrayList<Roman> romans = new ArrayList<Roman>();
	for (int i = 0; i < size; i++){
	    int r = (int)(Math.random() * (upper-lower)) + lower;
	    romans.add(new Roman(r));
	}
	return romans;
    }

    //returns smallest Roman
    public static Roman min(ArrayList<Roman> L){
	Roman ans = L.get(0);
	for (Roman x : L){
	    if (x.compareTo(ans) < 0)
		ans = x;
	}
	return ans;
    }

    public static void main(String [] args){
	ArrayList<Roman> romans = populate(5,2,100);
	System.out.println(romans);
	System.out.println("min : " + min(romans));
    }


} //end
