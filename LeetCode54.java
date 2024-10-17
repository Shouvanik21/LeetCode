import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        //defining an ararylist to store the answer
        List<Integer> ans = new ArrayList<>();

        int m=matrix.length;//declaring the no of rows
        int n=matrix[0].length;//declaring the no of columns

        int left=0,top=0,right=n-1,bottom=m-1;

        while(left<=right && top<=bottom){

            //moving left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //moving from top to botttom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //moving from right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            } 

            //moving from bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }    
        } 

        return ans;
    }
}
