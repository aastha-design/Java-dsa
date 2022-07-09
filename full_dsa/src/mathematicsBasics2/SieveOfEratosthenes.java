//it is used to find all the prime numbers till n.
//time complexity is O(nlog(logn))

package mathematicsBasics2;

import java.util.Arrays;

public class SieveOfEratosthenes {

	
	static void sieve(int n) {
		boolean isPrime[]=new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<=n;j+=i) {
					isPrime[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isPrime[i])
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		 sieve(50);
       
	}

}
