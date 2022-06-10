//reverse the array

package practiceProblems;

public class ReverseArray {
	
	public static void arrayReverse(int a[]) {
		int n=a.length;
		for(int i=0;i<n/2;i++) {
			int c=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=c;
		}
	}

	public static void main(String[] args) {
		int a[]= {2,5,7,1,4,0};
		arrayReverse(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
