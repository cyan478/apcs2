public class Commas{

    public static String withCommas(int n){
	if (n < 1000) return Integer.toString(n);
	//if ((n % 1000) == 0) return withCommas(n/1000)+","+ withCommas(n%1000) + withCommas(n%100) + withCommas(n%10);
	return withCommas(n/1000)+","+ Integer.toString(n).substring((Integer.toString(n)).length()-3);
    }

    public static void main (String [] args){
	System.out.println(withCommas(10001));
	System.out.println(withCommas(1234567890));
			   
    }


} //end
