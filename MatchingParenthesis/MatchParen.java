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
	for (int i = 0; i < exp.length()-1; i++){
	    if (contains(OPENING, exp.substring(i, i+1)) ||
	        contains(CLOSING, exp.substring(i, i+1)) )
		ans += exp.substring(i,i+1);
	}
	return ans;
    }

    //  *********** QUESTION 3 ************************************
    // Uses a stack to check if exp has matching parentheses.
    // pre: is empty or only contains parentheses.
    public static boolean match(String exp){
        if (exp == "") throw new IllegalArgumentException();
	
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
