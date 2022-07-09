package bitManipulation;

public class MainClass {
	
	static boolean isPowerOfTwo(int n) {
		int res= n&(n-1);
		if(res==0) return true;
		else return false;
	}
	static int countSetBits(int n) {
		int count=0;
		while(n>0) {
            if((n&1)==1) count++;
           n=n>>1;
		}
		return count;
	}
	
	static int toggleIthBit(int n,int i) {
		int mask=1<<i;
		return mask^n;
	}
	
	static int fintIthBit(int n,int i) {
		int mask=1<<i;
		
		int result=n&mask;
		if(result==0) return 0;
		else return 1;
	}

	public static void main(String[] args) {
	     int n=5;
	     System.out.println(countSetBits(15));
	     System.out.println(fintIthBit(n,0));

	}

}
