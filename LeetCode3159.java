public class LeetCode3159 {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> indices = new ArrayList<>();
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == x) {
               indices.add(i);
           }
       }
       
       int[] answer = new int[queries.length];
       for (int i = 0; i < queries.length; i++) {
           int query = queries[i];
           if (query <= indices.size()) {
               answer[i] = indices.get(query - 1);
           } else {
               answer[i] = -1;
           }
       }
       return answer;
   }
}
