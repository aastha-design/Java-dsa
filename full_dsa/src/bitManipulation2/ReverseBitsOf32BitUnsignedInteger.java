package bitManipulation2;

public class ReverseBitsOf32BitUnsignedInteger {
	static int swapTwoBits(int n, int i, int j) {
		int ithBit=(n>>i)&1;
		int jthBit=(n>>j)&1;
		if(ithBit==jthBit) return n;
		int mask=(1<<i)|(1<<j);
		return mask^n;		
		
	}

	
	static long reverseBits(long n) {
		int i=0;long ans=0;
		while(i<=31) {
			if((n&1)==1) {
			ans+=1L<<(31-i);
			n=n>>1;
			i++;
			}
		}
		return ans;
		
		
	}

	public static void main(String[] args) {
		int dividend=8;
		int divisor=45;
		 int sign
         = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
		System.out.println(reverseBits(1));

	}

}
