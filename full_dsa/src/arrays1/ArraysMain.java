package arrays1;

public class ArraysMain {

	public static void main(String[] args) {
		int a[]= {2,1,3,4,5};
		int key =5;
		int res=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				res=i;
				break;
			}
		}
		
		if(res==-1) {
			System.out.println("not found");
		}else {
			System.out.println("key present at "+ res +" index");
		}

	}

}
