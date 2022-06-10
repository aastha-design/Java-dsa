//check if the array is sorted

package practiceProblems;


public class CheckSort {
	public static boolean SortCheck(int a[]) {
	        boolean isSorted=false;
	        int i=0;
	        for(;i<a.length-1;i++) {
	        	if(a[i]>a[i+1]) {
	        		break;
	        	}
	        }
	        if(i==a.length-1) isSorted=true;
	        return isSorted;
	}

	public static void main(String[] args) {
		int a[]= {0,5,87,7,9};
		boolean result=SortCheck(a);
		System.out.println(result);

	}

}
