package practiceBitManipulation2;


public class CountTotalSetBitsFrom1toN {
	
	static int solve (int A) {
		int sum=0;
        for(int i=0;i<=A;i++){
            int binaryEquivalent=0;
            String str1="aastha";
            str1=str1+str1;
            System.out.println(str1);
            
            int counter=0;
            while(i>0){
                int modulo=i%2;
                binaryEquivalent+=(int)(Math.pow(10,counter))*modulo;
                counter++;
            }
            sum+=binaryEquivalent;
        }
        System.out.println(sum);
        int noOfOnes=0;
        while(sum>0){
        noOfOnes+=sum%10;
        sum=sum/10;
        }
        System.out.println(noOfOnes);
        return noOfOnes;
        
    
	}

	public static void main(String[] args) {
		System.out.println(solve(3));
}
}
