package arrays3;

public class SearchElementInMatrix {
	
	static boolean SearchKey(int a[][]) {
		int n=a.length;
		int row=0;
		int col=n-1;
		
	}

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//printArray(a);
		//SearchKey(a);		
		System.out.println(SearchKey(a));
		//printArray(a);
	}

}
