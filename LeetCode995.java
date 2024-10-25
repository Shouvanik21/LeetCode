public class LeetCode995 {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] flipCount = new int[n];
        int currentFlips = 0;
        int flipsNeeded = 0;

        for (int i = 0; i < n; ++i) {
            if (i >= k) {
                currentFlips ^= flipCount[i - k];
            }
            if (currentFlips==nums[i]) { // nums[i] needs a flip
                if (i + k > n) {
                    return -1; // Cannot flip from position i because it exceeds boundary
                }
                flipCount[i]=1;
                flipsNeeded++;
                currentFlips^=1;
            }
        }

        return flipsNeeded;
    }
}
