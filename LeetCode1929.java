public class LeetCode1929 {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int temp[]=new int[2*n];
        for(int i=0;i<n;i++){
          temp[i]=nums[i];
        }
        for(int j=0;j<n;j++){
            temp[j+n]=nums[j];
        }

        return temp;
}
