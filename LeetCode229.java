import java.util.ArrayList;
import java.util.List;

public class LeetCode229 {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                el1=nums[i];
            }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> ls= new ArrayList<>();

        int cnt3=0,cnt4=0;
        for(int i=0;i<nums.length;i++){            
            if(nums[i]==el1){
                cnt3++;
            }
            else if(nums[i]==el2){
                cnt4++;
            }
        }

        int mini=(int)(nums.length/3)+1;
        if(cnt3>=mini){
            ls.add(el1);
        }
        if(cnt4>=mini){
            ls.add(el2);
        }

        return ls;
    }
}
