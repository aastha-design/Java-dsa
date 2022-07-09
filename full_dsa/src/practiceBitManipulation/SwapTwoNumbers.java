//swap two numbers without using a third variable
//we use xor operation for the same

package practiceBitManipulation;

public class SwapTwoNumbers {
	
	static void swapWithoutVariable(int a, int b) {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a is "+a+" and b is "+b +" after swaping");
	}
		

	public static void main(String[] args) {
		int a= 5;
		int b=12;
		swapWithoutVariable(a,b);
		
	}

}
