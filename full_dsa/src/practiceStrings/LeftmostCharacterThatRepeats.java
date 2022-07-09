package practiceStrings;

import java.util.HashSet;

public class LeftmostCharacterThatRepeats {
	
	
	static char reapeatingLeftmostCharacter(String s) {
		
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				return s.charAt(i);
			}
		set.add(s.charAt(i));			
		}
		return ' ';
		
	}

	public static void main(String[] args) {
		

		System.out.println(reapeatingLeftmostCharacter("asrtyuyeeddf"));
	}

}
