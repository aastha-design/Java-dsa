//print all the leaders in an array
//the elements which do not have any element greater than them on their right side are called leaders.

package arrays2;

public class LeadersInArray {
	static void leadersPrint(int a[]) {
		int rightMax=Integer.MIN_VALUE;
		for(int i=a.length-1;i>=0;i--) {
			if(rightMax<a[i]) {
				System.out.print(a[i]+" ");
				rightMax=a[i];
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {2,5,7,1,4,0};
		leadersPrint(a);

	}

}
