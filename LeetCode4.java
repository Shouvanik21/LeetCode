import java.util.ArrayList;
import java.util.List;

public class LeetCode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        
        //creating an ararylist to store the new merged array
        List<Integer> ls = new ArrayList<>();

        int i=0,j=0;
        //adding the elements in sorted fashion in the arraylist created
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                ls.add(nums1[i]);
                i++;
            }
            else{
                ls.add(nums2[j]);
                j++;
            }
        }

        //adding the leftout elements
        while(i<n1){
            ls.add(nums1[i]);
            i++;
        }
        while(j<n2){
            ls.add(nums2[j]);
            j++;
        }

        int n=n1+n2;
        if(n%2==1){
            return (double)(ls.get(n/2));
        }

        double med= ((double)ls.get(n/2)+(double)ls.get((n/2)-1))/2.0;
        return med;
    }
}
