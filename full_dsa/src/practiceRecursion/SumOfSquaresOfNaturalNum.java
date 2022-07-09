package practiceRecursion;

public class SumOfSquaresOfNaturalNum {
	
	static int sumOfSquares(int n) {
		if(n<0) return -1;
		if(n==0) return 0;
		if(n==1) return 1;
		int y=sumOfSquares(n-1);
		return y+(n*n) ;
	}


	public static void main(String[] args) {
		int n=-4567;
		int result=sumOfSquares(n);
		System.out.println(result);

	}

}
