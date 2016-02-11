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
	if (str.length() <= 1){
	    ans += str + "\n";
	    System.out.println(ans);
	}
	for (int i = 0;i < str.length(); ++){
	    pH(str.substring(1), ans + str.substring(0,1));
	    str = str.substring(1) + str.substring(0,0);
	}
	
	
	
	
    }

    public static void main(String[] args){
	permutations(args[0]);
    }

}//end
