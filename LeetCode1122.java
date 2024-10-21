public class LeetCode1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length=0;
        for(int i=0;i<arr1.length;i++){
            length=Math.max(length,arr1[i]);
        }

        int cnt[]=new int[length+1];
        for(int i=0;i<arr1.length;i++){
            cnt[arr1[i]]++;//counting the frequency of each element
        }

        int ans[]=new int[arr1.length];
        int indx=0;
        for(int i=0;i<arr2.length;i++){
            while(cnt[arr2[i]]>0){
                ans[indx]=arr2[i];
                indx++;
                cnt[arr2[i]]--;
            }
        }

        for(int i=0;i<cnt.length;i++){
            while(cnt[i]>0){
                ans[indx]=i;
                indx++;
                cnt[i]--;
            }
        }

        return ans;
    }
}
