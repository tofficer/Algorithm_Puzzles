public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length <= 0) return null;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
                public int compare(ListNode l1, ListNode l2){
                    if (l1.val < l2.val) return -1;
                    else if (l1.val > l2.val) return 1;
                    else return 0;
                }
            });
            
        for (int i = 0; i < lists.length; i++){
            if (lists[i] != null) pq.add(lists[i]);
        }
        
        ListNode fake = new ListNode(0);
        ListNode curr = fake;
        
        while (pq.size() > 0){
            ListNode temp = pq.remove();
            if (temp.next != null) pq.add(temp.next);
            curr.next = temp;
            curr = curr.next;
        }
        return fake.next;
        
    }
}
