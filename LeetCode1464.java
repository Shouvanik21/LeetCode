public class LeetCode1464 {
    public int maxProduct(int[] nums) {
        int prod=0,maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                prod=(nums[i]-1)*(nums[j]-1);
                if(prod>maxi){
                    maxi=prod;
                }
            }
        }
        return maxi;
    }
}
