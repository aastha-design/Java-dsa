package sorting;

public class SelectionSort {
	
	static void swap(int a[],int i , int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	
	static void selectionSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int minIndex=i;
			int j=i;
			for(;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			swap(a,i,minIndex);
		}
		
	}
	public static void main(String[] args) {


		int a[]= {1,5,43,6,8};
		selectionSort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
