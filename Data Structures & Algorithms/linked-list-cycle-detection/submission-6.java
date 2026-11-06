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
        if (head == null){
            return false;
        }
        ListNode fast = head;
        if (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
        } else {
            return false;
        }
        ListNode slow = head;
        while (slow.next != null) {
            if (fast == null) {
                return false;
            }
            if (slow.equals(fast)) {
                return true;
            }
            slow = slow.next;
            if (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
        }
        return false;
    }
}
