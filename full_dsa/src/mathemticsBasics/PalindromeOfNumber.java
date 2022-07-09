package mathemticsBasics;

public class PalindromeOfNumber {
	
	static boolean palindromeOfANumber(int n) {
		int temp=n;
		int rev=0;
		while(temp>0) {
			int ld=temp%10;
			rev=rev*10+ld;
			temp/=10;
		}
		return rev==n;
	}

	public static void main(String[] args) {
		System.out.println(palindromeOfANumber(121));
	}

}
