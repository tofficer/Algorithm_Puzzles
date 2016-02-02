public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        ListNode veryFast = head;
        while(veryFast != null && veryFast.next != null && veryFast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            veryFast = veryFast.next.next.next;
            if (slow == fast || slow == veryFast || fast == veryFast) return true;
        }
        return false;
    }
}
