package backtracking;

public class RatInAMaze {
	static boolean ratInMaze(int a[][],int n,int vis[][],int i,int j) {
		if(i==n||j==n||a[i][j]==0||vis[i][j]==1) {
			return false;
		}
		vis[i][j]=1;
		if(i==n-1&&j==n-1) return true;
		if(ratInMaze(a,n,vis,i+1,j)) return true; //down
		if(ratInMaze(a,n,vis,i,j+1)) return true;
		vis[i][j]=0;  //backtrack
		return false;		
		
	}

	public static void main(String[] args) {
		int a[][]= {
				{1,1,0,1},
				{1,1,1,1},
				{0,0,1,0},
				{1,1,1,1}
				
		};
		int n=a.length;
		int vis[][]=new int[n][n];
		System.out.println(ratInMaze(a,n,vis,0,0));
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(vis[i][j]);
			}
			System.out.println();
		}

	}

}
