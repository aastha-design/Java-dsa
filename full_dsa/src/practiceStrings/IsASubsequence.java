package practiceStrings;

public class IsASubsequence {
	
	static boolean isSubsequence(String str,String sub) {
		char a[]=sub.toCharArray();
	//	int i=0;//for str
		int j=0;//for sub
		for(int i=0;i<str.length();i++) {
			
			if(j<a.length&&str.charAt(i)==a[j]) {
				j++;
			}
			if(j==a.length) return true;
		}
		 return false;	
		
	}

	public static void main(String[] args) {
		System.out.println(isSubsequence("baac","abc"));

	}

}
