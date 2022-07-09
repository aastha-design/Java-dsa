//Print all the elements in the maximum subarray

package practiceProblems2;

public class KadeneAlgoAdvance {

	static void maxSum(int a[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;
		int start=0;int end=0;
		int temp=start;
		for(int i=0;i<a.length-1;i++) {
			curSum+=a[i];
			if(curSum>maxSum) {
				maxSum=curSum;
				start=temp;
				end=i;
			}
			if(curSum<0) {
				curSum=0;
				temp=i+1;
			}
		}
		System.out.println(start+" "+end);
		for(int i=start;i<=end;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		//int a[]= {0,5,-87,7,-9};
		int a[]= {6,-7,4,-2,1,5,-4};
		maxSum(a);
		

	}
}
