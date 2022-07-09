package practiceRecursion;

public class Factorial {
	
	static int factorialOfNumber(int n) {
		if(n==1) return 1;
		int y=factorialOfNumber(n-1);
		return y*n ;
	}

	public static void main(String[] args) {
		int n=10;
		int result=factorialOfNumber(n);
		System.out.println(result);

	}
}
