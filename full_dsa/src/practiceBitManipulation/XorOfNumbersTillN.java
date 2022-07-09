package practiceBitManipulation;

public class XorOfNumbersTillN {
	
	static int XorTillN(int n) {
		if(n==2) return n^1;
		int temp=XorTillN(n-1);
		return temp^n;
	}
	
//	 1- Find the remainder of n by moduling it with 4. 
//	 2- If rem = 0, then XOR will be same as n. 
//	 3- If rem = 1, then XOR will be 1. 
//	 4- If rem = 2, then XOR will be n+1. 
//	 5- If rem = 3 ,then XOR will be 0.
	
	static int XorTillNEfficient(int n) {
		int rem=n%4;
		if(rem==0) return n;
		if(rem==1) return 1;
		if(rem==2) return n+1;
		if(rem==3) return 0;
		return 1;
	}

	public static void main(String[] args) {
		System.out.println(XorTillN(8));
		System.out.println(XorTillNEfficient(150));

	}

}
