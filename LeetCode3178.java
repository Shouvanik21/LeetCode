public class LeetCode3178 {
    public int numberOfChild(int n, int k) {
        int ballPosition = 0;
        int direction = 1;

        for (int i = 0; i < k; i++) {
            ballPosition += direction;

            if (ballPosition == n || ballPosition == -1) {
                direction *= -1;
                ballPosition += 2 * direction;
            }
        }

        return ballPosition;
    }
}
