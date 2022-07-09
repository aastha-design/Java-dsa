package sorting;

public class InsertionSort {
	
	static void insertionSort(int a[]) {
		for(int i=1;i<a.length-1;i++) {			
			int j=i-1;
			int temp=a[i];
			while(j>=0&&a[j]>temp) {
				a[j]=a[j-1];
				j--;
			}
			a[j+1]=temp;
		}
		
	}
	public static void main(String[] args) {


		int a[]= {1,5,43,6,8};
		insertionSort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
