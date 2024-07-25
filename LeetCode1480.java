public class LeetCode1480 {
    public static int[] runningSum(int[] nums) {
        int n=nums.length;
        int temp[]= new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                temp[i]=nums[i];
            }
            else{
                temp[i]=nums[i]+temp[i-1];
            }
        }

        return temp;
    }
}
