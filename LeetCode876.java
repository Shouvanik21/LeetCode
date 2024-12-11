public class LeetCode876 {
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        int cnt=0;
        while(temp.next!=null){
            temp=temp.next;
            cnt++;
        }
        int mid=(cnt+1)/2;
        while(mid>0){
            head=head.next;
            mid--;
        }
        return head;
    }
}
