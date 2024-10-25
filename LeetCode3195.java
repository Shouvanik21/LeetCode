public class LeetCode3195 {
    public int minimumArea(int[][] grid) {
        if(grid.length==0){
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        int minRow = m, maxRow = -1;
        int minCol = n, maxCol = -1;

        // Traverse the grid to find boundaries
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        // Calculate area
        if (maxRow == -1 || maxCol == -1) {
            return 0; // No '1' found
        }
        
        int area = (maxCol - minCol + 1) * (maxRow - minRow + 1);
        return area;

    }
}
