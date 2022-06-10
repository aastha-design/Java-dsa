//smallest element in the given array

package practiceProblems;

public class smallestElement {
	
	public static int smallestElement(int a[]){
		int min=0;
		for(int i=1;i<a.length;i++) {
			if(a[min]>a[i]) {
				min=i;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int a[]= {2,5,7,1,4,0};
		int result=smallestElement(a);
		System.out.println(a[result]);

	}

}
