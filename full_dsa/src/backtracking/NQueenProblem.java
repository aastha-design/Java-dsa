package backtracking;

public class NQueenProblem {
	static boolean isSafe(int a[][],int row, int col) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(a[i][col]==1) return false;
		}
		int i=row;
		int j=col;
		while(i>0&&j<n-1) {
			if(a[i][j]==1) return false;
			i--;
			j++;
		}
		
		while(i>0&&j>0) {
			if(a[i][j]==1) return false;
			i--;
			j--;
		}
		return true;
	}
	static boolean nQueen(int a[][],int n,int i,int j) {
		if(i==n) return true;
		
		if(!isSafe(a,i, j)) return false;
		a[i][j]=1;i++;	
		for(j=0;j<n;j++) {
		if(nQueen(a,n,i,j)) return true;
		}
		a[i][j]=0;
		return false;
	}

	public static void main(String[] args) {
		int n=4;
		int a[][]=new int [n][n];
		System.out.println(nQueen(a,n,0,0));
	}

}
