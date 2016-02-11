public class Sum2{

    //ex: sum(2,3,5) = 2 + 5 + 8 + 11 + 14 = 40

    //explicit
    public static int sum(int a, int d, int n){
	return n * ( (2 * a) + (n - 1) * d) / 2; 
    }

    public static int sumR(int a, int d, int n){
	if (n == 1) return a;
	return a + (n-1)*d + sumR(a,d,n-1);
    }

    public static int sumI(int a, int d, int n){
	int sum = 0;
	for (int i = 0; i < n; i++)
	    sum += a + i*d; //i*d !!!
	return sum;
    }

    public static void main(String [] args){
	int a = Integer.parseInt(args[0]);
	int d = Integer.parseInt(args[1]);
	int n = Integer.parseInt(args[2]);
	System.out.println("sum: " + sum(a,d,n));
	System.out.println("sumR: " + sumR(a,d,n));
	System.out.println("sumI: " + sumI(a,d,n));
    }    


} //end
