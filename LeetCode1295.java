public class LeetCode1295 {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int r=0,c=0;
            while(nums[i]!=0){
                r=nums[i]%10;
                c++;
                nums[i]=nums[i]/10;
            }

            if(c%2==0){
                count++;
            }
        }

        return count;
    }
}
