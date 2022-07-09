package recursion1;

public class MainClass1 {
	
	static void printNaturalNumbers(int n) {
		if(n==0) return;
		System.out.println(n);
		printNaturalNumbers(n-1);
		//Tail recursion --> if there is no statement after recursive call , it is called tail recursion
	}
	
	static void printNaturalNumbers2(int n) {
		if(n==0) return;
		printNaturalNumbers(n-1);
		System.out.println(n);
		
		//Tail recursion --> if there is no statement after recursive call , it is called tail recursion
	}


	public static void main(String[] args) {
		int n=5;
		 printNaturalNumbers2(n);
		 printNaturalNumbers(n);

	}

}
