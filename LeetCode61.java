public class LeetCode61 {
    public ListNode findNthNode(ListNode temp,int k){
        int cnt=1;
        while(temp!=null){
            if(cnt==k){
                return temp;
            }
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }

        if(k%len==0){
            return head;
        }

        k=k%len;
        tail.next=head;

        ListNode newLastNode=findNthNode(head,len-k);
        head=newLastNode.next;
        newLastNode.next=null;

        return head;
    }
}