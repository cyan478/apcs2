public class Permutations{

    //precond: str != null
    //postcond: permutations("abc")
    //abc
    //acb
    //bac
    //bca
    //cab
    //cba
    //INTERFACE
    public static void permutations(String str){
	pH(str,"");
    }

    //HELPER FUNCTION; recursively
    private static void pH(String str, String ans){
	if (str.length() == 0)
	    System.out.println(ans);
	for (int i = 0;i < str.length(); i++){
	    pH(str.substring(0,i) + str.substring(i+1), 
	       ans + str.substring(i,i+1));
	}
	
	
	
	
    }

    public static void main(String[] args){
	permutations(args[0]);
    }

}//end
