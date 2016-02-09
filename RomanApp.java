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

    //sum of Romans in an ArrayList
    public static Roman sum (ArrayList<Roman> L){
	int ans  = 0;
	for (Roman roman : L)
	    ans += roman.intValue();
	return new Roman(ans);
    }

    //L is unchanged, returns the even Roman numbers
    public static ArrayList<Roman> filterEvens(ArrayList<Roman> L){
	ArrayList<Roman> evens = new ArrayList<Roman>();
	for (Roman x : L)
	    if (x.intValue() % 2 ==0)
		evens.add(x);
	return evens;
    }

    //n is added to each roman numeral in :
    //if L -> [I,II] mapAdd(1,L)
    //L becomes [II,III]
    public static void mapAdd(int n, ArrayList<Roman> L){
	for (Roman roman : L){
	    int x = roman.intValue();
	    x += n;
	    roman = new Roman(x);
	}
    }
    

    public static void main(String [] args){
	ArrayList<Roman> romans = populate(5,2,100);
	System.out.println(romans);
	System.out.println("min : " + min(romans));
	Number total = sum(romans);
	System.out.println("Sum: " + total + " int: " + total.intValue());
	mapAdd(1,romans);
	System.out.println("mapAdd(1,romans) : " + romans);
    }


} //end
