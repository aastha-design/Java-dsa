package bitManipulation2;

public class SwapTwoBits {
	
	static int swapTwoBits(int n, int i, int j) {
		int ithBit=(n>>i)&1;
		int jthBit=(n>>j)&1;
		if(ithBit==jthBit) return n;
		int mask=(1<<i)|(1<<j);
		return mask^n;		
		
	}

	public static void main(String[] args) {
		System.out.println(swapTwoBits(5,2,1));

	}

}
