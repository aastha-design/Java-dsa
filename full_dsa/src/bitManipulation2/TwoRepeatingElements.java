////find the two non-repeating element in an array where every other element repeats twice.

package bitManipulation2;

public class TwoRepeatingElements {
	
	static int[] twoNonReapeatingElements(int a[]) {
		int xor=0;
		for(int e:a) {
			xor=xor^e;
		}
		int temp=xor;
		
		int mask=xor&(~(xor-1));//gives a number with 1 at the least signicant bit having 1 in xor nd rest bits are 0
		int xor0=0;
		for(int e:a) {
			if((e&mask)==0) {
				xor0=xor0^e;
			}
		}
		
		int firstNum=xor0;
		int secNum=xor0^xor;
		int[] ans= {firstNum,secNum};
		return ans;
	}

	public static void main(String[] args) {
		int a[]= {1,1,2,3,2,3,4,6,7,6};
		int printAns[]=twoNonReapeatingElements(a);
		for(int e:printAns) {
			System.out.println(e);
		}

	}

}
