//find third largest element in array

package practiceProblems;

public class ThirdLargestElement {
	public static int thirdLargest(int a[]) {
		if(a.length<2) return -1;
		int largest=0;int second=-1;
		int third=-1;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[largest]) {
				third=second;
				second=largest;
				largest=i;
				
			}else if(a[i]<a[largest]) {
				if(second==-1||a[i]>a[second]) {
					third=second;
					second=i;
				}else {
					if(a[i]<a[second]) {
						if(third==-1 || a[i]>a[third]) {
							third=i;
						}
					}
				}
			}
		}
		return third;
		                                     
	}

	public static void main(String[] args) {
		int a[]= {2,5,7,1,4,0,7,4,3,2,1,5,6};
		int result=thirdLargest(a);
		System.out.println(result);

	}

}
