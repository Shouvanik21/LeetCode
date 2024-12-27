import java.util.ArrayList;
import java.util.List;

public class LeetCode729 {
    private List<int[]> calendar;

    public MyCalendar() {
        calendar = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] x : calendar) {
            if ((start < x[0] && end > x[0]) || (start == x[0]) || (start > x[0] && start < x[1])) {
                return false;
            }
        }
        calendar.add(new int[]{start, end});
        return true;
    }
}
