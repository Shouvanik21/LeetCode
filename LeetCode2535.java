public class LeetCode2535 {
    public static int differenceOfSum(int[] nums) {
        int es=0,ds=0,r;
        for(int i=0;i<nums.length;i++){
            es+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            while(nums[j]>0){
                r=nums[j]%10;
                ds+=r;
                nums[j]=nums[j]/10;
            }
        }
        if(es>ds){
            return(es-ds);
        }
        else{
            return(ds-es);
        }
    }
}
