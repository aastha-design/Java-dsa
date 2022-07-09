//gcd(a,b)=gcd(b,a%b) if a>b

package practiceRecursion;

public class Gcd {
	
	static int gcd(int a ,int b) {
		
		if(b==0) return a;		
		
			return gcd(b,a%b);		
		
	}
//	static int gcd(int a ,int b) {
//		if(a==b) return b;
		
//		
//		if(a>=b) {
//			return gcd(a-b,b);
//		}else {
//			return gcd(b-a,a);
//		}
//		
//	}

	public static void main(String[] args) {
		int a=15;
		int b=5;
		System.out.println(gcd(a,b));

	}

	
}
