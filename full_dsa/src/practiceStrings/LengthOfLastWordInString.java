package practiceStrings;

public class LengthOfLastWordInString {
	
	static int lengthOfLastWord(String s) {
		
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				break;
			}
			count++;
			
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" aastha"));
	}

}
