package sorting;

public class BubbleSort {
	
	static void swap(int a[],int i , int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	static void bubbleSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			boolean isSwap=false;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					isSwap=true;
					swap(a,j,j+1);
				}
			}
			if(isSwap==false) break;
		}
	}
	
	static void selectionSort(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i;j<a.length;j++) {
				
			}
		}
		
	}
	public static void main(String[] args) {


		int a[]= {1,5,43,6,8};
		bubbleSort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
