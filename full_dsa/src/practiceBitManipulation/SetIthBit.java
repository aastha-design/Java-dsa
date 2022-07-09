package practiceBitManipulation;

public class SetIthBit {
	
	static int setIthBit(int n,int i) {
		int mask=1<<i;	
		
		return n|mask;
	}

	public static void main(String[] args) {
		System.out.println(setIthBit(5,1));

	}

}
