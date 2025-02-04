public class LeetCode2373{
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int ans[][] = new int[n-2][n-2];

        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int a = Integer.MIN_VALUE;
                for(int l=i; l<i+3; l++){
                    for(int k=j; k<j+3; k++){
                        a = Math.max(a,grid[l][k]);
                    }
                }
                ans[i][j] = a;
            }
        }
        return ans;
    }
}