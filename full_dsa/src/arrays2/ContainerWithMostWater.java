//You are given an integer array height of length n. There are n vertical lines drawn such that the two 
//endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water
//Return the maximum amount of water a container can store.

package arrays2;

public class ContainerWithMostWater {
	
	static int areaMax(int a[]) {
		int i=0;
		int j=a.length-1;
		int maxArea=Integer.MIN_VALUE;
		while(i<j) {
			int distance=j-i;			
			int area=distance*Math.min(a[i],a[j]);
			//System.out.print(Math.min(a[i],a[j])+" ");
			if(area>maxArea) {
				maxArea=area;
			}
			if(a[i]<a[j]) {
				i++;
			}else {
				j--;
			}
			
		}
		return maxArea;
	}

	public static void main(String[] args) {
		//int a[]= {0,5,-87,7,-9};
		//int a[]= {6,-7,4,-2,1,5,-4};
				int a[]= {1,8,6,2,5,4,8,3,7};
				int result=areaMax(a);
				System.out.println(result);

	}

}
