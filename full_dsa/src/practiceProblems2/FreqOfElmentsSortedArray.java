//print the frequency of all elemets in sorted array

package practiceProblems2;

public class FreqOfElmentsSortedArray {
	static void frequency(int a[]) {
		int count=1;
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1&&a[i+1]==a[i]) {
				count++;
			}else {
				System.out.println("Frequency of " +a[i]+" is "+count);
				count=1;
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {2,2,3,4,5,6,6,7,7,8};
		//          0 1 2 3 4 5 6 7 8 9
		frequency(a);

	}

}
