public class GCD{
	// to find the gcd(great common divisor) of two numbers
    public static int gcd(int m, int n){
        return (m > n)? gcdCalculation(m, n) : gcdCalculation(n, m);
    }
    private static int gcdCalculation(int m, int n){
        if(n == 0) return m;
        else return gcdCalculation(n, m%n);
    }
}