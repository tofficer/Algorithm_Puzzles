public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        int count = 0;
        ListNode test = head;
        while (count < k && test != null){
            test = test.next;
            count++;
        }
        if (count < k) return head;
        
        count = 0;
        while (count < k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if (next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
            

    }
}
