import java.util.ArrayList;

public class LeetCode912 {
    private static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        //if still some of the left elements are left
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        //if still some of the right elements are left
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        //converting from arraylist to array
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}
