package mathematicsBasics2;

public class printAllDivisors {
	
	static void printDivisors(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				int pair=n/i;
				if(pair!=i) System.out.println(pair);
			}
			
		}
	}
	
	static void printDivisorsSorted(int n) {
		int i=1;
		for(;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}
		}
			for(i=i-1;i>=1;i--) {
				if(n%i==0) {					
					int pair=n/i;
					if(pair!=i) System.out.println(pair);
				}
			}			
		
	}
		

	public static void main(String[] args) {
		//printDivisors(36);
		printDivisorsSorted(36);

	}

}
