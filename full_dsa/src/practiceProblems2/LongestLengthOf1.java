//in a sequence of zero and one find the length of longest one's.

package practiceProblems2;

public class LongestLengthOf1 {
    
	static int LongestOne(int a[]) {
		
		int maxOnes=0;
		int Ones=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
			   Ones++;	
			}else {				
				if(maxOnes<Ones) {
					maxOnes=Ones;
				}
				Ones=0;
			}
			
		}
		
		return maxOnes;
	}
	
	public static void main(String[] args) {
		int a[]= {0,0,1,1,1,1,0,0,1,0,1,1,1,1,1,1,0};
		System.out.println(LongestOne(a));
	}

}
