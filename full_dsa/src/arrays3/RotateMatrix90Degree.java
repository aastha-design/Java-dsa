//rotate the given matrix by 90 degrees.

package arrays3;

public class RotateMatrix90Degree {
	static void printArray(int a[][]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	static void swap(int a[][]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n/2;j++) {
				int swap=a[i][j];
				a[i][j]=a[i][n-j-1];
				a[i][n-j-1]=swap;
				
			}
		}
	}
	
	static void transpose(int a[][]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		printArray(a);
		transpose(a);
		swap(a);
		System.out.println();
		printArray(a);

	}

}
