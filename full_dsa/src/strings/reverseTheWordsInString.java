package strings;

public class reverseTheWordsInString {
	
	static char [] reverseAWord(char [] a,int i,int j) {
		while(i<j) {
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
		}
		return a;
	}
	
	static String reverseStringWordByWord(String s) {
		char [] a = s.toCharArray();
		int start=0;
		int end=0;
		int i=0;
		for(;i<a.length;i++) {
			if(a[i]==' ') {
				end=i-1;
				reverseAWord(a,start,end);
				start=i+1;
			}
		}
		end=i-1;
		        reverseAWord(a,start,end); //reversing the last word
		        
		reverseAWord(a,0,a.length-1);//step 2
		    
		return new String(a);
	}

	public static void main(String[] args) {
		System.out.println(reverseStringWordByWord("I Am The Boss"));

	}

}
