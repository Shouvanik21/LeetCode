public class LeetCode1422 {
    public int maxScore(String s) {
        int totalOnes = 0;
        int zerosCount = 0;
        int onesCount = 0;
        int bestScore = Integer.MIN_VALUE;

        // Count total ones in the string
        for (char ch : s.toCharArray()) {
            if (ch == '1') totalOnes++;
        }

        // Traverse the string and calculate scores
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zerosCount++;
            else onesCount++;

            // Calculate score
            int currentScore = zerosCount + (totalOnes - onesCount);
            bestScore = Math.max(bestScore, currentScore);

        }

        return bestScore;
    }
}
