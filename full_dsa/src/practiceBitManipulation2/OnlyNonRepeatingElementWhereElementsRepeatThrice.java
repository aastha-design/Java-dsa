//find the only non repeating element in an array where every other element repeats thrice.

package practiceBitManipulation2;

public class OnlyNonRepeatingElementWhereElementsRepeatThrice {
   
	static int nonReppeatingElement(int A[]) {
		int noOfOne[]=new int[32];
        for(int e:A){
            int i=31;
            while(e>0){
              int bit=e&1;
              if(bit==1) noOfOne[i]+=1;
              e=e>>1;
              i--; 
            }
        }
        for(int e:noOfOne){
            e=e%3;
        }
        for(int i=0;i<=31;i++) {
            noOfOne[i]=noOfOne[i]%3;
   		}
        for(int e:noOfOne){
            System.out.print(e+" ");
        }
        
        int ans=0;
        for(int i=0;i<=31;i++){
            if(noOfOne[i]==1){
               ans+=(int)(Math.pow(2,31-i)); 
            }
            
        }
        return ans;
//		int array[] =new int[32];
//		for(int e:a) {
//			int i=0;
//			while(e>0) {
//				int bit=e&1;
//				if(bit==1) array[31-i]=array[31-i]+1;
//				e=e>>1;
//			    i++;	
//			}
//		}
//		
//		
//		
//		for(int i=0;i<=31;i++) {
//           array[i]=array[i]%3;
//		}
//		int ans=0;
//		for(int i=0;i<=31;i++) {
//	           if(array[i]==1) {
//	        	 ans+=(int)(Math.pow(2,31-i));
//	           }
//			}
//		return ans;
	}
	
	public static void main(String[] args) {
		int a[]= {2,3,4,5,2,2,3,3,4,4,5,5,7,7,7,2};
		System.out.println(nonReppeatingElement(a));

	}

}
