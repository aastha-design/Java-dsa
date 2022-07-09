
// Minimun sum subarray problem

package practiceProblems2;

public class MinimumSubarraySum {
	static int minSum(int a[]) {
		int curSum=0;
		int minSum=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			curSum+=a[i];
			if(curSum<minSum) {
				minSum=curSum;				
			}
			if(curSum>0) {
				curSum=0;
			}
		}
		return minSum;
	}

	public static void main(String[] args) {
		//int a[]= {0,5,-87,7,-9};
		//int a[]= {6,-7,4,-2,1,5,-4};
		//int a[]= {-2};
		int a[]= {-1,-3,-4,-6,3, -1, -2};
	      int result=minSum(a);
		  System.out.println(result);

	}

}
