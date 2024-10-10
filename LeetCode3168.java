public class LeetCode3168 {
    public int minimumChairs(String s) {
        int occupancy = 0;
        int maxOccupancy = 0;

        for (char c : s.toCharArray()) {
            if (c == 'E') {
                occupancy++;
                maxOccupancy = Math.max(maxOccupancy, occupancy);
            } else if (c == 'L') {
                occupancy--;
            }
        }

        return maxOccupancy;
    }
}
