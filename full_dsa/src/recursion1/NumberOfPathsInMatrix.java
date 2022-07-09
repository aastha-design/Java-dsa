package recursion1;

public class NumberOfPathsInMatrix {
	
	static int numberOfPaths (int n, int m) {
		
		if(n==0||m==0) return 1;
		
		return numberOfPaths(n-1,m)+numberOfPaths(n,m-1);
	
		
		
	}
	

	public static void main(String[] args) {
		int n=3;int m=3;
		int result=numberOfPaths(n,m);
		System.out.println(result);
		double pow = Math.pow(10, 9);
		System.out.println(pow);
		

	}

}
