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
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        var current = head;
        var next = head.next;
        ListNode temp;

        while (next != null) {
            temp = next;
            if (current == head) {
                current.next = null;
            }
            next = temp.next;
            temp.next = current;
            current = temp;
        }
        return current;
    }
}
