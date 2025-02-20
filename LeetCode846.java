import java.util.Map;
import java.util.TreeMap;

public class LeetCode846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }

        // Frequency map
        Map<Integer, Integer> count = new TreeMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        // Iterate over the map
        for (int key : count.keySet()) {
            if (count.get(key) > 0) {
                for (int i = 1; i < groupSize; i++) {
                    if (count.getOrDefault(key + i, 0) < count.get(key)) {
                        return false;
                    }
                    count.put(key + i, count.get(key + i) - count.get(key));
                }
            }
        }
        return true;
    }
}
