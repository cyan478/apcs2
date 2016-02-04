public class Roman{

    private int _n;
    private String _numeral;

    //constructor
    public Roman(int n){
        if (n <= 0 || n > 4000)
            throw new ArithmeticException();
        _n = n;
        _numeral = toRoman(n);
    }

    /*
    public String digits(){
        String [] ones = {"I","II","III"}
        String [] fives;
    }
    */

    public String toString(){
        return _numeral;
    }

    //pre: 0 < n <= 50
    public static String toRoman(int n){
        if (n < 1) return "";
        if (n < 4) return "I" + toRoman(n-1);
        if (n < 5) return "IV";
        if (n < 9) return "I" + toRoman(n-5);
        if (n < 10) return "IX";
        if (n < 50) return "X" + toRoman(n-10);
	if (n < 51) return "L" + toRoman(n-50);
        
        else 
            return "";
    }

    public static void main(String [] args){
        System.out.println(toRoman(49));
    }



} //end
