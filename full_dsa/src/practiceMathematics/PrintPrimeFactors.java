//print prime factors of a number n

package practiceMathematics;

public class PrintPrimeFactors {
	
	static boolean isPrime(int i) {
		for(int j=2;j*j<=i;j++) {
			if(i%j==0) return false;
		}
		return true;
	}

	static void primeFactors(int n) {
		int temp=n;
		if(isPrime(n)) System.out.println(n);
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				while(temp%i==0) {
				System.out.println(i);				
				temp/=i;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		primeFactors(78);

	}

}
