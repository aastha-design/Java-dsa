//very very very important

//find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
package arrays2;

public class KadeneAlgorithm {
	static int maxSum(int a[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++) {
			curSum+=a[i];
			if(curSum>maxSum) {
				maxSum=curSum;
			}
			if(curSum<0) {
				curSum=0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		//int a[]= {0,5,-87,7,-9};
		int a[]= {6,-7,4,-2,1,5,-4};
		int result=maxSum(a);
		System.out.println(result);

	}

}
