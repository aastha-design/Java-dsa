package arrays1;

public class RemoveDuplicates {
	public static void DuplicateRemove(int a[]) {
		int j=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				a[j]=a[i];
				j++;
			}
		}
	
	}

	public static void main(String[] args) {
		int a[]= {2,2,3,4,5,6,6,6,6,7};
		int b[]= {2,2,3,4,4,7};
		    DuplicateRemove(b);
		    for(int i=0;i<b.length;i++) {
		    System.out.print(b[i]+" ");		
		    }

	}

}
