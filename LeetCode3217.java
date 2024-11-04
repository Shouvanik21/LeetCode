import java.util.HashSet;

public class LeetCode3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        
        // Dummy node to handle edge cases where head needs to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode current = head;
        
        while (current != null) {
            if (numsSet.contains(current.val)) {
                // Remove current node from the list
                prev.next = current.next;
            } else {
                // Move prev pointer forward
                prev = current;
            }
            // Move current pointer forward
            current = current.next;
        }
        
        // Return the head of modified linked list
        return dummy.next;
    }
}
