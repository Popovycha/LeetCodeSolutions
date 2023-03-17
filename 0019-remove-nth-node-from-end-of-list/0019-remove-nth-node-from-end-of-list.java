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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        ListNode fast = temp, slow = temp;
        //fast going n times faster, than slow
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        //double triversal
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return temp.next;
    }
}