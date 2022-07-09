//Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1,
//compute how much water can be trapped between the blocks during the rainy season.
//ex:Input:
//N = 6
//arr[] = {3,0,0,2,0,4}
//Output:
//10

package arrays2;

public class TrappingRainWaterProblem {
	
	static int totalWater(int a[]) {
		int n=a.length;
		int[] left=new int[n];
		int[] right=new int[n];
		//left support wall
		left[0]=a[0];		
		for(int i=1;i<n;i++) {
			left[i]=Integer.max(a[i],left[i-1]);					
		}
		
		
		//right support wall
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Integer.max(a[i],right[i+1]);
		}
		
		//finding the total area
		int area=0;
		for(int i=0;i<n;i++) {
			area+=Integer.min(left[i], right[i])-a[i];					
		}
		
		return area;
	}

	public static void main(String[] args) {
		int a[]= {6,9,9};
		//int a[]= {1,0,2,1,0,1,3,2,1,2,1};
		int result=totalWater(a);
		System.out.println(result);

	}

}
