public class LeetCode34 {
    public int lowerBound(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                //look for lower indices on the left
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int upperBound(int[] nums, int target) {
        int low=0,high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ans=mid;
                //look for lower indices on the left
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        int lb=lowerBound(nums,target);
        if(lb==nums.length || nums[lb]!=target){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        a[0]=lb;
        a[1]=upperBound(nums,target)-1;
        return a;
    }
}