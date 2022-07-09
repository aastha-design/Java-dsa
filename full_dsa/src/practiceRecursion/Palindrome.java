package practiceRecursion;

public class Palindrome {
	
	static boolean isPalindrome(int a[],int start, int end) {
		if(start==end||start>end) return true;
		//if(end-start==1&&a[start]!=a[end]) return false;
		//if(a[start]==a[end]) return true;
		if(a[start]!=a[end]) return false;
		return isPalindrome(a,start+1,end-1);
		
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,4,3,2,1};
		System.out.println(isPalindrome(a,0,a.length-1));
		

	}

}
