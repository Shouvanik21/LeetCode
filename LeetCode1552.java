import java.util.Arrays;

public class LeetCode1552 {
    private boolean canPlaceBalls(int[] position, int m, int minDist) {
        int count = 1; // place the first ball in the first basket
        int lastPosition = position[0];
        
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= minDist) {
                count++;
                lastPosition = position[i];
                if (count == m) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        
        int left = 1;
        int right = position[n-1] - position[0];
        int result = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceBalls(position, m, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
        
    }
}
