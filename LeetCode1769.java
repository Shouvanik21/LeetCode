public class LeetCode1769 {
    public int[] minOperations(String boxes) {
        //creating a temporary array ans to store the min moves of the ball and its length is same as the boxes
        int ans[]=new int[boxes.length()];

        for(int i=0;i<boxes.length();i++){
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1' && i!=j){
                    ans[i]+=Math.abs(i-j);//if i==j then cond breaks;
                }
            }
        }
        
        return ans;
    }
}
