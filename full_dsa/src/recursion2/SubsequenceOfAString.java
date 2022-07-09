//generate all subsequence of a string
//space complexity--> O(n) where n is the length of the string
//time complexity-->O(2^n) 

package recursion2;

public class SubsequenceOfAString {
	
	static void subsequenceOfString(String s,String cur,int i) {
		if(i==s.length()) {
			System.out.println(cur);
			return;
		}
		subsequenceOfString(s,cur,i+1); 
		subsequenceOfString(s,cur+s.charAt(i),i+1); 


	}

	public static void main(String[] args) {
		subsequenceOfString("abc","",0); 

	}

}
