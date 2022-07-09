//find the only non-repeating element in an array where every other element repeats twice.

package bitManipulation2;

public class OneRepeatingElement {
	
	static int oneReapeatingElement(int a[]) {
		int ans=0;
		for(int e:a) {
			ans=ans^e;
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3,4};
		System.out.println(oneReapeatingElement(a));

	}

}
