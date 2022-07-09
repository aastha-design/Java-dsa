//calculate a^b mod n for large values of a and b

package practiceMathematics;

import java.math.BigInteger;

public class BigValuesOfAAndB {
	
	static BigInteger calculateAXorBModN(BigInteger A,BigInteger B, int n){
		BigInteger halfRes=A.xor(B);
		return halfRes.mod(BigInteger.valueOf(n)); 
	}

		
		static BigInteger calculateAPowerBModN(BigInteger A,BigInteger B, int n){
			BigInteger halfRes=A.pow(B.intValue());
			return halfRes.mod(BigInteger.valueOf(n)); 
		}

	public static void main(String[] args) {
		BigInteger A=BigInteger.valueOf(23454567);
		BigInteger B=BigInteger.valueOf(234567);
		
		System.out.println(calculateAPowerBModN(A,B,89));

	}

}
