/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = null;
        ListNode fast = null;
        if(head != null && head.next != null){
            slow = head;
            fast = head.next;
        } else{
            return false;
        }
       
        while(true){
            if(fast.next == null){
                return false;
            } else if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
    }
}
