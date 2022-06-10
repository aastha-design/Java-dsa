package arrays1;

public class SecondLargestElement {
	
	public static int secondLargest(int a[]) {
		if(a.length<2) return -1;
		int largest=0  ;
		int second=-1;		
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[largest]) {
				second=largest;
				largest=i;
				
			}else if(a[i]<a[largest]) {
				if(second==-1 ||a[i]>a[second]) {
					second=i;
				}
			}
		}		
		return second;
	}

	public static void main(String[] args) {
		int a[]= {5,1,7,2,4,6};
		int result=secondLargest(a);
		
		System.out.println(a[result]);

	}

}
