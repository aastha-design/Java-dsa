//print all permutations of a given string

package practiceRecursion2;

import java.util.HashSet;

public class PermutationsOfAString {
	
	static HashSet permutations(String s){	
		
		HashSet<String> set= new HashSet<>();
		for(int i=0;i<s.length();i++) {
			String c=s.charAt(i);
			String pre=s.substring(0, i);
			String next=s.substring(i+1);
			String total=pre+next;
			String permute=s.charAt(i)+permutations(total);
			}
		return set;
		
	}

	public static void main(String[] args) {
		

	}

}
