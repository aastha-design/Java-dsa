//Move all the zeroes to the end oof the array 
package practiceProblems2;

public class AllZeroesAtEnd {

	public static void main(String[] args) {
		int a[]= {8,0,1,3,0,0,5};
		int n=a.length;
		int leftZeroes[]=new int[n];
		
		int zeroes=0;
		for(int i=0;i<n;i++){
			if(a[i]==0) {
				zeroes++;
				leftZeroes[i]=0;
			}else {
				leftZeroes[i]=zeroes;
			}
		}
		
		int i=0;
		for(;i<n;i++) {
			int rotateBy=leftZeroes[i];
			a[i-rotateBy]=a[i];
		}
		for(int j=i-leftZeroes[i-1];j<n;j++) {
			a[j]=0;
		}
		for(int j=0;j<n;j++) {
			System.out.println(a[j]);
		}
		
	    //frequency(a);

	}

}
