package practiceBitManipulation;

public class UnsetIthBit {
	
	static int unsetIthBit(int n,int i) {
		int mask=~(1<<i);
		return n&mask;
		
	}

	public static void main(String[] args) {
		System.out.println(unsetIthBit(7,0));

	}

}
