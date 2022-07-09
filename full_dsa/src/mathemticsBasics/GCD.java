package mathemticsBasics;

public class GCD {
	
	static int gcdOfNumber(int a, int b) {
		if(a==b) return a;
		if(a>b) return gcdOfNumber(a-b,b);
		 return gcdOfNumber(b-a,a);
	}
	
	static int gcdEuclidModified(int a, int b) {
		System.out.println(a+" "+b);
		if(a==0) return b;
		if(b==0) return a;
		if(a>b) return gcdEuclidModified(a%b,b);
		 return gcdEuclidModified(b%a,a);
	}

	public static void main(String[] args) {
		System.out.println(gcdEuclidModified(36,24));

	}

}
