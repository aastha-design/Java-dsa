//how many bits are required to change one number to the another

package practiceBitManipulation;

public class ChangeOneNumberToAnother {
	
	static int NumberOfBitsChanged(int a , int b) {
		
		int Xor=a^b;
		int count=0;
		while(Xor>0) {
			int temp=Xor&1;
			if(temp==1) count++;
			Xor=Xor>>1;
		}
		
		return count;
	}

	public static void main(String[] args) {
		System.out.println(NumberOfBitsChanged(3,5));
	}

}
