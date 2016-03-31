public class MatchParen{

    public final static String OPENING = "([{";
    public final static String CLOSING = ")]}";
    public final static String PARENTHESES = OPENING + CLOSING;


    
    //  *********** QUESTION 1 ************************************
    // returns true if token is contained within exp; false otherwise
    // e.g.  contains("mississippi","is") -> true
    //       contains("mississippi","Is") -> false
    //       contains("mississippi","ippi") -> true
    public static boolean contains(String exp, String token){
        if (exp.indexOf(token) == -1) return false;
	return true;
    }


    //  *********** QUESTION 2 ************************************
    // post: removes all whitespace characters and non-parentheses
    //       from exp.
    public static String filterParen(String exp){
        String ans = "";
	for (int i = 0; i < exp.length(); i++){
	    if (contains(PARENTHESES, exp.substring(i, i+1)))
		ans += exp.substring(i,i+1);
	}
	return ans;
    }

    //  *********** QUESTION 3 ************************************
    // Uses a stack to check if exp has matching parentheses.
    // pre: is empty or only contains parentheses.
    public static boolean match(String exp){
        Stack<String> s = new ArrayStack<String>();
	if (exp.length() % 2 == 0) return false; //O(1) if odd length()
	for (int i = 0; i < exp.length(); i++){ //if isEmpty(), skip
	    String str = exp.substring(i,i+1);
	    if (contains(OPENING,str)) s.push(str); //keep stacking OPENING
	    else{
		if (s.isEmpty()) return false; //if first one is CLOSING
		if (OPENING.indexOf(s.pop()) != CLOSING.indexOf(str)) //checks if matches
		    return false;
	    }
	}
	return s.isEmpty();
    }

    // Assuming ()[]{} are the only characters
    public static void main(String [] args){
	String exp = "";

	System.out.print("> ");
	exp = StdIn.readLine();
	while ( !contains(exp,"-1")){
	    if (match(filterParen(exp)))
		System.out.println("Match");
	    else
		System.out.println("Don't match");
	    System.out.print("> ");
	    exp = StdIn.readLine();
	}
    }

}
