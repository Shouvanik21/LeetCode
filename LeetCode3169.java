public class LeetCode3169 {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
         
         // Initialize count and last end day
         int count = 0;
         int lastEnd = 0;
         
         // Iterate through meetings
         for (int[] meeting : meetings) {
             int start = meeting[0];
             int end = meeting[1];
             
             // Check if there is a gap between last end and current meeting start
             if (start > lastEnd) {
                 count += start - lastEnd - 1;
             }
             
             // Update last end day
             lastEnd = Math.max(lastEnd, end);
         }
         
         // Add remaining days after the last meeting
         count += days - lastEnd;
         
         return count;
     }
}
