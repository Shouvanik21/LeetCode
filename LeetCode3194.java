public class LeetCode3194 {
    public double minimumAverage(int[] nums) {
        double avg[]=new double[nums.length/2];
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length/2;i++){
            int max_el=nums[nums.length-i-1];
            int min_el=nums[i]; 
            double add=(max_el+min_el)/2.0;
            avg[i]=add;
        }
        
        Arrays.sort(avg);
        return avg[0];
    }
}
