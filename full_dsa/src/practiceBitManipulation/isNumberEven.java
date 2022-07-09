package practiceBitManipulation;

public class isNumberEven {
	
	static boolean checkEven(int n) {
		int result=n&1;
		if(result==0) return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println(checkEven(3456));

	}

}
