 package mathematicsBasics2;

public class fastPower {
	
	static int fastPower(int a, int b) {
		
		if(b==0) return 1;
		int halfRes=fastPower(a, b/2);
		int fullRes=halfRes*halfRes;
		if(b%2!=0) fullRes = fullRes * a;
		
		return fullRes;
	}

	public static void main(String[] args) {
		System.out.println(fastPower(2,5));

	}

}
