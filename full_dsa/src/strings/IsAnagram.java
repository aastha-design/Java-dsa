package strings;

public class IsAnagram {
	
	static boolean isAnagram(String s,String s2) {
		int ascii[]=new int[256];
		for(int i=0;i<s.length();i++) {
			ascii[s.charAt(i)]++;
		}
		
		for(int i=0;i<s2.length();i++) {
			ascii[s2.charAt(i)]--;
		}
		
		for(int e:ascii){
			if(e!=0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
           System.out.println(isAnagram("hello","ellhoh"));
	}

}
