public class LeetCode1752 {
    public boolean check(int[] nums) {
        int c=0;
        if(nums[0]<nums[nums.length-1]){
            c++;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                c++;
                if(c>1){
                    return false;
                }
            }
        }
        return true;
    }
}
