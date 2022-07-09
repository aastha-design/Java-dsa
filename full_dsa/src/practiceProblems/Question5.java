//WAP to replace every element with the greatest element on its right side.

package practiceProblems;

public class Question5 {
	
//  Approach one	
//	public static void function(int [] a) {
//		
//		for(int i=0;i<a.length-1;i++) {
//			int rightMax=Integer.MIN_VALUE;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[j]>rightMax) {
//					rightMax=a[j];
//				}
//			}
//			a[i]=rightMax;
//			
//		}
//	}
	
	
	//Approach two
	public static void function(int [] a) {
		int rightMax=a[a.length-1];
		
		for(int i=a.length-2;i>=0;i--) {
			int curr=a[i];
			a[i]=rightMax;
			
			if(curr>rightMax) {
				rightMax=curr;
			}
			
		}
	}

	public static void main(String[] args) {
		int a[]= {2,5,7,1,4,0};
		function(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
