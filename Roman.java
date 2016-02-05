public class Roman extends Number implements Comparable<Roman>{

    private int _n;
    private String _numeral;

    //constructor
    public Roman(int n){
        if (n <= 0 || n > 4000)
            throw new ArithmeticException();
        _n = n;
        _numeral = toRoman(n);
    }

    public String toString(){
        return _numeral;
    }

    //pre: 0 < n <= 4000
    public static String toRoman(int n){
	if (n <= 0) return "";
        if (n < 4) return "I" + toRoman(n-1);
	if (n == 4) return "IV";
        if (n < 9) return "I" + toRoman(n-5);
	if (n == 9) return "IX";
        if (n < 40) return "X" + toRoman(n-10);
	if (n < 50) return "XL" + toRoman(n-40);
	if (n < 90) return "L" + toRoman(n-50);
	if (n < 100) return "XC" + toRoman(n-90);
	if (n < 400) return "C" + toRoman(n-100);
	if (n < 500) return "CD" + toRoman(n-400);
	if (n < 900) return "D" + toRoman(n-500);
	if (n < 1000) return "CM" + toRoman(n-900);
	return "M" + toRoman(n-1000);
    }

    public boolean equals(Object rhs){
	return this == rhs || 
	    (rhs instanceof Roman && _n == ((Roman)rhs)._n);
    }

    //implement comparable interface
    public int compareTo(Roman rhs){
	return this._n - rhs._n;
    }

    //abstract methods in Number.java
    public double doubleValue(){
	return (double)_n;
    }

    public float floatValue(){
	return (float)_n;
    }

    public int intValue(){
	return (int)_n;
    }

    public long longValue(){
	return (long)_n;
    }

    public static void main(String [] args){
        //System.out.println(toRoman(49));
	Roman a = new Roman(10);
	Roman b = new Roman(5);
	//System.out.println(a.equals("XIV"));
	System.out.println(a.compareTo(b));
    }



} //end
