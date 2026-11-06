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
        var slow = head;
        var fast = head;

        if (head == null) {
            return false;
        }

        if (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
        } else {
            return false;
        }

        while (slow.next != null) {
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
