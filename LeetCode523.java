public class LeetCode523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();//the first one stores the remainder and the second one stores the index value
        map.put(0,-1);
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];//calculating the sum of subarray
            int rem=sum%k;//calculating the remainder

            if(map.containsKey(rem)){//if remmainder is found
                if(i-map.get(rem)>=2){//count the val of remainder occurs for how many no
                    return true;//if condn satisfy return true
                }
            }
            else{
                map.put(rem,i);//if not found add remainder and the index
            }
        }

        return false;//if condn not satisfy return false
    }
}
