import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            //removing duplicats
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                //removing duplicates
                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                //applying 2 pointer approach
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum==target){
                        List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        //skipping the duplicates
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }

        return ans;
    }
}
