public class Sum{

    public static int sum(int n){
	return n*(n+1)/2;                                                     
    }

    public static int sumR(int n){
	if (n == 0) return 0;
	return (n + sumR(n-1));
    }

    public static int sumI(int n){
        int ans = 0;
	for (int i = 1; i <= n; i++)
	    ans += i;
	return ans;
    }

    public static void main(String [] args){
	int N = Integer.parseInt(args[0]);
	System.out.println("sum: " + sum(N));
	System.out.println("sumR: " + sumR(N));
	System.out.println("sumI: " + sumI(N));
    }




} //end
